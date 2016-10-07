package p_08_15_Geometry;

import java.util.Scanner;

/**
 * {@code Sphere}, {@code Cone}, {@code Cylinder} demo.
 */
public class SphereConeCylinderDemo
{
    public static void main(String[] args)
    {
        double radius = values("Enter radius value: ");
        double height = values("Enter height value: ");

        Sphere sphere = new Sphere();
        sphere.volume(radius);
        System.out.println("Sphere volume " + sphere.getVolume());

        Cone cone = new Cone();
        cone.volume(radius, height);
        cone.surface(radius, height);
        System.out.println("Cone volume " + cone.getVolume());
        System.out.println("Cone surface " + cone.getSurface());

        Cylinder cylinder = new Cylinder();
        cylinder.volume(radius, height);
        cylinder.surface(radius, height);
        System.out.println("Cylinder volume " + cylinder.getVolume());
        System.out.println("Cylinder surface " + cylinder.getSurface());
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
