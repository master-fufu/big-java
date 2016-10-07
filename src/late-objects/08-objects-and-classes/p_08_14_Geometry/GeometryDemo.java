package p_08_14_Geometry;

import java.util.Scanner;

/**
 * {@code Geometry} class demo.
 */
public class GeometryDemo
{
    public static void main(String[] args)
    {
        double radius = values("Enter radius value: ");
        double height = values("Enter height value: ");

        double sphereVolume = Geometry.sphereVolume(radius);
        System.out.println("Sphere volume " + sphereVolume);

        double cylinderVolume = Geometry.cylinderVolume(radius, height);
        System.out.println("Cylinder volume " + cylinderVolume);

        double cylinderSurface = Geometry.cylinderSurface(radius, height);
        System.out.println("Cylinder surface " + cylinderSurface);

        double coneVolume = Geometry.coneVolume(radius, height);
        System.out.println("Cone volume " + coneVolume);

        double coneSurface = Geometry.coneSurface(radius, height);
        System.out.println("Cone surface " + coneSurface);
    }

    /**
     * Prompts user for input and returns the value to the calling method.
     *
     * @param prompt the String
     * @return user input, type of int
     */
    public static double values(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextDouble();
    }
}
