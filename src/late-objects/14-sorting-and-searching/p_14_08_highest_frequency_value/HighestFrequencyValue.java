package p_14_08_highest_frequency_value;

import java.util.Arrays;

/**
 * Implement the algorithm described in Section 14.7.4, but only remember the
 * value with the highest frequency so far:
 * <p><pre>
 *      int mostFrequent = 0;
 *      int highestFrequency = -1;
 *      for (int i = 0; i < a.length; i++)
 *          Count how often a[i] occurs in a[i + 1]...a[n - 1]
 *          If it occurs more often than highestFrequency
 *              highestFrequency = that count
 *              mostFrequent = a[i]</pre>
 */
public class HighestFrequencyValue
{
    public static void main(String[] args)
    {
        int[] a = ArrayUtil.randomIntArray(20, 30);

        Arrays.sort(a);

        // Print sorted array

        System.out.print("Sorted: [");
        for (int i = 0; i < a.length; i++)
        {
            if (i != a.length - 1)
            {
                System.out.printf("%3d,", a[i]);
            }
            else
            {
                System.out.printf("%3d]%n", a[i]);
            }
        }

        int count = 0;
        int mostFrequent = 0;
        int highestFrequency = -1;

        for (int i = 0; i < a.length; i++)
        {
            count++;
            if (i == a.length - 1 || a[i] != a[i + 1])
            {
                count = 0;
            }

            if (count > highestFrequency)
            {
                highestFrequency = count;
                mostFrequent = a[i];
            }
        }

        System.out.println("Most frequent: " + mostFrequent);
    }
}
