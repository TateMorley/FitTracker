package workout;

/*
 * A set is a collection of repeated exercise instances. it provides the volume moved with reps and weight
 */
public class set {
    private int reps;
    private exercise movement;
    private int weight;

    /**
     * Creates a new set with the given parameters
     * 
     * @param reps     the number of reps in the set
     * @param movement the movement of the set
     * @param weight   the weight being moved each rep
     */
    public set(int reps, int weight, exercise movement) {
        this.reps = reps;
        this.movement = movement;
        this.weight = weight;
    }

    /**
     * Returns the number of reps in the set
     * @return the number of reps in the set
     */
    public int getReps() {
        return reps;
    }

    /**
     * Returns the movement of the set
     * @return the movement of the set
     */
    public exercise getMovement() {
        return movement;
    }

    /**
     * The total weight being moved each rep
     * @return
     */
    public int getWeight() {
        return weight;
    }

    /**
     * The total volume moved in the set
     * @return the total volume moved in the set
     */
    public int getVolume() {
        if (getMovement().getClassification() == exercise.Classification.DUMBBELL) {
            return reps * weight * 2;
        }
        return reps * weight;
    }
}
