package p_14_18_insertion_sort_w_binary_search;

import java.util.Arrays;

/**
 * This program tests the insertion sort algorithm by
 * sorting an array that is filled with random numbers.
 */
public class InsertionSorterDemo
{
    public static void main(String[] args)
    {
        int[] a = ArrayUtil.randomIntArray(20, 100);
        System.out.println(Arrays.toString(a));

        InsertionSorter sorter = new InsertionSorter(a);
        sorter.sort();

        System.out.println(Arrays.toString(a));
    }
}
