package p_14_06_insertion_sort;

import java.util.Arrays;

/**
 * {@code InsertionSortDemo} class.
 */
public class InsertionSortDemo
{
    public static void main(String[] args)
    {
        int[] a = ArrayUtil.randomIntArray(20, 100);
        System.out.println(Arrays.toString(a));

        InsertionSorter.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
