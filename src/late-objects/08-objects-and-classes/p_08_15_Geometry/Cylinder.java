package p_08_15_Geometry;

import static java.lang.Math.PI;

/**
 * Solve Exercise P8.14 by implementing classes {@code Sphere},
 * {@code Cylinder}, and {@code Cone}. Which approach is more object-oriented?
 */
public class Cylinder
{
    private double volume;
    private double surface;

    /**
     * Constructs a new cylinder with volume and surface values equal to zero.
     */
    public Cylinder()
    {
        volume = 0;
        surface = 0;
    }

    /**
     * Computes cylinder volume.
     *
     * @param r the radius
     * @param h the height
     */
    public void volume(double r, double h)
    {
        volume = PI * (r * r) * h;
    }

    /**
     * Computes cylinder surface.
     *
     * @param r the radius
     * @param h the height
     */
    public void surface(double r, double h)
    {
        surface = (2 * PI * r * h) + (2 * PI * (r * r));
    }

    /**
     * Gets cylinder volume.
     *
     * @return cylinder volume
     */
    public double getVolume()
    {
        return volume;
    }

    /**
     * Gets cylinder surface.
     *
     * @return cylinder surface
     */
    public double getSurface()
    {
        return surface;
    }
}
