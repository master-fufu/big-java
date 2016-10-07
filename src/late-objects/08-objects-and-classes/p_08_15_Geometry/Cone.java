package p_08_15_Geometry;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

/**
 * Solve Exercise P8.14 by implementing classes {@code Sphere},
 * {@code Cylinder}, and {@code Cone}. Which approach is more object-oriented?
 */
public class Cone
{
    private double volume;
    private double surface;

    /**
     * Constructs a new cone with volume and surface values equal to zero.
     */
    public Cone()
    {
        volume = 0;
        surface = 0;
    }

    /**
     * Computes cone volume.
     *
     * @param r the radius
     * @param h the height
     */
    public void volume(double r, double h)
    {
        volume = PI * (r * r) * (h / 3);
    }

    /**
     * Computes cylinder surface.
     *
     * @param r the radius
     * @param h the height
     */
    public void surface(double r, double h)
    {
        surface = PI * r * (r + sqrt((h * h) + (r * r)));
    }

    /**
     * Gets cone volume.
     *
     * @return cone volume
     */
    public double getVolume()
    {
        return volume;
    }

    /**
     * Gets cone surface.
     *
     * @return surface
     */
    public double getSurface()
    {
        return surface;
    }
}
