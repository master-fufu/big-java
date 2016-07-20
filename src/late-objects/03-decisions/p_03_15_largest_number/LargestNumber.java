package p_03_15_largest_number;

import java.util.Scanner;

/**
 * Write a program that reads in three floating-point numbers and prints the
 * largest of the three inputs. For example:
 * <p><pre>
 *      Please enter three numbers: 4 9 2.5
 *      The largest number is 9.</pre>
 */
public class LargestNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("First number: ");
        double a = in.nextDouble();
        System.out.print("Second number: ");
        double b = in.nextDouble();
        System.out.print("Third number: ");
        double c = in.nextDouble();

        boolean p = a >= b && a > c; // a is the largest
        boolean q = b > a && b >= c; // b is the largest

        if (p)
        {
            System.out.println(a);
        }
        else if (q)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}
