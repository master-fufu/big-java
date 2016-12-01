package p_09_14_SodaCanMeasurable;

import static java.lang.Math.PI;

/**
 * Modify the {@code SodaCan} class of Exercise P8.5 to implement the {@code
 * Measurable} interface. The measure of a soda can should be its surface area.
 * Write a program that computes the average surface area of an array of soda
 * cans.
 */
public class SodaCan implements Measurable
{
    private double height;
    private double radius;

    /**
     * Constructs {@code SodaCan} object with height and radius parameters
     * entered by user.
     *
     * @param aHeight height of the cylinder, type of double
     * @param aRadius radius of the cylinder, type of double
     */
    public SodaCan(double aHeight, double aRadius)
    {
        height = aHeight;
        radius = aRadius;
    }

    /**
     * Gets the surface of the area of the cylinder.
     *
     * @return surface area, type of double
     */
    public double getSurface()
    {
        return (2 * PI * radius * height) + (2 * PI * (radius * radius));
    }

    /**
     * Gets the volume of the cylinder.
     *
     * @return volume of the cylinder, type of double
     */
    public double getVolume()
    {
        return PI * (radius * radius) * height;
    }

    public double getMeasure()
    {
        return getSurface();
    }
}
