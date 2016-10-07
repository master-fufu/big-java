package p_08_14_Geometry;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

/**
 * Write static methods
 * <p>
 * <ul><li>{@code public static double sphereVolume(double r)}
 * <li>{@code public static double sphereSurface(double r)}
 * <li>{@code public static double cylinderVolume(double r, double h)}
 * <li>{@code public static double cylinderSurface(double r, double h)}
 * <li>{@code public static double coneVolume(double r, double h)}
 * <li>{@code public static double coneSurface(double r, double h)}</ul>
 * <p>
 * that compute the volume and surface area of a sphere with a radius r, a
 * cylinder with a circular base with radius r and height h, and a cone with
 * a circular base with radius r and height h. Place them into a class
 * {@code Geometry}. Then write a program that prompts the user for the
 * values of r and h, calls the six methods, and prints the results.
 */
public class Geometry
{
    /**
     * Computes sphere volume.
     *
     * @param r the radius
     * @return sphere volume
     */
    public static double sphereVolume(double r)
    {
        return 4.0 / 3 * PI * (r * r * r);
    }

    /**
     * Computes cylinder volume.
     *
     * @param r the radius
     * @param h the height
     * @return cylinder volume
     */
    public static double cylinderVolume(double r, double h)
    {
        return PI * (r * r) * h;
    }

    /**
     * Computes cylinder surface.
     *
     * @param r the radius
     * @param h the height
     * @return cylinder surface
     */
    public static double cylinderSurface(double r, double h)
    {
        return (2 * PI * r * h) + (2 * PI * (r * r));
    }

    /**
     * Computes cone volume.
     *
     * @param r the radius
     * @param h the height
     * @return cone volume
     */
    public static double coneVolume(double r, double h)
    {
        return PI * (r * r) * (h / 3);
    }

    /**
     * Computes cylinder surface.
     *
     * @param r the radius
     * @param h the height
     * @return cylinder surface
     */
    public static double coneSurface(double r, double h)
    {
        return PI * r * (r + sqrt((h * h) + (r * r)));
    }
}
