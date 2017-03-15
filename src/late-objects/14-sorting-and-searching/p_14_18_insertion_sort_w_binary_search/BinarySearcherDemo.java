package p_14_18_insertion_sort_w_binary_search;

import java.util.Arrays;

/**
 * {@code BinarySearcherDemo} class.
 */
public class BinarySearcherDemo
{
    public static void main(String[] args)
    {
        int[] A = {
                21, 32, 34, 93, 3, 80, 67, 56, 83, 59,
                0, 6, 37, 47, 77, 74, 40, 94, 69, 85
        };
        System.out.println("Unsorted: " + Arrays.toString(A));
        Arrays.sort(A);
        System.out.println("Sorted:   " + Arrays.toString(A));

        BinarySearcher binarySearcher = new BinarySearcher(A);

        int toFind = 94;

        int value = binarySearcher.search(toFind, A.length - 1);

        if (value > 0)
        {
            System.out.println("Value " + toFind + " found on " + value + " " + "position");
        }
        else
        {
            System.out.println("Value " + toFind + " is not found.");
            System.out.println("The method returned " + value);
        }
    }
}
