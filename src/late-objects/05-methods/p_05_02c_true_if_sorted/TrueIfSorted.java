package p_05_02c_true_if_sorted;

import java.util.Scanner;

/**
 * Write the following methods and provide a program to test them.
 * c) {@code boolean sorted(double x, double y, double z)}, returning true if
 * the arguments are sorted, with the smallest one coming first
 */
public class TrueIfSorted
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x y z values: ");
        double x = in.nextDouble(), y = in.nextDouble(), z = in.nextDouble();
        System.out.println("Sorted? " + sorted(x, y, z));
    }

    /**
     * The method returns true if arguments of the calling method are sorted,
     * with the smallest one coming first.
     *
     * @param x double
     * @param y double
     * @param z double
     * @return true if arguments sorted
     */
    public static boolean sorted(double x, double y, double z)
    {
        return x < y && y < z;
    }
}
