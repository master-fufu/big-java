package p_14_06_insertion_sort;

import java.util.Scanner;

/**
 * This program measures how long it takes to sort an array of a user-specified
 * size with the insertion sort algorithm.
 */
public class InsertionSortTimer
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter smallest array size: ");
        int smallest = in.nextInt();

        System.out.print("Enter largest array size: ");
        int largest = in.nextInt();

        System.out.print("Enter number of measurements (>=2): ");
        int measurements = in.nextInt();

        for (int i = 0; i < measurements; i++)
        {
            int n = smallest + i * (largest - smallest) / (measurements - 1);
            int[] a = ArrayUtil.randomIntArray(n, 100);

            // Use stopwatch to time insertion sort

            StopWatch timer = new StopWatch();

            timer.start();
            InsertionSorter.sort(a);
            timer.stop();

            double seconds = timer.getElapsedTime() * 0.001;
            System.out.println("Array size: " + n + ", Elapsed time: " + seconds + " " + "seconds");
        }
    }
}
