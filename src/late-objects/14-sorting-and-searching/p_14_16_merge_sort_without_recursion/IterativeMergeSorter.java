package p_14_16_merge_sort_without_recursion;

/**
 * Implement the sort method of the merge sort algorithm without recursion,
 * where the length of the array is a power of 2. First merge adjacent regions
 * of size 1, then adjacent regions of size 2, then adjacent regions of size 4,
 * and so on.
 */
public class IterativeMergeSorter
{
    /**
     * Sorts an array, using merge sort.
     *
     * @param a the array to sort
     */
    public static void sort(int[] a)
    {
        int length = 1; // the size of the sorted areas; power of 2

        while (length <= a.length)
        {
            int start = 0; // sort starts at the beginning of the array

            while (start + 2 * length <= a.length)
            {
                // merge all adjacent areas of size length
                // into sorted areas of size 2 * length
                merge(start, start + length - 1, start + 2 * length - 1, a);
                start = start + 2 * length;
            }

            // if there were some elements that weren't sorted in
            // this pass, then sort them now
            if (start + length <= a.length)
            {
                merge(start, start + length - 1, a.length - 1, a);
            }
            length = length * 2; // double the size of the next sort areas
            start = 0; // start the sort pass at the beginning of the array
        }
    }

    /**
     * Merges two sorted arrays into an array.
     *
     * @param first  the first sorted array
     * @param second the second sorted array
     * @param a      the array into which to merge first and second
     */
    private static void merge(int from, int mid, int to, int[] a)
    {
        int n = to - from + 1; // size of the range to be merged
        int[] b = new int[n]; // merge both halves into a temporary vector b

        int i1 = from; // next element to consider in the first half
        int i2 = mid + 1; // next element to consider in the second half
        int j = 0; // next open position in b


        // As long as neither i1 nor i2 past the end,
        // move the smaller element into b

        while (i1 <= mid && i2 <= to)
        {
            if (a[i1] < a[i2])
            {
                b[j] = a[i1];
                i1++;
            }
            else
            {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        // Copy any remaining entries of the first array

        while (i1 <= mid)
        {
            b[j] = a[i1];
            i1++;
            j++;
        }

        // Copy any remaining entries of the second half

        while (i2 <= to)
        {
            b[j] = a[i2];
            i2++;
            j++;
        }

        // Copy back from the temporary vector

        for (j = 0; j < n; j++)
        {
            a[from + j] = b[j];
        }
    }
}
