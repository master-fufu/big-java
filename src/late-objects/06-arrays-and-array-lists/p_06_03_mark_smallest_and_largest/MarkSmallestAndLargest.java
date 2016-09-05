package p_06_03_mark_smallest_and_largest;

import java.util.Scanner;

/**
 * Modify the {@code LargestInArray.java} program in Section 6.3 to mark
 * both the smallest and the largest elements
 */
public class MarkSmallestAndLargest
{
    public static void main(String[] args)
    {
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0;

        // Read inputs

        System.out.print("Please enter values, Q to quit: ");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble() && currentSize < values.length)
        {
            values[currentSize] = in.nextDouble();
            currentSize++;
        }

        // Find the largest value

        double largest = values[0];
        double smallest = values[0];
        for (int i = 1; i < currentSize; i++)
        {
            if (values[i] > largest)
            {
                largest = values[i];
            }
            else if (values[i] < smallest)
            {
                smallest = values[i];
            }
        }

        // Print all values, marking the largest

        for (int i = 0; i < currentSize; i++)
        {
            System.out.print(values[i]);
            if (values[i] == largest)
            {
                System.out.print(" <<<< largest value");
            }
            else if (values[i] == smallest)
            {
                System.out.print(" <<<< smallest value");
            }
            System.out.println();
        }
    }
}
