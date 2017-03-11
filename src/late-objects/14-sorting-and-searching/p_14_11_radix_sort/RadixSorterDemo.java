package p_14_11_radix_sort;

import java.util.Arrays;

/**
 * {@code RadixSorterDemo} class.
 */
public class RadixSorterDemo
{
    public static void main(String[] args)
    {
        int[] array = ArrayUtil.randomIntArray(20, 100);
        System.out.println(Arrays.toString(array));

        RadixSorter.radixSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}
