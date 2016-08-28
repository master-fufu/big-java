package p_05_09_volume_and_surface_area;

import java.util.Scanner;

/**
 * Write methods
 * <p><pre>
 *      public static double sphereVolume(double r)
 *      public static double sphereSurface(double r)
 *      public static double cylinderVolume(double r, double h)
 *      public static double cylinderSurface(double r, double )
 *      public static double coneVolume (double r, double h)
 *      public static double coneSurface (double r, double h)</pre>
 * that compute the volume and surface area of a sphere with radius {@code r},
 * a cylinder with a circular base with radius {@code r} and height {@code h},
 * and a cone with a circular base with radius {@code r} and height {@code h}.
 * Then write a program that prompts the user for the values of {@code r} and
 * {@code h}, calls the six methods, and prints the results.
 */
public class VolumeAndSurfaceArea
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter values of radius and height: ");
        double r = in.nextDouble(), h = in.nextDouble();

        System.out.printf("%s%.2f%n", "Sphere volume = ", sphereVolume(r));
        System.out.printf("%s%.2f%n", "Sphere surface = ", sphereSurface(r));
        System.out.printf("%s%.2f%n", "Cylinder volume = ", cylinderVolume(r, h));
        System.out.printf("%s%.2f%n", "Cylinder surface = ", cylinderSurface(r, h));
        System.out.printf("%s%.2f%n", "Cone volume = ", coneVolume(r, h));
        System.out.printf("%s%.2f%n", "Cone surface = ", coneSurface(r, h));
    }

    /**
     * The method computes sphere volume
     *
     * @param r double
     * @return volume
     */
    public static double sphereVolume(double r)
    {
        return (4 / 3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * The method computes sphere surface area
     *
     * @param r double
     * @return sphere surface area
     */
    public static double sphereSurface(double r)
    {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    /**
     * The method computes cylinder volume
     *
     * @param r double
     * @param h double
     * @return cylinder volume
     */
    public static double cylinderVolume(double r, double h)
    {
        return Math.PI * Math.pow(r, 2) * h;
    }

    /**
     * The method computes cylinder surface area
     *
     * @param r double
     * @param h double
     * @return cylinder surface area
     */
    public static double cylinderSurface(double r, double h)
    {
        return 2 * Math.PI * r * h + 2 * Math.PI * Math.pow(r, 2);
    }

    /**
     * The method computes cone volume
     *
     * @param r double
     * @param h double
     * @return cone volume
     */
    public static double coneVolume(double r, double h)
    {
        return Math.PI * Math.pow(r, 2) * (h / 3);
    }

    /**
     * The method computes cone surface area
     *
     * @param r double
     * @param h double
     * @return cone surface area
     */
    public static double coneSurface(double r, double h)
    {
        return Math.PI * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)));
    }
}
