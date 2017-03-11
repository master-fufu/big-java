package p_14_04_merge_sort_strings_lexicographically;

import java.util.Arrays;

/**
 * This program demonstrates the merge sort algorithm by
 * sorting an array that is filled with random numbers.
 */
public class MergeSortDemo
{
    public static void main(String[] args)
    {
        String[] strings = {
                "Tom", "tom", "dad", "daddy",
                "car", "arch", "eat", "test",
                "rum", "Dodge", ".bashrc"
        };

        System.out.println(Arrays.toString(strings));

        MergeSorter.sort(strings);
        System.out.println(Arrays.toString(strings));
    }
}
