-- SQLite schema for FitTracker exercises

CREATE TABLE IF NOT EXISTS muscle_groups (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  name TEXT NOT NULL UNIQUE,
  heads INTEGER
);

CREATE TABLE IF NOT EXISTS exercises (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  name TEXT NOT NULL,
  muscle_group_id INTEGER NOT NULL,
  primary_head TEXT,
  classification TEXT NOT NULL,
  FOREIGN KEY (muscle_group_id) REFERENCES muscle_groups(id)
);

CREATE INDEX IF NOT EXISTS idx_exercises_muscle ON exercises(muscle_group_id);
CREATE INDEX IF NOT EXISTS idx_exercises_name ON exercises(name);
