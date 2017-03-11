package p_14_07_bubble_sort;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSorterTest
{
    @Test
    public void bubbleSort() throws Exception
    {
        int[] unsorted = {
                36, 55, 53, 46, 62, 50, 20, 49, 41, 26,
                68, 38, 27, 45, 31, 1, 18, 88, 25, 46
        };

        int[] sorted = {
                1, 18, 20, 25, 26, 27, 31, 36, 38, 41,
                45, 46, 46, 49, 50, 53, 55, 62, 68, 88
        };

        BubbleSorter.bubbleSort(unsorted);

        Assert.assertArrayEquals("Increasing order", sorted, unsorted);
    }
}
