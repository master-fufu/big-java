package p_06_10_check_if_arrays_have_same_elements;

import java.util.Arrays;

/**
 * Write a method
 * <p><pre>
 *      public static boolean sameSet(int[] a, int[] b)</pre>
 * that checks whether two arrays have the same elements in some order,
 * ignoring duplicates. For example, the two arrays
 * <p><pre>
 *      1 4 9 16 9 7 4 9 11</pre>
 * and
 * <p><pre>
 *      11 11 7 9 16 4 1</pre>
 * would be considered identical. You will probably need one or
 * more helper methods.
 */
public class CheckIfArraysHaveSameElements
{
    public static void main(String[] args)
    {
        int[] a1 = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        int[] a2 = {11, 11, 7, 9, 16, 4, 1};

        printArray(sortArray(a1));
        printArray(sortArray(a2));

        boolean result = sameSet(removeDuplicates(sortArray(a1)),
                removeDuplicates(sortArray(a2)));

        System.out.println(result);
    }

    public static boolean sameSet(int[] A, int[] B)
    {
        return Arrays.equals(A, B);
    }

    /**
     * This method removes duplicate values from the array.
     *
     * @param A array, int
     * @return array with unique values
     */
    public static int[] removeDuplicates(int[] A)
    {
        int m = 0;
        int n = 1;
        while (n < A.length)
        {
            if (A[n] == A[m])
            {
                n++;
            }
            else
            {
                m++;
                A[m] = A[n];
                n++;
            }
        }
        return Arrays.copyOf(A, m + 1);
    }

    /**
     * This method sorts the array using Arrays.sort method.
     *
     * @param A array, int
     * @return sorted array
     */
    public static int[] sortArray(int[] A)
    {
        Arrays.sort(A);
        return A;
    }

    /**
     * This method prints an array.
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
}
