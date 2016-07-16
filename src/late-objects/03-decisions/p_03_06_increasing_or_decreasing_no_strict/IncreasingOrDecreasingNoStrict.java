package p_03_06_increasing_or_decreasing_no_strict;

import java.util.Scanner;

/**
 * Repeat Exercise P3.5, but before reading the numbers, ask the user whether
 * increasing/decreasing should be "strict" or "lenient". In lenient mode, the
 * sequence 3 4 4 is increasing and the sequence 4 4 4 is both increasing and
 * decreasing.
 */
public class IncreasingOrDecreasingNoStrict
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

        System.out.print("Tap 1 for 'strict' or 2 for 'lenient' number order: ");
        int choice = in.nextInt();

        if (choice == 1)
        {
            System.out.print("Strict mode: ");
            if (a < b && b < c)
            {
                System.out.println("increasing order");
            }
            else if (a > b && b > c)
            {
                System.out.println("decreasing order");
            }
            else
            {
                System.out.println("neither");
            }
        }
        else if (choice == 2)
        {
            System.out.print("Lenient mode: ");
            if ((a <= b && b < c) || (a < b && b <= c))
            {
                System.out.println("increasing order");
            }
            else if ((a >= b && b > c) || (a > b && b >= c))
            {
                System.out.println("decreasing order");
            }
            else if (a == b && b == c)
            {
                System.out.println("both increasing and decreasing");
            }
            else
            {
                System.out.println("please try again");
            }
        }
        else
        {
            System.out.println("Please try again and tap 1 or 2");
        }
    }
}
