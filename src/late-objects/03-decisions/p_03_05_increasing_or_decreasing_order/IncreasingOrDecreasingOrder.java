package p_03_05_increasing_or_decreasing_order;

import java.util.Scanner;

/**
 * Write a program that reads in three numbers and prints "increasing" if they
 * are in increasing order, "decreasing" if they are in decreasing order, and
 * "neither" otherwise. Here, "increasing" means "strictly increasing", with
 * each value larger than its predecessor. The sequence 3 4 4 would not be
 * considered increasing.
 */
public class IncreasingOrDecreasingOrder
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = in.nextDouble();

        System.out.print("Enter second number: ");
        double b = in.nextDouble();

        System.out.print("Enter third number: ");
        double c = in.nextDouble();

        if (a < b && b < c)
        {
            System.out.println("Increasing order");
        }
        else if (a > b && b > c)
        {
            System.out.println("Decreasing order");
        }
        else
        {
            System.out.println("Neither");
        }
    }
}
