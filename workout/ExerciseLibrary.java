package workout;

public class ExerciseLibrary {
    public static final muscleGroup BICEPS = new muscleGroup("Biceps", 3, new String[] { "Long Head", "Short Head", "Brachialis" });
    public static final muscleGroup TRICEPS = new muscleGroup("Triceps", 3, new String[] { "Long Head", "Lateral Head", "Medial Head" });
    public static final muscleGroup CHEST = new muscleGroup("Chest", 2, new String[] { "Upper Chest", "Lower Chest" });
    public static final muscleGroup BACK = new muscleGroup("Back", 4, new String[] { "Traps", "Middle Back", "Lower Back", "Lats" });
    public static final muscleGroup SHOULDERS = new muscleGroup("Shoulders", 3, new String[] { "Front deltoid", "Side deltoid", "Rear deltoid" });
    public static final muscleGroup LEGS = new muscleGroup("Legs", 4, new String[] { "Quads", "Hamstrings", "Glutes", "Calves", "Adductors", "Abductors" });
    public static final muscleGroup ABS = new muscleGroup("Abs", 3, new String[] { "Upper abs", "Lower abs", "Obliques" });
    public static final muscleGroup FOREARMS = new muscleGroup("Forearms", 2, new String[] { "Inner Forearms", "Outer Forearms" });

