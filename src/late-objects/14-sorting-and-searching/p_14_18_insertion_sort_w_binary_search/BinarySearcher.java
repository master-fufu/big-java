package p_14_18_insertion_sort_w_binary_search;

/**
 * Binary search algorithm. The {@code search} mehtod returns -k -1 if the
 * value is not found in the array. {@code k} is the postion before which the
 * element should be inserted. If the value is found, the {@code search}
 * mehtod returns the position at which the value occurs in the array.
 */
public class BinarySearcher
{
    private int[] a;

    /**
     * Constructs a BinarySearcher.
     *
     * @param anArray a sorted array of integers
     */
    public BinarySearcher(int[] anArray)
    {
        a = anArray;
    }

    /**
     * Finds a value in a sorted array,
     * using the binary search algorithm.
     *
     * @param value the value to search
     * @param high the last index in the array to concider
     * @return the index at which value occurs, or -k - 1
     * if it does not occur in the array
     */
    public int search(int value, int high)
    {
        int low = 0;

        while (low <= high)
        {
            int mid = (low + high) / 2;
            int diff = a[mid] - value;

            if (diff == 0) // a[mid] == value
            {
                return mid;
            }
            else if (diff < 0) // a[mid] < v
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -(low + 1);
    }
}
