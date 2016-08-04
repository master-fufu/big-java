package p_04_05_average_small_large_range;

import java.util.Scanner;

/**
 * Write a program that reads a set of floating point values. Ask the user to
 * enter the values, then print: a) the average of the values. b) the smallest
 * of the values. c) the largest of the values. d) the range, that is the
 * difference between the smallest and largest. Of course, you may only prompt
 * for the values once.
 * 0 1 3 3 4 5 5 10 6 6 -3 6 2 s
 */
public class AverageSmallLargeRange
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Sequence of numbers: ");

        double number = in.nextDouble();
        double min = number;
        double max = number;
        double sum = number;
        int total_numbers = 1;

        while (in.hasNextDouble())
        {
            number = in.nextDouble();
            sum += number;
            total_numbers++;

            if (number > max)
            {
                max = number;
            }
            else if (number < min)
            {
                min = number;
            }
        }
        System.out.printf("Average: %.2f / %d = %.2f\n", sum, total_numbers, (sum / total_numbers));
        System.out.printf("Smallest: %.2f\n", min);
        System.out.printf("Largest: %.2f\n", max);
        System.out.printf("Difference: %.2f\n", (max - min));
    }
}


