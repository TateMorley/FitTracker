package workout;

public class ExerciseLibrary {
    public static final muscleGroup BICEPS = new muscleGroup("Biceps", 3, new String[] { "Long Head", "Short Head", "Brachialis" });
    public static final muscleGroup TRICEPS = new muscleGroup("Triceps", 3, new String[] { "Long Head", "Lateral Head", "Medial Head" });
    public static final muscleGroup CHEST = new muscleGroup("Chest", 2, new String[] { "Upper Chest", "Lower Chest" });
    public static final muscleGroup BACK = new muscleGroup("Back", 4, new String[] { "Traps", "Middle Back", "Lower Back", "Lats" });
    public static final muscleGroup SHOULDERS = new muscleGroup("Shoulders", 3, new String[] { "Front deltoid", "Side deltoid", "Rear deltoid" });
    public static final muscleGroup QUADS = new muscleGroup("Quads", 4, new String[] { "Rectus Femoris", "Vastus Lateralis", "Vastus Medialis", "Vastus Intermedius" });
    public static final muscleGroup HAMSTRINGS = new muscleGroup("Hamstrings", 3, new String[] { "Biceps Femoris", "Semitendinosus", "Semimembranosus" });
    public static final muscleGroup CALVES = new muscleGroup("Calves", 2, new String[] { "Gastrocnemius", "Soleus" });
    public static final muscleGroup ABS = new muscleGroup("Abs", 3, new String[] { "Upper abs", "Lower abs", "Obliques" });
    public static final muscleGroup FOREARMS = new muscleGroup("Forearms", 2, new String[] { "Flexors", "Extensors" });

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
    public static final exercise LAYING_PLATE_LOADED_CHEST_PRESS = new exercise("laying Plate Loaded Chest Press", CHEST, "Lower Chest", exercise.Classification.PLATE);
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

    //TODO Finish the rest of the exercise library
    // Shoulder Exercises------------------------------------------
    // Machine exercises
    // Dumbbell exercises
    // Barbell exercises
    // Plate exercises
    // Cable exercises
    // Calisthenic exercises
    // Other exercises

    // Quad Exercises----------------------------------------------
    // Machine exercises
    // Dumbbell exercises
    // Barbell exercises
    // Plate exercises
    // Cable exercises
    // Calisthenic exercises
    // Other exercises

    // Hamstring Exercises-----------------------------------------
    // Machine exercises
    // Dumbbell exercises
    // Barbell exercises
    // Plate exercises
    // Cable exercises
    // Calisthenic exercises
    // Other exercises

    // Calf Exercises----------------------------------------------
    // Machine exercises
    // Dumbbell exercises
    // Barbell exercises
    // Plate exercises
    // Cable exercises
    // Calisthenic exercises
    // Other exercises

    // Ab Exercises------------------------------------------------
    // Machine exercises
    // Dumbbell exercises
    // Barbell exercises
    // Plate exercises
    // Cable exercises
    // Calisthenic exercises
    // Other exercises

    // Forearm Exercises-------------------------------------------
    // Machine exercises
    // Dumbbell exercises
    // Barbell exercises
    // Plate exercises
    // Cable exercises
    // Calisthenic exercises
    // Other exercises
}
