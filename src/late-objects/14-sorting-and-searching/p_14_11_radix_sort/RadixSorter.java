package p_14_11_radix_sort;

import java.util.Arrays;

/**
 * Implement the radix sort algorithm described in Exercise R14.20 to sort
 * arrays of numbers between 0 and 999.
 * <p>
 * R14.20. The <em>radix</em> sort algorithm sorts an array of <em>n</em>
 * integers with <em>d</em> digits, using ten auxiliary arrays. First place
 * each value <em>v</em> into the auxiliary array whose index corresponds to
 * the last digit of <em>v</em>. Then move all values back into the original
 * array, preserving their order. Repeat the process, now using the next-to-last
 * (tens) digit, then the hundreds digit, and so on. What is the big-Oh time
 * of this algorithm in terms of <em>n</em> and <em>d</em>? When is this
 * algorithm preferable to merge sort?
 */
public class RadixSorter
{
    // A utility function to get maximum value in arr[]
    public static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > mx)
            {
                mx = arr[i];
            }
        }
        return mx;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    public static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
        {
            count[(arr[i] / exp) % 10]++;
        }

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
        {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (i = n - 1; i >= 0; i--)
        {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++)
        {
            arr[i] = output[i];
        }
    }

    // The main function to that sorts arr[] of size n using Radix Sort
    static void radixSort(int arr[], int n)
    {
        // Find the maximum number to know number of digits
        int m = getMax(arr, n);

        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
        {
            countSort(arr, n, exp);
        }
    }
}

