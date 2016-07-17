package p_03_08_two_pairs;

import java.util.Scanner;

/**
 * Write a program that reads four integers and prints "two pairs" if the input
 * consists of two matching pairs (in some order) and "not two pairs" otherwise.
 * For example,
 * <p><pre>
 * 1 2 2 1      two pairs
 * 1 2 2 3      not two pairs
 * 2 2 2 2      two pairs</pre>
 */
public class TwoPairs
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
        System.out.print("Enter fourth integer: ");
        int d = in.nextInt();

        boolean p = ((a == b) && (b == c) && (c == d));
        boolean q = ((a == b) && (c == d));
        boolean r = ((a == d) && (b == c));

        if (p || q || r)
        {
            System.out.println("two pairs");
        }
        else
        {
            System.out.println("not two pairs");
        }
    }
}
