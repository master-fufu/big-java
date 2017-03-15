package p_14_18_insertion_sort_w_binary_search;

/**
 * Use insertion sort and the binary search from Exercise P14.15 to sort an
 * array as described in Exercise R14.18. Implement this algorithm and measure
 * its performance.
 * <p>
 * This class sorts an array, using a modified insertion sort algorithm
 */
public class InsertionSorter
{
    private int[] a;
    private BinarySearcher s;

    /**
     * Constructs an insertion sorter.
     *
     * @param anArray the array to sort
     */
    public InsertionSorter(int[] anArray)
    {
        a = anArray;
    }

    /**
     * Sorts the array managed by this insertion sorter.
     */
    public void sort()
    {
        int[] b = new int[a.length];
        s = new BinarySearcher(b);
        int j;

        for (int i = 0; i < a.length; i++)
        {
            int index = s.search(a[i], i - 1);
            if (index < 0)
            {
                index = -index - 1;
            }

            for (j = i; j > index; j--)
            {
                b[j] = b[j - 1];
            }
            b[j] = a[i];
        }

        System.arraycopy(b, 0, a, 0, a.length);
    }
}
