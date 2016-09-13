package p_06_14_generate_print_sort;

import java.util.Arrays;

/**
 * Write a program that generates a sequence of 20 random values between 0
 * and 99 in an array, prints the sequence, sorts it, and prints the sorted
 * sequence. Use the sort method from the standard Java library.
 */
public class GeneratePrintSort
{
    public static void main(String[] args)
    {
        int[] arr = randomArray(20);
        printArray(arr);
        printArray(sort(arr));
    }

    /**
     * Initialise array with random values from 0 to 99.
     *
     * @param l length of an array
     * @return array with random values
     */
    public static int[] randomArray(int l)
    {
        int[] A = new int[l];
        for (int i = 0; i < A.length; i++)
        {
            A[i] = (int) (Math.random() * 100);
        }
        return A;
    }

    /**
     * Prints an array.
     *
     * @param A array, type of int
     */
    public static void printArray(int[] A)
    {
        for (int el : A)
        {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    /**
     * Sorts an array.
     *
     * @param A array, type of int
     * @return sorted array
     */
    public static int[] sort(int[] A)
    {
        Arrays.sort(A);
        return A;
    }
}
