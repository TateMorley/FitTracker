
package workout;

import java.util.Arrays;

/*
 * A exercise is an organized movement that has a primary head wtihin collection of heads worked in a muscle group
 */
public class exercise {
    private String movement;
    private muscleGroup musclesWorked;
    private String primaryHead;
    private Classification classification;

    public enum Classification {
        MACHINE,
        DUMBBELL,
        BARBELL,
        PLATE,
        CABLE,
        CALISTHENIC,
        OTHER
    }

    /**
     * Creates a new exercise with the given parameters
     * 
     * @param movement      the name of the movement
     * @param musclesWorked the muscle group worked by the exercise
     * @param primaryHead   the primary head worked by the exercise
     */
    public exercise(String movement, muscleGroup musclesWorked, String primaryHead, Classification classification) {
        this.movement = movement;
        this.musclesWorked = musclesWorked;
        this.primaryHead = primaryHead;
        this.classification = classification;

        if (!Arrays.asList(musclesWorked.getHeadNames()).contains(primaryHead)) {
            throw new IllegalArgumentException("Primary head must be one of the muscle group's heads.");
        }
    }

    /**
     * Returns the name of the movement
     * 
     * @return
     */
    public String getMovementName() {
        return movement;
    }

    /**
     * Returns the muscle group worked by the exercise
     * 
     * @return
     */
    public muscleGroup getMusclesWorked() {
        return musclesWorked;
    }

    /**
     * Returns the primary head of the muscle group worked by the exercise
     * 
     * @return
     */
    public String getPrimaryHead() {
        return primaryHead;
    }

    /**
     * Returns the classification of the exercise (e.g., machine, dumbbell, etc.)
     * @return
     */
    public Classification getClassification() {
        return classification;
    }
}
