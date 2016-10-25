package p_09_12_Labeledpoint;

/**
 * A labeled point has <em>x-</em> and <em>y-</em>coordinates and a string
 * label. Provide a class {@code LabeledPoint} with a constructor
 * {@code LabeledPoint(int x, int y, String label)} and a {@code toString}
 * method that displays {@code x}, {@code y}, and the label.
 */
public class LabeledPoint
{
    private int x;
    private int y;
    private String label;

    /**
     * Constructs labeled point object.
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     * @param label the label
     */
    public LabeledPoint(int x, int y, String label)
    {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public static void main(String[] args)
    {
        LabeledPoint labeledPoint = new LabeledPoint(10, 20, "the point");
        System.out.println(labeledPoint.toString());
    }

    /**
     * @return string representation of the object
     */
    public String toString()
    {
        return String.format("%s[x=%d,y=%d,label=%s]", "LabeledPoint", this.x, this.y, this.label);
    }
}
