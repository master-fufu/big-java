package p_14_15_bs_position_to_insert_element;

/**
 * Consider the binary search algorithm in Section 14.8. If no match is found,
 * the {@code search} method returns -1. Modify the method so that if a is not
 * found, the method returns <em>-k</em> - 1, where <em>k</em> is the position
 * before which the element should be inserted. (This is the same behavior as
 * {@code Arrays.binarySearch}.)
 */
public class BinarySearcher
{
    /**
     * Finds a value in a range of a sorted array,
     * using the binary search algorithm.
     *
     * @param a     the array in which to search
     * @param low   the low index of the range
     * @param high  the high index of the range
     * @param value the value to find
     * @return the index at which the value occurs, or -1
     * if it does occur in the array
     */
    public static int search(int[] a, int low, int high, int value)
    {
        if (low <= high)
        {
            int mid = (low + high) / 2;

            if (a[mid] == value)
            {
                return mid;
            }
            else if (a[mid] < value)
            {
                return search(a, mid + 1, high, value);
            }
            else
            {
                return search(a, low, mid - 1, value);
            }
        }
        else
        {
            return -(low + 1);
        }
    }
}
