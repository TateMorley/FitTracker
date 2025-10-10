package workout;
import workout.ExerciseLibrary;

public class main {

    public static void main(String[] args) {
        
        

        workout eloiseWorkout = new workout("Eloise's Workout");

         
        set set1 = new set(10, 20, ExerciseLibrary.SUPINATED_DUMBBELL_CURL);
        set set2 = new set(8, 25, ExerciseLibrary.SUPINATED_DUMBBELL_CURL);
        set set3 = new set(6, 30, ExerciseLibrary.SUPINATED_DUMBBELL_CURL);
        set set4 = new set(12, 50, ExerciseLibrary.CABLE_ROPE_TRICEP_PUSHDOWN);
        set set5 = new set(10, 60, ExerciseLibrary.CABLE_ROPE_TRICEP_PUSHDOWN); 
        set set6 = new set(8, 70, ExerciseLibrary.CABLE_ROPE_TRICEP_PUSHDOWN);  

        eloiseWorkout.addSet(set1);
        eloiseWorkout.addSet(set2);
        eloiseWorkout.addSet(set3);
        eloiseWorkout.addSet(set4);
        eloiseWorkout.addSet(set5);
        eloiseWorkout.addSet(set6);
        
        System.out.println(eloiseWorkout.toString());
    }
}
