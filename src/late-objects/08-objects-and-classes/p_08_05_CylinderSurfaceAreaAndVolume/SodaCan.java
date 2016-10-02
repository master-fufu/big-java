package p_08_05_CylinderSurfaceAreaAndVolume;

import static java.lang.Math.PI;

/**
 * Implement a class {@code SodaCan} with methods {@code getSurfaceArea()}
 * and {@code getVolume()}. In the constructor, supply the height and radius
 * of the can.
 */
public class SodaCan
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
}
