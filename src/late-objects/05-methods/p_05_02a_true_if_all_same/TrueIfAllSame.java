package p_05_02a_true_if_all_same;

import java.util.Scanner;

/**
 * Write the following methods and provide a program to test them.
 * a) {@code boolean allTheSame(double x, double y, double z)}, returning true
 * if the arguments are all the same
 */
public class TrueIfAllSame
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x y z values: ");
        double x = in.nextDouble(), y = in.nextDouble(), z = in.nextDouble();
        System.out.println("All the same? " + allTheSame(x, y, z));
    }

    /**
     * The method returns true if all parameters are of the same value
     *
     * @param x double
     * @param y double
     * @param z double
     * @return true if all parameters are the same
     */
    public static boolean allTheSame(double x, double y, double z)
    {
        return x == y && x == z;
    }
}
