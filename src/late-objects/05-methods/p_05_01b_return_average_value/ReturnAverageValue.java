package p_05_01b_return_average_value;

import java.util.Scanner;

/**
 * Write the following methods and provide a program to test them.
 * b) {@code double average(double x, double y, double z)}, returning the
 * average of the arguments.
 */
public class ReturnAverageValue
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x y z values: ");
        double x = in.nextDouble(), y = in.nextDouble(), z = in.nextDouble();
        System.out.print("The average is " + average(x, y, z));
    }

    /**
     * The method returns the average of x y z parameters.
     *
     * @param x double
     * @param y double
     * @param z double
     * @return average
     */
    public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
}
