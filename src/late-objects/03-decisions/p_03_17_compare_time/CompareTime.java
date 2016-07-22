package p_03_17_compare_time;

import java.util.Scanner;

/**
 * Write a program that prompts the user for two points in time and prints the time that
 * comes first, then the other time.
 */
public class CompareTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter time in military format: ");
        String x = in.next();
        String y = in.next();

        if (x.length() != 4 || y.length() != 4)
        {
            System.out.println("Enter four digit time. Try again.");
        }
        else if (x.substring(0, 2).compareTo(y.substring(0, 2)) < 0)
        {
            System.out.println("Time one comes first");
        }
        else if (x.substring(0, 2).compareTo(y.substring(0, 2)) == 0)
        {
            if (x.substring(2).compareTo(y.substring(2)) < 0)
            {
                System.out.println("Time one comes first");
            }
            else if (x.substring(2).compareTo(y.substring(2)) == 0)
            {
                System.out.println("Time 1 and time 2 are the same");
            }
            else
            {
                System.out.println("Time 2 comes first");
            }
        }
        else
        {
            System.out.println("Time 2 comes first");
        }
    }
}
