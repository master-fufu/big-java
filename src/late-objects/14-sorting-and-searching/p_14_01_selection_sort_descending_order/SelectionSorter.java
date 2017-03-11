package p_14_01_selection_sort_descending_order;

/**
 * The sort method of this class sorts an array in descending order,
 * using the selection sort algorithm.
 */
public class SelectionSorter
{
    /**
     * Sorts an array in descending order, using selection sort.
     *
     * @param a the array to sort
     */
    public static void sort(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            int maxPos = largestPosition(a, i);
            ArrayUtil.swap(a, maxPos, i);
        }
    }

    /**
     * Finds the largest element in a tail range of the array.
     *
     * @param a    the array to sort
     * @param from the first position in a to compare
     * @return the position of the largest element in the
     * range a[from] . . . a[a.length - 1]
     */
    private static int largestPosition(int[] a, int from)
    {
        int maxPos = from;
        for (int i = from + 1; i < a.length; i++)
        {
            if (a[i] > a[maxPos])
            {
                maxPos = i;
            }
        }
        return maxPos;
    }
}
