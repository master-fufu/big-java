package p_03_04_compare_numbers;

import java.util.Scanner;

/**
 * Write a program that reads three numbers and prints "all the same" if they are all the same, "all
 * different" if they are all different, and "neither" otherwise.
 */
public class CompareNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter third number: ");
        int c = in.nextInt();

        if (a == b && a == c)
        {
            System.out.println("All the same");
        }
        else if ((a == b) || (a == c) || (c == b))
        {
            System.out.println("Neither");
        }
        else
        {
            System.out.println("All different");
        }
    }
}
