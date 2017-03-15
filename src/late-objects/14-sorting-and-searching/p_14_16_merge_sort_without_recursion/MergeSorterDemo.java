package p_14_16_merge_sort_without_recursion;

import java.util.Arrays;

/**
 * {@code MergeSorterDemo} class.
 */
public class MergeSorterDemo
{
    public static void main(String[] args)
    {
        int[] a = ArrayUtil.randomIntArray(20, 100);
        System.out.println(Arrays.toString(a));

        IterativeMergeSorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
