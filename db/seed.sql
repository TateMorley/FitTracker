-- Partial seed (examples) — the Java seeder will populate all entries from ExerciseLibrary

INSERT OR IGNORE INTO muscle_groups (name, heads) VALUES ('Biceps', 3);
INSERT OR IGNORE INTO muscle_groups (name, heads) VALUES ('Triceps', 3);

INSERT OR IGNORE INTO exercises (name, muscle_group_id, primary_head, classification)
VALUES ('Hammer Dumbbell Curl', (SELECT id FROM muscle_groups WHERE name='Biceps'), 'Brachialis', 'DUMBBELL');

INSERT OR IGNORE INTO exercises (name, muscle_group_id, primary_head, classification)
VALUES ('Cable Rope Tricep Pushdown', (SELECT id FROM muscle_groups WHERE name='Triceps'), 'Lateral Head', 'CABLE');

-- Use the Java seeder to populate the database from ExerciseLibrary for a complete import.
