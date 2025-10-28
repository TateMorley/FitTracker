package workout;

import java.lang.reflect.Field;
import java.sql.*;

/**
 * ExerciseSeeder
 *
 * Reads public static fields from ExerciseLibrary (muscleGroup and exercise objects)
 * and inserts them into a local SQLite database (fittracker.db).
 *
 * Requirements:
 * - sqlite-jdbc on the classpath (org.xerial:sqlite-jdbc)
 *
 * Run (Windows PowerShell example):
 * 1) download sqlite-jdbc jar and place it in lib\ (e.g. lib\sqlite-jdbc-3.42.0.0.jar)
 * 2) compile:
 *    javac -cp ".;lib\sqlite-jdbc-3.42.0.0.jar" workout\ExerciseSeeder.java
 * 3) run:
 *    java -cp ".;lib\sqlite-jdbc-3.42.0.0.jar" workout.ExerciseSeeder
 */
public class ExerciseSeeder {
    private static final String DB_URL = "jdbc:sqlite:fittracker.db";

    public static void main(String[] args) {
        System.out.println("Starting ExerciseSeeder...");
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            conn.setAutoCommit(false);
            createSchema(conn);
            seedMuscleGroups(conn);
            seedExercisesFromLibrary(conn);
            conn.commit();
            System.out.println("Seeding complete. Database file: fittracker.db");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Seeder failed: " + e.getMessage());
        }
    }

    private static void createSchema(Connection conn) throws SQLException {
        try (Statement s = conn.createStatement()) {
            s.execute("CREATE TABLE IF NOT EXISTS muscle_groups (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL UNIQUE, heads INTEGER);");
            s.execute("CREATE TABLE IF NOT EXISTS exercises (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, muscle_group_id INTEGER NOT NULL, primary_head TEXT, classification TEXT NOT NULL, FOREIGN KEY (muscle_group_id) REFERENCES muscle_groups(id));");
            s.execute("CREATE INDEX IF NOT EXISTS idx_exercises_muscle ON exercises(muscle_group_id);");
            s.execute("CREATE INDEX IF NOT EXISTS idx_exercises_name ON exercises(name);");
        }
    }

    private static void seedMuscleGroups(Connection conn) throws Exception {
        System.out.println("Seeding muscle groups from ExerciseLibrary...");
        PreparedStatement pst = conn.prepareStatement("INSERT OR IGNORE INTO muscle_groups(name, heads) VALUES (?, ?);");
        Field[] fields = ExerciseLibrary.class.getFields();
        for (Field f : fields) {
            if (f.getType() == muscleGroup.class) {
                muscleGroup mg = (muscleGroup) f.get(null);
                pst.setString(1, mg.getName());
                pst.setInt(2, mg.getHeads());
                pst.addBatch();
            }
        }
        pst.executeBatch();
        pst.close();
        System.out.println("Muscle groups seeded.");
    }

    private static void seedExercisesFromLibrary(Connection conn) throws Exception {
        System.out.println("Seeding exercises from ExerciseLibrary...");
        PreparedStatement pst = conn.prepareStatement(
                "INSERT OR IGNORE INTO exercises(name, muscle_group_id, primary_head, classification) VALUES (?, (SELECT id FROM muscle_groups WHERE name = ?), ?, ?);");
        Field[] fields = ExerciseLibrary.class.getFields();
        int count = 0;
        for (Field f : fields) {
            if (f.getType() == exercise.class) {
                exercise ex = (exercise) f.get(null);
                pst.setString(1, ex.getMovementName());
                pst.setString(2, ex.getMusclesWorked().getName());
                pst.setString(3, ex.getPrimaryHead());
                pst.setString(4, ex.getClassification().name());
                pst.addBatch();
                count++;
            }
        }
        pst.executeBatch();
        pst.close();
        System.out.println("Inserted " + count + " exercises.");
    }
}
