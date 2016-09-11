package p_06_11_check_arrays_for_same_elements_and_multiplicities;

import java.util.Arrays;

/**
 * Write a method
 * <p><pre>
 *      public static boolean sameElements(int[] a, int[] b)</pre>
 * that checks whether two arrays have the same elements in some order, with
 * the same multiplicities. For example,
 * <p><pre>
 *      1 4 9 16 9 7 4 9 11</pre>
 * and
 * <p><pre>
 *      11 1 4 9 16 9 7 4 9</pre>
 * would considered identical, but
 * <p><pre>
 *      1 4 9 16 9 7 4 9 11</pre>
 * and
 * <p><pre>
 *      11 11 7 9 16 4 1 4 9</pre>
 * would not. You will probably need one or more helper methods.
 */
public class CheckArraysForSameElementsAndMultiplicities
{
    public static void main(String[] args)
    {
        int[] arr1 = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        int[] arr2 = {11, 1, 4, 9, 16, 9, 7, 4, 9};
        int[] arr3 = {11, 11, 7, 9, 16, 4, 1, 4, 9};

        printArray(sortArray(arr1));
        printArray(sortArray(arr2));
        printArray(sortArray(arr3));

        boolean result1 = arraysAreEqual(sortArray(arr1), sortArray(arr2));
        System.out.println("arr1 and arr2 are equal: " + result1);

        boolean result2 = arraysAreEqual(sortArray(arr1), sortArray(arr3));
        System.out.println("arr1 and arr3 are equal: " + result2);

    }

    /**
     * Check whether arrays are equal.
     *
     * @param A array, type of int
     * @param B array, type of int
     * @return TRUE if arrays are equal
     */
    public static boolean arraysAreEqual(int[] A, int[] B)
    {
        boolean result = false;

        if (A.length == B.length)
        {
            for (int i = 0; i < A.length; i++)
            {
                if (A[i] != B[i])
                {
                    return false;
                }
            }
            result = true;
        }
        return result;
    }

    /**
     * This method sorts the array using Arrays.sort() method.
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
