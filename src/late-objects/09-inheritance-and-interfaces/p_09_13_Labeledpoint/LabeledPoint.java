package p_09_13_Labeledpoint;

import java.awt.*;

/**
 * Reimplement the {@code LabeledPoint} class of Exercise P9.12 by storing the
 * location in a {@code java.awt.Point object}. Your {@code toString} method
 * should invoke the {@code toString} method of the Point class.
 */
public class LabeledPoint extends Point
{
    private String label;

    /**
     * Constructs LabeledPoint object.
     *
     * @param x     the x-coordinate
     * @param y     the y-coordinate
     * @param label the label
     */
    public LabeledPoint(int x, int y, String label)
    {
        super(x, y);
        this.label = label;
    }

    /**
     * Test {@code LabeledPoint} class.
     *
     * @param args command line arguments
     */
    public static void main(String[] args)
    {
        LabeledPoint lp = new LabeledPoint(15, 25, "the label");
        System.out.println(lp.toString());
    }

    /**
     * Gets string representation of the object using {@code Point}
     * superclass and LabeledPoint subclass.
     *
     * @return string representation of the object
     */
    public String toString()
    {
        return super.toString() + "LabeledPoint[label=" + label + "]";
    }
}
