package workout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * A collection of exercises that make up a workout routine
 */
public class workout {
   private String name;
   private ArrayList<set> movements;
   // Map each exercise to its total volume (sum of reps * weight across all sets)
   private HashMap<exercise, Integer> exerciseVolume;
   private HashMap<muscleGroup, Integer> muscleVolume;
   private Set<muscleGroup> musclesWorked;

   /**
    * Creates a new workout with the given name
    * 
    * @param name the name of the workout
    */
   public workout(String name){
      this.name = name;
   this.movements = new ArrayList<>();
   this.musclesWorked = new HashSet<muscleGroup>();
   this.exerciseVolume = new HashMap<>();
   this.muscleVolume = new HashMap<>();
   }

   /**
    * The name of the workout
    * 
    * @return the name of the workout
    */
   public String getName() {
      return name;
   }

   public ArrayList<set> getSets() {
      return movements;
   }

   public void addSet(int reps, int weight, exercise ex) {
   set newSet = new set(reps, weight, ex);
   movements.add(newSet);
   musclesWorked.add(ex.getMusclesWorked());
   // Update muscle volume
   muscleVolume.put(ex.getMusclesWorked(), muscleVolume.getOrDefault(ex.getMusclesWorked(), 0) + (reps * weight));
   // Update exercise volume
   exerciseVolume.put(ex, exerciseVolume.getOrDefault(ex, 0) + (reps * weight));
   }
   
   public void addSet(set s) {
     movements.add(s);
     exercise ex = s.getMovement();
     musclesWorked.add(ex.getMusclesWorked());
     muscleVolume.put(ex.getMusclesWorked(), muscleVolume.getOrDefault(ex.getMusclesWorked(), 0) + s.getVolume());
     // Update exercise volume
     exerciseVolume.put(ex, exerciseVolume.getOrDefault(ex, 0) + s.getVolume());
  }

  /**
   * Returns a map of each exercise to its total volume (sum of reps * weight across all sets)
   * @return HashMap of exercise to total volume
   */
  public HashMap<exercise, Integer> getExerciseVolume() {
     return exerciseVolume;
   }

   public Set<muscleGroup> getMusclesWorked() {
       return musclesWorked;
   }

   public String toString()
   {
      int numExercises = movements.size();
      if (numExercises == 0) {
         return "No exercises in this workout.";
      }

      StringBuilder sb = new StringBuilder();
      sb.append("Workout: ").append(name).append("\n");

      sb.append("Muscle Groups Worked: ");
      for (muscleGroup mg : musclesWorked) {
         sb.append(mg.getName()).append(", ");
      }
      sb.setLength(sb.length() - 2); // Remove trailing comma and space
      sb.append("\n");

      // Group sets by exercise and print sets, then exercise volume
      HashMap<exercise, ArrayList<set>> setsByExercise = new HashMap<>();
      for (set s : movements) {
         exercise ex = s.getMovement();
         setsByExercise.computeIfAbsent(ex, k -> new ArrayList<>()).add(s);
      }

      int setNum = 1;
      for (exercise ex : setsByExercise.keySet()) {
         ArrayList<set> sets = setsByExercise.get(ex);
         for (set s : sets) {
            sb.append("Set ").append(setNum).append(": ")
              .append(s.getReps()).append(" reps of ")
              .append(ex.getMovementName())
              .append(" at ").append(s.getWeight()).append(" lbs\n");
            setNum++;
         }
         sb.append(ex.getMovementName()).append(": ")
           .append(exerciseVolume.get(ex)).append(" lbs\n\n");
      }

      // Print muscle group volume summary
      sb.append("Muscles Worked:\n");
      for (muscleGroup mg : muscleVolume.keySet()) {
         sb.append(mg.getName()).append(": ")
           .append(muscleVolume.get(mg)).append(" lbs\n");
      }

      return sb.toString();
   }
}