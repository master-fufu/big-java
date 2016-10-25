package p_09_11_BetterRectangleSuperClass;

import java.awt.*;

/**
 * Repeat Exercise P9.10, but in the {@code BetterRectangle} constructor,
 * invoke the superclass constructor.
 */
public class BetterRectangle extends Rectangle
{
    /**
     * Creates a rectangle object by invoking the superclass constructor.
     *
     * @param x      the x coordinate for superclass constructor
     * @param y      the y coordinate for superclass constructor
     * @param width  the width for superclass constructor
     * @param height the height for superclass constructor
     */
    public BetterRectangle(int x, int y, int width, int height)
    {
        super(x, y, width, height);
    }

    public static void main(String[] args)
    {
        BetterRectangle rectangle = new BetterRectangle(5, 5, 40, 20);

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Center X: " + rectangle.getCenterX());
        System.out.println("Center Y: " + rectangle.getCenterY());
    }

    /**
     * Computes the area of this rectangle.
     *
     * @return the area
     */
    public int getArea()
    {
        return width * height;
    }

    /**
     * Computes the perimeter of this rectangle.
     *
     * @return the perimeter
     */
    public int getPerimeter()
    {
        return (width + height) * 2;
    }
}
