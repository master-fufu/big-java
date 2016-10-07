package p_08_15_Geometry;

import static java.lang.Math.PI;

/**
 * Solve Exercise P8.14 by implementing classes {@code Sphere},
 * {@code Cylinder}, and {@code Cone}. Which approach is more object-oriented?
 */
public class Sphere
{
    private double volume;

    /**
     * Constructs a new sphere.
     */
    public Sphere()
    {
        volume = 0;
    }

    /**
     * Computes sphere volume.
     *
     * @param r the radius
     */
    public void volume(double r)
    {
        volume = 4.0 / 3 * PI * (r * r * r);
    }

    /**
     * Gets sphere volume.
     *
     * @return the volume, type of double
     */
    public double getVolume()
    {
        return volume;
    }
}
