package p_03_16_sort_lexicographically;

import java.util.Scanner;

/**
 * Write a program that reads in three strings and sorts them lexicographically.
 * Enter three strings: Charlie Able Baker
 */
public class SortLexicographically
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three strings: ");
        String a = in.next();
        String b = in.next();
        String c = in.next();

        if (a.compareTo(b) < 0 && a.compareTo(c) < 0)
        {
            System.out.println(a);
            if (b.compareTo(c) < 0)
            {
                System.out.println(b);
                System.out.println(c);
            }
            else
            {
                System.out.println(c);
                System.out.println(b);
            }
        }
        else if (a.compareTo(b) > 0 && b.compareTo(c) < 0)
        {
            System.out.println(b);
            if (a.compareTo(c) < 0)
            {
                System.out.println(a);
                System.out.println(c);
            }
            else
            {
                System.out.println(c);
                System.out.println(a);
            }
        }
        else
        {
            System.out.println(c);
            if (a.compareTo(b) < 0)
            {
                System.out.println(a);
                System.out.println(b);
            }
            else
            {
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}
