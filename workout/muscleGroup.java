package workout;

/*
 * A group of heads that work together
 */
public class muscleGroup {
    private String name;
    private int heads;
    private String[] headNames;

    public muscleGroup(String name, int heads, String[] headNames) {
        this.name = name;
        this.heads = heads;
        this.headNames = headNames;
    }

    public String getName() {
        return name;
    }

    public int getHeads() {
        return heads;
    }

    public String[] getHeadNames() {
        return headNames;
    }
}
