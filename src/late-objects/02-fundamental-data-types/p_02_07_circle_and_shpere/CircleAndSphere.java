package p_02_07_circle_and_shpere;

import java.util.Scanner;

/**
 * Write a program that prompts user for for a radius and then prints:
 * <p><ul>
 * <li> The area and circumference of circle with that radius
 * <li> The volume and surface area of a sphere with that radius
 * </ul>
 */
public class CircleAndSphere
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of the radius: ");
        double r = in.nextDouble();
        System.out.println("");

        double area = Math.PI * Math.pow(r, 2);
        System.out.printf("The area of the circle with r = %.2f is %.2f\n", r, area);

        double circumference = 2 * Math.PI * r;
        System.out.printf("The circumference of the circle with r = %.2f is %.2f\n", r, circumference);

        double volume = 4 / 3 * Math.PI * Math.pow(r, 3);
        System.out.printf("The volume of the sphere with r = %.2f is %.2f\n", r, volume);

        double surfaceArea = 4 * Math.PI * Math.pow(r, 2);
        System.out.printf("The surface area of the shere with r = %.2f is %.2f\n", r, surfaceArea);
    }
}
