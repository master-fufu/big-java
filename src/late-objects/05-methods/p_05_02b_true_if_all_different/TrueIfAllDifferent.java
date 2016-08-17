package p_05_02b_true_if_all_different;

import java.util.Scanner;

/**
 * Write the following methods and provide a program to test them.
 * b) {@code boolean allDifferent(double x, double y, double z)}, returning
 * true if the arguments are all different
 */
public class TrueIfAllDifferent
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x y z values: ");
        double x = in.nextDouble(), y = in.nextDouble(), z = in.nextDouble();
        System.out.println("All different? " + allDifferent(x, y, z));
    }

    /**
     * The method returns true if the arguments of the calling method are all different.
     *
     * @param x double
     * @param y double
     * @param z double
     * @return true if all arguments are different
     */
    public static boolean allDifferent(double x, double y, double z)
    {
        return x != y && x != z && z != y;
    }
}
