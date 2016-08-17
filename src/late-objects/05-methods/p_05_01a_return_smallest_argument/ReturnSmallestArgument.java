package p_05_01a_return_smallest_argument;

import java.util.Scanner;

/**
 * Write the following methods and provide a program to test them.
 * a) {@code double smallest(double x, double y, double z)}, returning the
 * smallest of the arguments.
 */
public class ReturnSmallestArgument
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x y z values: ");
        double x = in.nextDouble(), y = in.nextDouble(), z = in.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z));
    }

    /**
     * The method returns the smallest value of the parameters.
     *
     * @param x double
     * @param y double
     * @param z double
     * @return smallest value
     */
    public static double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    }
}