    // BICEPS EXERCISES--------------------------------------------
    // Machine exercises
    public static final exercise MACHINE_CURL = new exercise("Machine Curl", BICEPS, "Long Head", exercise.Classification.MACHINE);
    public static final exercise PREACHER_CURL_MACHINE = new exercise("Preacher Curl Machine", BICEPS, "Short Head", exercise.Classification.MACHINE);
    public static final exercise HAMMER_CURL_MACHINE = new exercise("Hammer Curl Machine", BICEPS, "Brachialis", exercise.Classification.MACHINE);
    // Dumbbell exercises
    public static final exercise SUPINATED_DUMBBELL_CURL = new exercise("Supinated Dumbbell Curl", BICEPS, "Long Head", exercise.Classification.DUMBBELL);
    public static final exercise HAMMER_DUMBBELL_CURL = new exercise("Hammer Dumbbell Curl", BICEPS, "Brachialis", exercise.Classification.DUMBBELL);
    public static final exercise INCLINE_DUMBBELL_CURL = new exercise("Inlcine Dumbbell Curl", BICEPS, "Long Head", exercise.Classification.DUMBBELL);
    public static final exercise CONCENTRATION_CURL = new exercise("Concentration Curl", BICEPS, "Short Head", exercise.Classification.DUMBBELL);
    public static final exercise ZOTTMAN_CURL = new exercise("Zottman Curl", BICEPS, "Brachialis", exercise.Classification.DUMBBELL);
    public static final exercise CROSS_BODY_HAMMER_CURL = new exercise("Cross body Hammer Curl", BICEPS, "Brachialis", exercise.Classification.DUMBBELL);
    public static final exercise SPIDER_DUMBBELL_CURL = new exercise("Spider Dumbbell Curl", BICEPS, "Short Head", exercise.Classification.DUMBBELL);
    public static final exercise PREACHER_DUMBBELL_CURL = new exercise("Preacher Dumbbell Curl", BICEPS, "Short Head", exercise.Classification.DUMBBELL);
    public static final exercise PREACHER_HAMMER_CURL = new exercise("Preacher Hammer Curl", BICEPS, "Brachialis", exercise.Classification.DUMBBELL);
    public static final exercise INCLINE_DUMBBELL_HAMMER_CURL = new exercise("Inlcine Dumbbell Hammer Curl", BICEPS, "Brachialis", exercise.Classification.DUMBBELL);
    // Barbell exercises
    public static final exercise SUPINATED_BARBELL_CURL = new exercise("Barbell Curl", BICEPS, "Long Head", exercise.Classification.BARBELL);
    public static final exercise BARBELL_PREACHER_CURL = new exercise("Barbell Preacher Curl", BICEPS, "Short Head", exercise.Classification.BARBELL);
    public static final exercise BARBELL_SPIDER_CURL = new exercise("Barbell Spider Curl", BICEPS, "Short Head", exercise.Classification.BARBELL);
    public static final exercise EZ_BAR_CURL = new exercise("EZ Bar Curl", BICEPS, "Long Head", exercise.Classification.BARBELL);
    public static final exercise EZ_BAR_PREACHER_CURL = new exercise("EZ Bar Preacher Curl", BICEPS, "Short Head", exercise.Classification.BARBELL);
    public static final exercise EZ_BAR_SPIDER_CURL = new exercise("EZ Bar Spider Curls", BICEPS, "Short Head", exercise.Classification.BARBELL);
    // Plate exercises
    public static final exercise PLATE_CURL = new exercise("Plate Curl", BICEPS, "Long Head", exercise.Classification.PLATE);
    public static final exercise PLATE_HAMMER_CURL = new exercise("Plate Hammer Curl", BICEPS, "Brachialis", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_PREACHER_CURL = new exercise("Plate Loaded Preacher Curl", BICEPS, "Short Head", exercise.Classification.PLATE);
    // Cable exercises
    public static final exercise CABLE_SUPINATED_CURL = new exercise("Cable Supinated Curl", BICEPS, "Long Head", exercise.Classification.CABLE);
    public static final exercise CABLE_ROPE_HAMMER_CURL = new exercise("Cable Rope Hammer Curl", BICEPS, "Brachialis", exercise.Classification.CABLE);
    public static final exercise BAYESIAN_CABLE_CURL = new exercise("Bayesian Cable Curl", BICEPS, "Short Head", exercise.Classification.CABLE);
    public static final exercise CABLE_INCLINE_CURL = new exercise("Cable Inlcine Curl", BICEPS, "Long Head", exercise.Classification.CABLE);
    public static final exercise CABLE_PREACHER_CURL = new exercise("Cable Preacher Curl", BICEPS, "Short Head", exercise.Classification.CABLE);
    public static final exercise CABLE_SPIDER_CURL = new exercise("Cable Spider Curl", BICEPS, "Short Head", exercise.Classification.CABLE);
    public static final exercise CRUCIFIX_CURL = new exercise("Crucifix Curl", BICEPS, "Long Head", exercise.Classification.CABLE);
    // Calisthenic exercises
    public static final exercise NEUTRAL_GRIP_PULL_UP = new exercise("Neutral Grip pull up", BICEPS, "Brachialis", exercise.Classification.CALISTHENIC);
    public static final exercise BODYWEIGHT_CURL = new exercise("Bodyweight Curl", BICEPS, "Long Head", exercise.Classification.CALISTHENIC);
    // Other exercises

    // TRIPCES EXERCISES-------------------------------------------
    // Machine exercises
    public static final exercise TRICEP_PUSHDOWN_MACHINE = new exercise("Tricep Pushdown Machine", TRICEPS, "Lateral Head", exercise.Classification.MACHINE);
    public static final exercise OVERHEAD_TRICEP_EXTENSION_MACHINE = new exercise("Overhead Tricep Extension Machine", TRICEPS, "Long Head", exercise.Classification.MACHINE);
    public static final exercise TRICEP_DIP_MACHINE = new exercise("Tricep Dip Machine", TRICEPS, "Medial Head", exercise.Classification.MACHINE);
    public static final exercise SMITH_JM_PRESS = new exercise("Smith JM Press", TRICEPS, "Long Head", exercise.Classification.MACHINE);
    public static final exercise SMITH_SKULLCRUSHER = new exercise("Smith Skullcrusher", TRICEPS, "Long Head", exercise.Classification.MACHINE);
    public static final exercise SMITH_CLOSE_GRIP_BENCH = new exercise("Smith Close Grip Bench", TRICEPS, "Lateral Head", exercise.Classification.MACHINE);
    public static final exercise TRICEP_EXTENSION_MACHINE = new exercise("Tricep Extension Machine", TRICEPS, "Long Head", exercise.Classification.MACHINE);
    public static final exercise ASSISTED_TRICEP_DIP_MACHINE = new exercise("Assisted Tricep Dip Machine", TRICEPS, "Medial Head", exercise.Classification.MACHINE);
    // Dumbbell exercises
    public static final exercise DUMBBELL_TRICEP_KICKBACK = new exercise("Dumbbell Tricep Kickback", TRICEPS, "Lateral Head", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_OVERHEAD_TRICEP_EXTENSION = new exercise("Dumbbell Overhead Tricep Extension", TRICEPS, "Long Head", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_SKULLCRUSHER = new exercise("Dumbbell Skullcrusher", TRICEPS, "Long Head", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_CLOSE_GRIP_BENCH = new exercise("Dumbbell Close Grip Press", TRICEPS, "Lateral Head", exercise.Classification.DUMBBELL);
    // Barbell exercises
    public static final exercise EZ_BAR_SKULLCRUSHER = new exercise("EZ Bar Skullcrusher", TRICEPS, "Long Head", exercise.Classification.BARBELL);
    public static final exercise BARBELL_SKULLCRUSHER = new exercise("Barbell Skullcrusher", TRICEPS, "Long Head", exercise.Classification.BARBELL);
    public static final exercise BARBELL_CLOSE_GRIP_BENCH = new exercise("Barbell Close Grip Bench", TRICEPS, "Lateral Head", exercise.Classification.BARBELL);
    public static final exercise BARBELL_OVERHEAD_TRICEP_EXTENSION = new exercise("Barbell Overhead Tricep Extension", TRICEPS, "Long Head", exercise.Classification.BARBELL);
    public static final exercise EZ_BAR_JM_PRESS = new exercise("EZ Bar JM Press", TRICEPS, "Long Head", exercise.Classification.BARBELL);
    public static final exercise BARBELL_JM_PRESS = new exercise("Barbell JM Press", TRICEPS, "Long Head", exercise.Classification.BARBELL);
    // Plate exercises
    public static final exercise PLATE_OVERHEAD_TRICEP_EXTENSION = new exercise("Plate Overhead Tricep Extension", TRICEPS, "Long Head", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_DIP_MACHINE = new exercise("Plate Loaded Dip Machine", TRICEPS, "Medial Head", exercise.Classification.PLATE);
    // Cable exercises
    public static final exercise CABLE_ROPE_TRICEP_PUSHDOWN = new exercise("Cable Rope Tricep Pushdown", TRICEPS, "Lateral Head", exercise.Classification.CABLE);
    public static final exercise CABLE_OVERHEAD_TRICEP_EXTENSION = new exercise("Cable Overhead Tricep Extension", TRICEPS, "Long Head", exercise.Classification.CABLE);
    public static final exercise CABLE_V_BAR_TRICEP_PUSHDOWN = new exercise("Cable V-Bar Tricep Pushdown", TRICEPS, "Lateral Head", exercise.Classification.CABLE);
    public static final exercise CABLE_SINGLE_ARM_TRICEP_EXTENSION = new exercise("Cable Single Arm Tricep Extension", TRICEPS, "Long Head", exercise.Classification.CABLE);
    public static final exercise CABLE_REVERSE_GRIP_TRICEP_PUSHDOWN = new exercise("Cable Reverse Grip Tricep Pushdown", TRICEPS, "Medial Head", exercise.Classification.CABLE);
    public static final exercise CABLE_STRAIGHT_BAR_TRICEP_PUSHDOWN = new exercise("Cable Straight Bar Tricep Pushdown", TRICEPS, "Lateral Head", exercise.Classification.CABLE);
    public static final exercise CABLE_CROSS_BODY_EXTENSION = new exercise("Cable Cross Body Extension", TRICEPS, "Long Head", exercise.Classification.CABLE);
    public static final exercise CABLE_SKULLCRUSHER = new exercise("Cable Skullcrusher", TRICEPS, "Long Head", exercise.Classification.CABLE);
    public static final exercise UPRIGHT_CABLE_KICKBACK = new exercise("Upright Cable Kickback", TRICEPS, "Lateral Head", exercise.Classification.CABLE);
    public static final exercise BENT_OVER_CABLE_KICKBACK = new exercise("Bent Over Cable Kickback", TRICEPS, "Lateral Head", exercise.Classification.CABLE);
    public static final exercise KATANA_EXTENSION = new exercise("Katana-Extension", TRICEPS, "Long Head", exercise.Classification.CABLE);
    // Calisthenic exercises
    public static final exercise TRICEP_DIP = new exercise("Tricep Dip", TRICEPS, "Medial Head", exercise.Classification.CALISTHENIC);
    public static final exercise CLOSE_GRIP_PUSH_UP = new exercise("Close Grip Push Up", TRICEPS, "Lateral Head", exercise.Classification.CALISTHENIC);
    public static final exercise BENCH_DIP = new exercise("Bench Dip", TRICEPS, "Medial Head", exercise.Classification.CALISTHENIC);
    public static final exercise BODYWEIGHT_TRICEP_EXTENSION = new exercise("Bodyweight Tricep Extension", TRICEPS, "Long Head", exercise.Classification.CALISTHENIC);
    public static final exercise DIAMOND_PUSH_UP = new exercise("Diamond Push Up", TRICEPS, "Lateral Head", exercise.Classification.CALISTHENIC);
    // Other exercises

    // CHEST EXERCISES---------------------------------------------
    // Machine exercises
    public static final exercise CHEST_PRESS_MACHINE = new exercise("Chest Press Machine", CHEST, "Lower Chest", exercise.Classification.MACHINE);
    public static final exercise PEC_DECK_MACHINE = new exercise("Pec Deck Machine", CHEST, "Upper Chest", exercise.Classification.MACHINE);
    public static final exercise INCLINE_CHEST_PRESS_MACHINE = new exercise("Inlcine Chest Press Machine", CHEST, "Upper Chest", exercise.Classification.MACHINE);
    public static final exercise DECLINE_CHEST_PRESS_MACHINE = new exercise("Decline Chest Press Machine", CHEST, "Lower Chest", exercise.Classification.MACHINE);
    public static final exercise CHEST_FLY_MACHINE = new exercise("Chest Fly Machine", CHEST, "Upper Chest", exercise.Classification.MACHINE);
    public static final exercise SMITH_BENCH_PRESS = new exercise("Smith Bench Press", CHEST, "Lower Chest", exercise.Classification.MACHINE);
    public static final exercise SMITH_INCLINE_BENCH_PRESS = new exercise("Smith Inlcine Bench Press", CHEST, "Upper Chest", exercise.Classification.MACHINE);
    public static final exercise SMITH_DECLINE_BENCH_PRESS = new exercise("Smith Decline Bench Press", CHEST, "Lower Chest", exercise.Classification.MACHINE);
    public static final exercise INCLINE_CHEST_FLY_MACHINE = new exercise("Inlcine Chest Fly Machine", CHEST, "Upper Chest", exercise.Classification.MACHINE);
    public static final exercise STANDING_CHEST_PRESS_MACHINE = new exercise("Standing Chest Press Machine", CHEST, "Lower Chest", exercise.Classification.MACHINE);
    public static final exercise WIDE_CHEST_PRESS_MACHINE = new exercise("Wide Chest Press Machine", CHEST, "Upper Chest", exercise.Classification.MACHINE);
    // Dumbbell exercises
    public static final exercise DUMBBELL_BENCH_PRESS = new exercise("Dumbbell Bench Press", CHEST, "Lower Chest", exercise.Classification.DUMBBELL);
    public static final exercise INCLINE_DUMBBELL_BENCH_PRESS = new exercise("Inlcine Dumbbell Bench Press", CHEST, "Upper Chest", exercise.Classification.DUMBBELL);
    public static final exercise DECLINE_DUMBBELL_BENCH_PRESS = new exercise("Decline Dumbbell Bench Press", CHEST, "Lower Chest", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_CHEST_FLY = new exercise("Dumbbell Chest Fly", CHEST, "Upper Chest", exercise.Classification.DUMBBELL);
    public static final exercise INCLINE_DUMBBELL_CHEST_FLY = new exercise("Inlcine Dumbbell Chest Fly", CHEST, "Upper Chest", exercise.Classification.DUMBBELL);
    public static final exercise DECLINE_DUMBBELL_CHEST_FLY = new exercise("Decline Dumbbell Chest Fly", CHEST, "Lower Chest", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_PULLOVER = new exercise("Dumbbell Pullover", CHEST, "Upper Chest", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_HEX_PRESS = new exercise("Dumbbell Hex Press", CHEST, "Lower Chest", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBEL_COFFIN_PRESS = new exercise("Dumbbell Coffin Press", CHEST, "Lower Chest", exercise.Classification.DUMBBELL);
    // Barbell exercises
    public static final exercise BARBELL_BENCH_PRESS = new exercise("Barbell Bench Press", CHEST, "Lower Chest", exercise.Classification.BARBELL);
    public static final exercise INCLINE_BARBELL_BENCH_PRESS = new exercise("Inlcine Barbell Bench Press", CHEST, "Upper Chest", exercise.Classification.BARBELL);
    public static final exercise DECLINE_BARBELL_BENCH_PRESS = new exercise("Decline Barbell Bench Press", CHEST, "Lower Chest", exercise.Classification.BARBELL);
    public static final exercise BARBELL_COFFIN_PRESS = new exercise("Barbell Coffin Press", CHEST, "Lower Chest", exercise.Classification.BARBELL);
    // Plate exercises
    public static final exercise PLATE_LOADED_UPRIGHT_PRESS = new exercise("Plate Loaded upright Press", CHEST, "Lower Chest", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_INCLINE_PRESS = new exercise("Plate Loaded Inlcine Press", CHEST, "Upper Chest", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_CHEST_FLY = new exercise("Plate Loaded Chest Fly", CHEST, "Upper Chest", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_DECLINE_PRESS = new exercise("Plate Loaded Decline Press", CHEST, "Lower Chest", exercise.Classification.PLATE);
    public static final exercise LYING_PLATE_LOADED_CHEST_PRESS = new exercise("Lying Plate Loaded Chest Press", CHEST, "Lower Chest", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_STANDING_CHEST_PRESS = new exercise("Plate Loaded Standing Chest Press", CHEST, "Lower Chest", exercise.Classification.PLATE);
    // Cable exercises
    public static final exercise CABLE_CROSSOVER = new exercise("Cable Crossover", CHEST, "Upper Chest", exercise.Classification.CABLE);
    public static final exercise LOW_TO_HIGH_CABLE_FLY = new exercise("Low to High Cable Fly", CHEST, "Upper Chest", exercise.Classification.CABLE);
    public static final exercise HIGH_TO_LOW_CABLE_FLY = new exercise("High to Low Cable Fly", CHEST, "Lower Chest", exercise.Classification.CABLE);
    public static final exercise CABLE_CHEST_PRESS = new exercise("Cable Chest Press", CHEST, "Lower Chest", exercise.Classification.CABLE);
    public static final exercise INCLINE_CABLE_CHEST_PRESS = new exercise("Inlcine Cable Chest Press", CHEST, "Upper Chest", exercise.Classification.CABLE);
    public static final exercise DECLINE_CABLE_CHEST_PRESS = new exercise("Decline Cable Chest Press", CHEST, "Lower Chest", exercise.Classification.CABLE);
    public static final exercise CABLE_CHEST_FLY = new exercise("Cable Chest Fly", CHEST, "Upper Chest", exercise.Classification.CABLE);
    public static final exercise INCLINE_CABLE_CHEST_FLY = new exercise("Inlcine Cable Chest Fly", CHEST, "Upper Chest", exercise.Classification.CABLE);
    public static final exercise SEATED_CABLE_CHEST_PRESS = new exercise("Seated Cable Chest Press", CHEST, "Lower Chest", exercise.Classification.CABLE);
    public static final exercise SEATED_CABLE_CHEST_FLY = new exercise("Seated Cable Chest Fly", CHEST, "Upper Chest", exercise.Classification.CABLE);
    // Calisthenic exercises
    public static final exercise PUSH_UP = new exercise("Push Up", CHEST, "Lower Chest", exercise.Classification.CALISTHENIC);
    public static final exercise INCLINE_PUSH_UP = new exercise("Inlcine Push Up", CHEST, "Upper Chest", exercise.Classification.CALISTHENIC);
    public static final exercise DECLINE_PUSH_UP = new exercise("Decline Push Up", CHEST, "Lower Chest", exercise.Classification.CALISTHENIC);
    public static final exercise WIDE_PUSH_UP = new exercise("Wide Push Up", CHEST, "Upper Chest", exercise.Classification.CALISTHENIC);
    public static final exercise CHEST_DIP = new exercise("Chest Dip", CHEST, "Lower Chest", exercise.Classification.CALISTHENIC);
    public static final exercise KNEELING_PUSH_UP = new exercise("Kneeling Push Up", CHEST, "Lower Chest", exercise.Classification.CALISTHENIC);
    public static final exercise KNEELING_INCLINE_PUSH_UP = new exercise("kneeling Inlcine Push Up", CHEST, "Upper Chest", exercise.Classification.CALISTHENIC);
    public static final exercise ARCHER_PUSH_UP = new exercise("Archer Push Up", CHEST, "Lower Chest", exercise.Classification.CALISTHENIC);
    // Other exercises

    // BACK EXERCISES----------------------------------------------
    // Machine exercises
    public static final exercise LAT_PULLODOWN_MACHINE = new exercise("Lat Pulldown Machine", BACK, "Lats", exercise.Classification.MACHINE);
    public static final exercise NEUTRAL_GRIP_ROW_MACHINE = new exercise("Neutral Grip Row Machine", BACK, "Lats", exercise.Classification.MACHINE);
    public static final exercise WIDE_GRIP_ROW_MACHINE = new exercise("Wide Grip Row Machine", BACK, "Middle Back", exercise.Classification.MACHINE);
    public static final exercise NEUTRAL_GRIP_SEATED_ROW = new exercise("Seated Row", BACK, "Lats", exercise.Classification.MACHINE);
    public static final exercise WIDE_GRIP_SEATED_ROW = new exercise("Wide Grip Seated Row", BACK, "Middle Back", exercise.Classification.MACHINE);
    public static final exercise MEDIUM_GRIP_SEATED_ROW = new exercise("Medium Grip Seated Row", BACK, "Middle Back", exercise.Classification.MACHINE);
    public static final exercise NEUTRAL_GRIP_LAT_PULLDOWN = new exercise("Neutral Grip Lat Pulldown", BACK, "Lats", exercise.Classification.MACHINE);
    public static final exercise MEDIUM_GRIP_LAT_PULLDOWN = new exercise("Medium Grip Lat Pulldown", BACK, "Lats", exercise.Classification.MACHINE);
    public static final exercise MEDIUM_NEUTRAL_GRIP_LAT_PULLDOWN = new exercise("Medium Neutral Grip Lat Pulldown", BACK, "Lats", exercise.Classification.MACHINE);
    public static final exercise WIDE_GRIP_LAT_PULLDOWN = new exercise("Wide Grip Lat Pulldown", BACK, "Lats", exercise.Classification.MACHINE);
    public static final exercise WIDE_NEUTRAL_GRIP_LAT_PULLDOWN = new exercise("Wide Neutral Grip Lat Pulldown", BACK, "Lats", exercise.Classification.MACHINE);
    public static final exercise BACK_EXTENSION_MACHINE = new exercise("Back Extension Machine", BACK, "Lower Back", exercise.Classification.MACHINE);
    public static final exercise SMITH_BENT_OVER_ROW = new exercise("Smith Bent Over Row", BACK, "Lats", exercise.Classification.MACHINE);
    public static final exercise LOW_ROW_MACHINE = new exercise("Low Row Machine", BACK, "Lats", exercise.Classification.MACHINE);
    public static final exercise HIGH_ROW_MACHINE = new exercise("High Row Machine", BACK, "Lats", exercise.Classification.MACHINE);
    public static final exercise KNEELING_CABLE_ROW = new exercise("Kneeling Cable Row", BACK, "Lats", exercise.Classification.MACHINE);
    // Dumbbell exercises
    public static final exercise DUMBBELL_GORILLA_ROW = new exercise("Dumbbell Gorilla Row", BACK, "Lats", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_RENEGADE_ROW = new exercise("Dumbbell Renegade Row", BACK, "Lats", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_SHRUG = new exercise("Dumbbell Shrug", BACK, "Traps", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_BENT_OVER_ROW = new exercise("Dumbbell Bent Over Row", BACK, "Lats", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_INCLINE_ROW = new exercise("Dumbbell Incline Row", BACK, "Middle Back", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_LAT_PULLOVER = new exercise("Dumbbell Lat Pullover", BACK, "Lats", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_KELSO_SHRUG = new exercise("Dumbbell Kelso Shrug", BACK, "Middle Back", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_BACK_EXTENSION = new exercise("Dumbbell Back Extension", BACK, "Lower Back", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_WIDE_ROW = new exercise("Dumbbell Wide Row", BACK, "Middle Back", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_INCLINE_SHRUGS = new exercise("Dumbbell Incline Shrugs", BACK, "Traps", exercise.Classification.DUMBBELL);
    // Barbell exercises
    public static final exercise BARBELL_BENT_OVER_ROW = new exercise("Barbell Bent Over Row", BACK, "Lats", exercise.Classification.BARBELL);
    public static final exercise BARBELL_BENT_OVER_UNDERHAND_ROW = new exercise("Barbell Bent Over Underhand Row", BACK, "Lats", exercise.Classification.BARBELL);
    public static final exercise BARBELL_SHRUG = new exercise("Barbell Shrug", BACK, "Traps", exercise.Classification.BARBELL);
    public static final exercise BARBELL_CLOSE_GRIP_LANDMINE_ROW = new exercise("Barbell Close Grip Landmine Row", BACK, "Lats", exercise.Classification.BARBELL);
    public static final exercise BARBELL_WIDE_GRIP_LANDMINE_ROW = new exercise("Barbell Wide Grip Landmine Row", BACK, "Middle Back", exercise.Classification.BARBELL);
    public static final exercise BARBELL_MEADOWS_ROW = new exercise("Barbell Meadows Row", BACK, "Middle Back", exercise.Classification.BARBELL);
    // Plate exercises
    public static final exercise PLATE_LOADED_HIGH_ROW = new exercise("Plate Loaded High Row", BACK, "Lats", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_LOW_ROW = new exercise("Plate Loaded Low Row", BACK, "Lats", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_SHRUG = new exercise("Plate Loaded Shrug", BACK, "Traps", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_WIDE_ROW = new exercise("Plate Loaded Wide Row", BACK, "Lats", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_ROW = new exercise("Plate Loaded Row", BACK, "Lats", exercise.Classification.PLATE);
    public static final exercise BENT_OVER_T_BAR_ROW = new exercise("Bent Over T-Bar Row", BACK, "Middle Back", exercise.Classification.PLATE);
    public static final exercise SUPPORTED_T_BAR_ROW = new exercise("Supported T-Bar Row", BACK, "Middle Back", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_BACK_EXTENSION = new exercise("Plate Loaded Back Extension", BACK, "Lower Back", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_KELSO_SHRUG = new exercise("Plate Loaded Kelso Shrug", BACK, "Middle Back", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_LAT_PULLDOWN = new exercise("Plate Loaded Lat Pulldown", BACK, "Lats", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_LAT_PULLOVER = new exercise("Plate Loaded Lat Pullover", BACK, "Lats", exercise.Classification.PLATE);
    public static final exercise PLATE_BACK_EXTENSION = new exercise("Plate Back Extension", BACK, "Lower Back", exercise.Classification.PLATE);
    // Cable exercises
    public static final exercise CABLE_KNEELING_LAT_PULLDOWN = new exercise("Cable Kneeling Lat Pulldown", BACK, "Lats", exercise.Classification.CABLE);
    public static final exercise CABLE_FACE_PULL = new exercise("Cable Face Pull", BACK, "Middle Back", exercise.Classification.CABLE);
    public static final exercise CABLE_STRAIGHT_ARM_PULLOVER = new exercise("Cable Straight Arm Pullover", BACK, "Lats", exercise.Classification.CABLE);
    public static final exercise CABLE_BENT_OVER_ROW = new exercise("Cable Bent Over Row", BACK, "Lats", exercise.Classification.CABLE);
    public static final exercise CABLE_SHRUG = new exercise("Cable Shrugs", BACK, "Traps", exercise.Classification.CABLE);
    public static final exercise CABLE_KEENAN_FLAPS = new exercise("Cable Keenan Flaps", BACK, "Lats", exercise.Classification.CABLE);
    public static final exercise CABLE_LAT_PULL_AROUND = new exercise("Cable Lat Pull Around", BACK, "Lats", exercise.Classification.CABLE);
    // Calisthenic exercises
    public static final exercise PULL_UP = new exercise("Pull Up", BACK, "Lats", exercise.Classification.CALISTHENIC);
    public static final exercise CHIN_UP = new exercise("Chin Up", BACK, "Lats", exercise.Classification.CALISTHENIC);
    public static final exercise BODYWEIGHT_ROW = new exercise("Bodyweight Row", BACK, "Middle Back", exercise.Classification.CALISTHENIC);
    public static final exercise INVERTED_ROW = new exercise("Inverted Row", BACK, "Middle Back", exercise.Classification.CALISTHENIC);
    public static final exercise BODYWEIGHT_BACK_EXTENSION = new exercise("Bodyweight Back Extension", BACK, "Lower Back", exercise.Classification.CALISTHENIC);
    // Other exercises
    public static final exercise TRAP_BAR_SHRUG = new exercise("Trap Bar Shrug", BACK, "Traps", exercise.Classification.OTHER);

    // Shoulder Exercises------------------------------------------
    // Machine exercises
    public static final exercise SHOULDER_PRESS_MACHINE = new exercise("Shoulder Press Machine", SHOULDERS, "Front deltoid", exercise.Classification.MACHINE);
    public static final exercise SEATED_SHOULDER_PRESS_MACHINE = new exercise("Seated Shoulder Press Machine", SHOULDERS, "Front deltoid", exercise.Classification.MACHINE);
    public static final exercise CONVERGING_OVERHEAD_PRESS_MACHINE = new exercise("Converging Overhead Press Machine", SHOULDERS, "Front deltoid", exercise.Classification.MACHINE);
    public static final exercise SEATED_LATERAL_RAISE_MACHINE = new exercise("Seated Lateral Raise Machine", SHOULDERS, "Side deltoid", exercise.Classification.MACHINE);
    public static final exercise STANDING_LATERAL_RAISE_MACHINE = new exercise("Standing Lateral Raise Machine", SHOULDERS, "Side deltoid", exercise.Classification.MACHINE);
    public static final exercise REVERSE_PEC_DECK = new exercise("Reverse Pec Deck", SHOULDERS, "Rear deltoid", exercise.Classification.MACHINE);
    public static final exercise SMITH_SEATED_SHOULDER_PRESS = new exercise("Smith Shoulder Press", SHOULDERS, "Front deltoid", exercise.Classification.MACHINE);
    public static final exercise SMITH_ARNOLD_PRESS = new exercise("Smith Arnold Press", SHOULDERS, "Front deltoid", exercise.Classification.MACHINE);
    public static final exercise SMITH_SHOULDER_PRESS = new exercise("Smith Shoulder Press", SHOULDERS, "Front deltoid", exercise.Classification.MACHINE);
    public static final exercise SMITH_BEHIND_THE_NECK_PRESS = new exercise("Smith Behind the Neck Press", SHOULDERS, "Front deltoid", exercise.Classification.MACHINE);
    public static final exercise SMITH_UPRIGHT_ROW = new exercise("Smith Upright Row", SHOULDERS, "Side deltoid", exercise.Classification.MACHINE);
    public static final exercise VIKING_PRESS_MACHINE = new exercise("Viking Press Machine", SHOULDERS, "Front deltoid", exercise.Classification.MACHINE);
    // Dumbbell exercises
    public static final exercise SEATED_DUMBBELL_SHOULDER_PRESS = new exercise("Seated Dumbbell Shoulder Press", SHOULDERS, "Front deltoid", exercise.Classification.DUMBBELL);
    public static final exercise STANDING_DUMBBELL_SHOULDER_PRESS = new exercise("Standing Dumbbell Shoulder Press", SHOULDERS, "Front deltoid", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_ARNOLD_PRESS = new exercise("Dumbbell Arnold Press", SHOULDERS, "Front deltoid", exercise.Classification.DUMBBELL);
    public static final exercise STANDING_DUMBBELL_LATERAL_RAISE = new exercise("Standing Dumbbell Lateral Raise", SHOULDERS, "Side deltoid", exercise.Classification.DUMBBELL);
    public static final exercise SEATED_DUMBBELL_LATERAL_RAISE = new exercise("Seated Dumbbell Lateral Raise", SHOULDERS, "Side deltoid", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_REAR_DELT_FLY = new exercise("Dumbbell Rear Delt Fly", SHOULDERS, "Rear deltoid", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_UPRIGHT_ROW = new exercise("Dumbbell Upright Row", SHOULDERS, "Side deltoid", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_FRONT_RAISE = new exercise("Dumbbell Front Raise", SHOULDERS, "Front deltoid", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_Y_RAISE = new exercise("Dumbbell Y Raise", SHOULDERS, "Rear deltoid", exercise.Classification.DUMBBELL);
    // Barbell exercises
    public static final exercise STANDING_BARBELL_OVERHEAD_PRESS = new exercise("Standing Barbell Overhead Press", SHOULDERS, "Front deltoid", exercise.Classification.BARBELL);
    public static final exercise SEATED_BARBELL_OVERHEAD_PRESS = new exercise("Seated Barbell Overhead Press", SHOULDERS, "Front deltoid", exercise.Classification.BARBELL);
    public static final exercise STANDING_BEHIND_THE_NECK_PRESS = new exercise("Standing Behind the Neck Press", SHOULDERS, "Front deltoid", exercise.Classification.BARBELL);
    public static final exercise SEATED_BEHIND_THE_NECK_PRESS = new exercise("Seated Behind the Neck Press", SHOULDERS, "Front deltoid", exercise.Classification.BARBELL);
    public static final exercise BARBELL_UPRIGHT_ROW = new exercise("Barbell Upright Row", SHOULDERS, "Side deltoid", exercise.Classification.BARBELL);
    public static final exercise BARBELL_FRONT_RAISE = new exercise("Barbell Front Raise", SHOULDERS, "Front deltoid", exercise.Classification.BARBELL);
    public static final exercise BARBELL_REAR_DELT_ROW = new exercise("Barbell Rear Delt Row", SHOULDERS, "Rear deltoid", exercise.Classification.BARBELL);
    public static final exercise EZ_BAR_FRONT_RAISE = new exercise("EZ Bar Front Raise", SHOULDERS, "Front deltoid", exercise.Classification.BARBELL);
    public static final exercise EZ_BAR_UPRIGHT_ROW = new exercise("EZ Bar Upright Row", SHOULDERS, "Side deltoid", exercise.Classification.BARBELL);
    // Plate exercises
    public static final exercise PLATE_LOADED_BEHIND_THE_NECK_PRESS = new exercise("Plate Loaded Behind the Neck Press", SHOULDERS, "Front deltoid", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_SHOULDER_PRESS = new exercise("Plate Loaded Shoulder Press", SHOULDERS, "Front deltoid", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_STANDING_LATERAL_RAISE = new exercise("Plate Loaded Standing Lateral Raise", SHOULDERS, "Side deltoid", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_SEATED_LATERAL_RAISE = new exercise("Plate Loaded Seated Lateral Raise", SHOULDERS, "Side deltoid", exercise.Classification.PLATE);
    public static final exercise PLATE_FRONT_RAISE = new exercise("Plate Front Raise", SHOULDERS, "Front deltoid", exercise.Classification.PLATE);
    // Cable exercises
    public static final exercise CABLE_LATERAL_RAISE = new exercise("Cable Lateral Raise", SHOULDERS, "Side deltoid", exercise.Classification.CABLE);
    public static final exercise CABLE_FRONT_RAISE = new exercise("Cable Front Raise", SHOULDERS, "Front deltoid", exercise.Classification.CABLE);
    public static final exercise CABLE_REAR_DELT_FLY = new exercise("Cable Rear Delt Fly", SHOULDERS, "Rear deltoid", exercise.Classification.CABLE);
    public static final exercise CABLE_UPRIGHT_ROW = new exercise("Cable Upright Row", SHOULDERS, "Side deltoid", exercise.Classification.CABLE);
    public static final exercise CABLE_Y_RAISE = new exercise("Cable Y Raise", SHOULDERS, "Rear deltoid", exercise.Classification.CABLE);
    // Calisthenic exercises
    public static final exercise HANDSTAND_PUSH_UP = new exercise("Handstand Push Up", SHOULDERS, "Front deltoid", exercise.Classification.CALISTHENIC);
    public static final exercise PIKE_PUSH_UP = new exercise("Pike Push Up", SHOULDERS, "Front deltoid", exercise.Classification.CALISTHENIC);
    public static final exercise WALL_WALK = new exercise("Wall Walk", SHOULDERS, "Front deltoid", exercise.Classification.CALISTHENIC);
    // Other exercises

    // Leg Exercises----------------------------------------------
    // Machine exercises
    public static final exercise SEATED_LEG_EXTENSION_MACHINE = new exercise("Seated Leg Extension Machine", LEGS, "Quadriceps", exercise.Classification.MACHINE);
    public static final exercise SEATED_LEG_CURL_MACHINE = new exercise("Seated Leg Curl Machine", LEGS, "Hamstrings", exercise.Classification.MACHINE);
    public static final exercise LYING_LEG_CURL_MACHINE = new exercise("Lying Leg Curl Machine", LEGS, "Hamstrings", exercise.Classification.MACHINE);
    public static final exercise UPRIGHT_LEG_CURL_MACHINE = new exercise("Upright Leg Curl Machine", LEGS, "Hamstrings", exercise.Classification.MACHINE);
    public static final exercise LEG_PRESS_MACHINE = new exercise("Leg Press Machine", LEGS, "Quadriceps", exercise.Classification.MACHINE);
    public static final exercise SMITH_SQUAT = new exercise("Smith Squat", LEGS, "Quadriceps", exercise.Classification.MACHINE);
    public static final exercise FRONT_SQUAT_MACHINE = new exercise("Front Squat Machine", LEGS, "Quadriceps", exercise.Classification.MACHINE);
    public static final exercise SMITH_ROMANIAN_DEADLIFT = new exercise("Smith Romanian Deadlift", LEGS, "Glutes", exercise.Classification.MACHINE);
    public static final exercise SMITH_GOOD_MORNING = new exercise("Smith Good Morning", LEGS, "Hamstrings", exercise.Classification.MACHINE);
    public static final exercise SMITH_STIFF_LEGGED_DEADLIFT = new exercise("Smith Stiff Legged Deadlift", LEGS, "Hamstrings", exercise.Classification.MACHINE);
    public static final exercise SMITH_DEADLIFT = new exercise("Smith Deadlift", LEGS, "Hamstrings", exercise.Classification.MACHINE);
    public static final exercise SMITH_HIP_THRUST = new exercise("Smith Hip Thrust", LEGS, "Glutes", exercise.Classification.MACHINE);
    public static final exercise SMITH_REVERSE_LUNGE = new exercise("Smith Reverse Lunge", LEGS, "Quadriceps", exercise.Classification.MACHINE);
    public static final exercise SMITH_SINGLE_LEG_DEADLIFT = new exercise("Smith Single Leg Deadlift", LEGS, "Hamstrings", exercise.Classification.MACHINE);
    public static final exercise SMITH_BULGARIAN_SPLIT_LEG_SQUAT = new exercise("Smith Split Leg Squat", LEGS, "Quadriceps", exercise.Classification.MACHINE);
    public static final exercise SMITH_SISSY_SQUAT = new exercise("Smith Sissy Squat", LEGS, "Quadriceps", exercise.Classification.MACHINE);
    public static final exercise STANDING_CALF_RAISE_MACHINE = new exercise("Standing Calf Raise Machine", LEGS, "Calves", exercise.Classification.MACHINE);
    public static final exercise SEATED_CALF_RAISE_MACHINE = new exercise("Seated Calf Raise Machine", LEGS, "Calves", exercise.Classification.MACHINE);
    public static final exercise HIP_ABDUCTION_MACHINE = new exercise("Hip Abduction Machine", LEGS, "Abductors", exercise.Classification.MACHINE);
    public static final exercise HIP_ADDUCTION_MACHINE = new exercise("Hip Adduction Machine", LEGS, "Adductors", exercise.Classification.MACHINE);
    public static final exercise SEATED_CALF_PRESS_MACHINE = new exercise("Seated Calf Press Machine", LEGS, "Calves", exercise.Classification.MACHINE);
    public static final exercise HIP_THRUST_MACHINE = new exercise("Hip Thrust Machine", LEGS, "Glutes", exercise.Classification.MACHINE);
    public static final exercise KICKBACK_MACHINE = new exercise("Kickback Machine", LEGS, "Glutes", exercise.Classification.MACHINE);
    // Dumbbell exercises
    public static final exercise DUMBBELL_BULGARIAN_SPLIT_SQUAT = new exercise("Dumbbell Bulgarian Split Squat", LEGS, "Quadriceps", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_LUNGE = new exercise("Dumbbell Lunge", LEGS, "Quadriceps", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_REVERSE_LUNGE = new exercise("Dumbbell Reverse Lunge", LEGS, "Quadriceps", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_STEP_UP = new exercise("Dumbbell Step Up", LEGS, "Quadriceps", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_ROMANIAN_DEADLIFT = new exercise("Dumbbell Romanian Deadlift", LEGS, "Glutes", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_SQUAT = new exercise("Dumbbell Squat", LEGS, "Quadriceps", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_STIFF_LEGGED_DEADLIFT = new exercise("Dumbbell Stiff Legged Deadlift", LEGS, "Hamstrings", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_CALF_RAISE = new exercise("Dumbbell Calf Raise", LEGS, "Calves", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_HIP_THRUST = new exercise("Dumbbell Hip Thrust", LEGS, "Glutes", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_GOBLET_SQUAT = new exercise("Dumbbell Goblet Squat", LEGS, "Quadriceps", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_DEADLIFT = new exercise("Dumbbell Deadlift", LEGS, "Hamstrings", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_SINGLE_LEG_DEADLIFT = new exercise("Dumbbell Single Leg Deadlift", LEGS, "Hamstrings", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_SUMO_SQUAT = new exercise("Dumbbell Sumo Squat", LEGS, "Quadriceps", exercise.Classification.DUMBBELL);
    // Barbell exercises
    public static final exercise BARBELL_BACK_SQUAT = new exercise("Barbell Back Squat", LEGS, "Quadriceps", exercise.Classification.BARBELL);
    public static final exercise BARBELL_FRONT_SQUAT = new exercise("Barbell Front Squat", LEGS, "Quadriceps", exercise.Classification.BARBELL);
    public static final exercise BARBELL_LUNGE = new exercise("Barbell Lunge", LEGS, "Quadriceps", exercise.Classification.BARBELL);
    public static final exercise BARBELL_REVERSE_LUNGE = new exercise("Barbell Reverse Lunge", LEGS, "Quadriceps", exercise.Classification.BARBELL);
    public static final exercise BARBELL_STEP_UP = new exercise("Barbell Step Up", LEGS, "Quadriceps", exercise.Classification.BARBELL);
    public static final exercise BARBELL_ROMANIAN_DEADLIFT = new exercise("Barbell Romanian Deadlift", LEGS, "Glutes", exercise.Classification.BARBELL);
    public static final exercise BARBELL_STIFF_LEGGED_DEADLIFT = new exercise("Barbell Stiff Legged Deadlift", LEGS, "Hamstrings", exercise.Classification.BARBELL);
    public static final exercise BARBELL_HIP_THRUST = new exercise("Barbell Hip Thrust", LEGS, "Glutes", exercise.Classification.BARBELL);
    public static final exercise BARBELL_DEADLIFT = new exercise("Barbell Deadlift", LEGS, "Hamstrings", exercise.Classification.BARBELL);
    public static final exercise BARBELL_SINGLE_LEG_DEADLIFT = new exercise("Barbell Single Leg Deadlift", LEGS, "Hamstrings", exercise.Classification.BARBELL);
    public static final exercise BARBELL_GOOD_MORNING = new exercise("Barbell Good Morning", LEGS, "Hamstrings", exercise.Classification.BARBELL);
    public static final exercise BARBELL_BOX_SQUAT = new exercise("Barbell Box Squat", LEGS, "Quadriceps", exercise.Classification.BARBELL);
    public static final exercise BARBELL_HACK_SQUAT = new exercise("Barbell Hack Squat", LEGS, "Quadriceps", exercise.Classification.BARBELL);
    // Plate exercises
    public static final exercise PLATE_LOADED_LINEAR_LEG_PRESS = new exercise("Plate Loaded Leg Press", LEGS, "Quadriceps", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_HACK_SQUAT = new exercise("Plate Loaded Hack Squat", LEGS, "Quadriceps", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_SISSY_HACK_SQUAT = new exercise("Plate Loaded Sissy Hack Squat", LEGS, "Quadriceps", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_LEG_EXTENSION = new exercise("Plate Loaded Leg Extension", LEGS, "Quadriceps", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_LEG_CURL = new exercise("Plate Loaded Leg Curl", LEGS, "Hamstrings", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_STANDING_CALF_RAISE = new exercise("Plate Loaded Standing Calf Raise", LEGS, "Calves", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_SEATED_CALF_RAISE = new exercise("Plate Loaded Seated Calf Raise", LEGS, "Calves", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_HIP_ABDUCTION = new exercise("Plate Loaded Hip Abduction", LEGS, "Abductors", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_HIP_ADDUCTION = new exercise("Plate Loaded Hip Adduction", LEGS, "Adductors", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_HIP_THRUST = new exercise("Plate Loaded Hip Thrust", LEGS, "Glutes", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_UPRIGHT_LEG_PRESS = new exercise("Upright Leg Press", LEGS, "Quadriceps", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_PENDULUM_SQUAT = new exercise("Pendulum Squat", LEGS, "Quadriceps", exercise.Classification.PLATE);
    public static final exercise PLATE_LOADED_UPRIGHT_LEG_CURL = new exercise("Upright Leg Curl", LEGS, "Hamstrings", exercise.Classification.PLATE);
    // Cable exercises
    public static final exercise CABLE_KICKBACK = new exercise("Cable Kickback", LEGS, "Glutes", exercise.Classification.CABLE);
    public static final exercise CABLE_HIP_ABDUCTION = new exercise("Cable Hip Abduction", LEGS, "Abductors", exercise.Classification.CABLE);
    public static final exercise CABLE_HIP_ADDUCTION = new exercise("Cable Hip Adduction", LEGS, "Adductors", exercise.Classification.CABLE);
    public static final exercise CABLE_STEP_UP = new exercise("Cable Step Up", LEGS, "Quadriceps", exercise.Classification.CABLE);
    public static final exercise SINGLE_LEG_DEADLIFT = new exercise("Cable Single Leg Deadlift", LEGS, "Hamstrings", exercise.Classification.CABLE);
    public static final exercise CABLE_SQUAT = new exercise("Cable Squat", LEGS, "Quadriceps", exercise.Classification.CABLE);
    public static final exercise CABLE_LUNGE = new exercise("Cable Lunge", LEGS, "Quadriceps", exercise.Classification.CABLE);
    public static final exercise CABLE_BULGARIAN_SPLIT_SQUAT = new exercise("Cable Bulgarian Split Squat", LEGS, "Quadriceps", exercise.Classification.CABLE);
    // Calisthenic exercises
    public static final exercise BODYWEIGHT_SQUAT = new exercise("Bodyweight Squat", LEGS, "Quadriceps", exercise.Classification.CALISTHENIC);
    public static final exercise JUMP_SQUAT = new exercise("Jump Squat", LEGS, "Quadriceps", exercise.Classification.CALISTHENIC);
    public static final exercise WALKING_LUNGE = new exercise("Walking Lunge", LEGS, "Quadriceps", exercise.Classification.CALISTHENIC);
    public static final exercise BODYWEIGHT_BULGARIAN_SPLIT_SQUAT = new exercise("Bodyweight Bulgarian Split Squat", LEGS, "Quadriceps", exercise.Classification.CALISTHENIC);
    public static final exercise SINGLE_LEG_GLUTE_BRIDGE = new exercise("Single Leg Glute Bridge", LEGS, "Glutes", exercise.Classification.CALISTHENIC);
    public static final exercise GLUTE_BRIDGE = new exercise("Glute Bridge", LEGS, "Glutes", exercise.Classification.CALISTHENIC);
    public static final exercise BODYWEIGHT_CALF_RAISE = new exercise("Bodyweight Calf Raise", LEGS, "Calves", exercise.Classification.CALISTHENIC);
    public static final exercise PISTOL_SQUAT = new exercise("Pistol Squat", LEGS, "Quadriceps", exercise.Classification.CALISTHENIC);
    public static final exercise BODYWEIGHT_STEP_UP = new exercise("Bodyweight Step Up", LEGS, "Quadriceps", exercise.Classification.CALISTHENIC);
    public static final exercise BODYWEIGHT_LUNGE = new exercise("Bodyweight Lunge", LEGS, "Quadriceps", exercise.Classification.CALISTHENIC);

    // Other exercises
    public static final exercise TRAP_BAR_DEADLIFT = new exercise("Trap Bar Deadlift", LEGS, "Hamstrings", exercise.Classification.OTHER);
    public static final exercise SAFETY_BAR_SQUAT = new exercise("Safety Bar Squat", LEGS, "Quadriceps", exercise.Classification.OTHER);

    // Ab Exercises------------------------------------------------
    // Machine exercises
    public static final exercise AB_CRUNCH_MACHINE = new exercise("Ab Crunch Machine", ABS, "Abs", exercise.Classification.MACHINE);
    public static final exercise OBLIQUE_TWIST_MACHINE = new exercise("Oblique Twist Machine", ABS, "Obliques", exercise.Classification.MACHINE);
    // Dumbbell exercises
    public static final exercise DUMBBELL_SIDE_BEND = new exercise("Dumbbell Side Bend", ABS, "Obliques", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_WEIGHTED_CRUNCH = new exercise("Dumbbell Weighted Crunch", ABS, "Upper Abs", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_WEIGHTED_DECLINE_CRUNCH = new exercise("Dumbbell Weighted Decline Crunch", ABS, "Upper Abs", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_RUSSIAN_TWIST = new exercise("Dumbbell Russian Twist", ABS, "Obliques", exercise.Classification.DUMBBELL);
    // Barbell exercises

    // Plate exercises
    public static final exercise PLATE_WEIGHTED_CRUNCH = new exercise("Plate Weighted Crunch", ABS, "Upper Abs", exercise.Classification.PLATE);
    public static final exercise PLATE_WEIGHTED_DECLINE_CRUNCH = new exercise("Plate Weighted Decline Crunch", ABS, "Upper Abs", exercise.Classification.PLATE);
    public static final exercise PLATE_RUSSIAN_TWIST = new exercise("Plate Russian Twist", ABS, "Obliques", exercise.Classification.PLATE);
    // Cable exercises
    public static final exercise CABLE_CRUNCH = new exercise("Cable Crunch", ABS, "Upper Abs", exercise.Classification.CABLE);
    public static final exercise KNEELING_CABLE_CRUNCH = new exercise("Kneeling Cable Crunch", ABS, "Upper Abs", exercise.Classification.CABLE);
    // Calisthenic exercises
    public static final exercise HANGING_LEG_RAISE = new exercise("Hanging Leg Raise", ABS, "Lower Abs", exercise.Classification.CALISTHENIC);
    public static final exercise BICYCLE_CRUNCH = new exercise("Bicycle Crunch", ABS, "Upper Abs", exercise.Classification.CALISTHENIC);
    public static final exercise LYING_LEG_RAISE = new exercise("Leg Raise", ABS, "Lower Abs", exercise.Classification.CALISTHENIC);
    public static final exercise RUSSIAN_TWIST = new exercise("Russian Twist", ABS, "Obliques", exercise.Classification.CALISTHENIC);
    public static final exercise DECLINE_CRUNCH = new exercise("Decline Crunch", ABS, "Upper Abs", exercise.Classification.CALISTHENIC);
    // Other exercises

    // 16 Forearm Exercises-------------------------------------------
    // Machine exercises
    // Dumbbell exercises
    public static final exercise DUMBBELL_RADIAL_DEVIATION = new exercise("Dumbbell Radial Deviation", FOREARMS, "Outer Forearms", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_WRIST_ROTATION = new exercise("Dumbbell Wrist Rotation", FOREARMS, "Inner Forearms", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_FOREARM_CURL = new exercise("Dumbbell Forearm Curl", FOREARMS, "Outer Forearms", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_WRIST_CURL = new exercise("Dumbbell Wrist Curl", FOREARMS, "Inner Forearms", exercise.Classification.DUMBBELL);
    public static final exercise DUMBBELL_BEHIND_THE_BACK_WRIST_CURL = new exercise("Dumbbell Behind the Back Wrist Curl", FOREARMS, "Inner Forearms", exercise.Classification.DUMBBELL);
    // Barbell exercises
    public static final exercise EZ_BAR_FOREARM_CURL = new exercise("EZ Bar Forearm Curl", FOREARMS, "Outer Forearms", exercise.Classification.BARBELL);
    public static final exercise EZ_BAR_WRIST_CURL = new exercise("EZ Bar Wrist Curl", FOREARMS, "Inner Forearms", exercise.Classification.BARBELL);
    public static final exercise EZ_BAR_BEHIND_THE_BACK_WRIST_CURL = new exercise("EZ Bar Behind the Back Wrist Curl", FOREARMS, "Inner Forearms", exercise.Classification.BARBELL);
    public static final exercise BARBELL_FOREARM_CURL = new exercise("Barbell Forearm Curl", FOREARMS, "Outer Forearms", exercise.Classification.BARBELL);
    public static final exercise BARBELL_WRIST_CURL = new exercise("Barbell Wrist Curl", FOREARMS, "Inner Forearms", exercise.Classification.BARBELL);
    public static final exercise BARBELL_BEHIND_THE_BACK_WRIST_CURL = new exercise("Barbell Behind the Back Wrist Curl", FOREARMS, "Inner Forearms", exercise.Classification.BARBELL);
    // Plate exercises
    public static final exercise PLATE_FOREARM_MACHINE = new exercise("Plate Forearm Machine", FOREARMS, "Inner Forearms", exercise.Classification.PLATE);
    // Cable exercises
    public static final exercise CABLE_FOREARM_CURLS = new exercise("Cable Forearm Curls", FOREARMS, "Outer Forearms", exercise.Classification.CABLE);
    public static final exercise CABLE_WRIST_CURLS = new exercise("Cable Wrist Curls", FOREARMS, "Inner Forearms", exercise.Classification.CABLE);
    public static final exercise CABLE_BEHIND_THE_BACK_WRIST_CURLS = new exercise("Cable Reverse Wrist Curls", FOREARMS, "Outer Forearms", exercise.Classification.CABLE);
    // Calisthenic exercises
    // Other exercises
    public static final exercise FOREARM_GRIPPER = new exercise("Forearm Gripper", FOREARMS, "Inner Forearms", exercise.Classification.OTHER);
}
