package p_14_07_bubble_sort;

import java.util.Arrays;

/**
 * Implement the bubble sort algorithm described in Exercise R14.19.
 * <p><pre>
 *     While the array is not sorted
 *          For each adjacent pair of elements
 *              If the pair is not sorted
 *                  Swap its elements.</pre>
 */
public class BubbleSorter
{
    public static void main(String[] args)
    {
        int[] array = ArrayUtil.randomIntArray(20, 100);

        System.out.println(Arrays.toString(array));

        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }

    /**
     * Sorts an array using bubble sort algorithm.
     *
     * @param A an array to sort
     */
    public static void bubbleSort(int[] A)
    {
        for (int i = 0; i < A.length; i++)
        {
            boolean swapped = false;

            for (int j = 0; j < A.length - i - 1; j++)
            {
                if (A[j] > A[j + 1])
                {
                    ArrayUtil.swap(A, j, j + 1);
                    swapped = true;
                }

            }

            if (!swapped)
            {
                break;
            }

        }
    }
}
