SQLite seeding for FitTracker

This README explains how to populate a local SQLite DB with the exercises/muscle groups defined in `ExerciseLibrary.java`.

Files added:
- db/schema.sql       -- SQL schema (can be applied manually with sqlite3)
- db/seed.sql         -- small example seed (some sample entries)
- workout/ExerciseSeeder.java -- Java seeder that reflects over ExerciseLibrary and inserts entries into fittracker.db

Requirements
1) Java 11+ (or a JDK compatible with your project)
2) sqlite-jdbc jar (org.xerial:sqlite-jdbc). Download and place into a `lib\` folder (example path: `lib\sqlite-jdbc-3.42.0.0.jar`).

Quick run (Windows PowerShell)
1) Compile:
   javac -cp ".;lib\sqlite-jdbc-3.42.0.0.jar" workout\ExerciseSeeder.java

2) Run:
   java -cp ".;lib\sqlite-jdbc-3.42.0.0.jar" workout.ExerciseSeeder

This will create `fittracker.db` in the repository root and populate `muscle_groups` and `exercises` tables based on `ExerciseLibrary`.

Notes
- If you use Maven/Gradle, add the sqlite-jdbc dependency instead and run the seeder via your build system.
- After the DB exists you can query it with the sqlite CLI: `sqlite3 fittracker.db` then `SELECT * FROM exercises LIMIT 10;`.
- Later: you can build a small REST API (Express + better-sqlite3, or Java + JDBC) to expose exercise queries to the frontend.

If you'd like, I can also:
- Add a small Node Express API that serves GET /exercises and POST /routines endpoints using the SQLite DB.
- Create a migration script to copy current localStorage planned workouts/workout history into the DB.
