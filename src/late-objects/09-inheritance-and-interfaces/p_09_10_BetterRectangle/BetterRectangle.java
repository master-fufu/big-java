package p_09_10_BetterRectangle;

import java.awt.*;

/**
 * The {@code Rectangle} class of the standard Java library does not supply
 * a method to compute the area or the perimeter of a rectangle. Provide
 * a subclass {@code BetterRectangle} of the {@code Rectangle} class that has
 * {@code getPerimeter} and {@code getPopulation} methods. Do not add any instance
 * variables. In the constructor, call the {@code setLocation} and {@code
 * setSize} methods of the {@code Rectangle} class. Provide a program that
 * tests the methods that you supplied.
 */
public class BetterRectangle extends Rectangle
{
    /**
     * Creates a rectangle object using method of {@code Rectangle} super class.
     *
     * @param x      the x coordinate for {@code setLocation} method
     * @param y      the y coordinate for {@code setLocation} method
     * @param width  the width of this rectangle
     * @param height the height of this rectangle
     */
    public BetterRectangle(int x, int y, int width, int height)
    {
        this.setLocation(x, y);
        this.setSize(width, height);
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
