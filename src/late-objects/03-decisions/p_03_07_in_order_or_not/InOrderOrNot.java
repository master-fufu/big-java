package p_03_07_in_order_or_not;

import java.util.Scanner;

/**
 * Write a program that reads in three integers and prints “in order” if they
 * are sorted in ascending or descending order, or “not in order” otherwise.
 * For example,
 * <p><pre>
 * 1 2 5    in order
 * 1 5 2    not in order
 * 5 2 1    in order
 * 1 2 2    in order</pre>
 */
public class InOrderOrNot
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = in.nextInt();
        System.out.print("Enter second integer: ");
        int b = in.nextInt();
        System.out.print("Enter third integer: ");
        int c = in.nextInt();

        if ((a <= b && b < c) || (a < b && b <= c) || (a >= b && b > c) || (a > b && b >= c))
        {
            System.out.println("In order");
        }
        else
        {
            System.out.println("Not in order");
        }
    }
}
