package p_14_15_bs_position_to_insert_element;

import java.util.Arrays;

/**
 * Consider the binary search algorithm in Section 14.8. If no match is found,
 * the {@code search} method returns -1. Modify the method so that if a is not
 * found, the method returns <em>-k</em> - 1, where <em>k</em> is the position
 * before which the element should be inserted. (This is the same behavior as
 * {@code Arrays.binarySearch}.)
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

        int toFind = 2;
        int value = BinarySearcher.search(A, 0, A.length - 1, toFind);

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
