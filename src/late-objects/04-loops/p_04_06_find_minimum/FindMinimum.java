package p_04_06_find_minimum;

import java.util.Scanner;

/**
 * Translate the pseudocode for finding the minimum value from a set of inputs
 * into a Java program.
 * 7 7 9 11 14 16 19 19 17 13 10 7 stop
 */
public class FindMinimum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter values: ");

        boolean first = true;
        double min = 0;

        while (in.hasNextDouble())
        {
            double value = in.nextDouble();

            if (first)
            {
                min = value;
                first = false;
            }
            else if (value < min)
            {
                min = value;
            }
        }
        System.out.printf("Minimum value: %.2f%n", min);
    }
}
