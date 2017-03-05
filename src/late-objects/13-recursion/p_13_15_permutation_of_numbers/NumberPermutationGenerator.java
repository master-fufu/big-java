package p_13_15_permutation_of_numbers;

/**
 * {@code NumberPermutationGenerator} class.
 */
public class NumberPermutationGenerator
{
    private int[] a;
    private boolean done;

    public NumberPermutationGenerator(int n)
    {
        a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = i;
        }
    }

    public int[] nextPermutation()
    {
        if (a.length <= 1)
        {
            return a;
        }
        for (int i = a.length - 1; i > 0 ; i--)
        {
            if (a[i - 1] < a[i])
            {
                int j = a.length - 1;
                while (a[i - 1] > a[j])
                {
                    j--;
                }
                swap(i - 1, j);
                reverse(i, a.length - 1);
                return a;
            }
        }
        return a;
    }

    public boolean hasMorePermutations()
    {
        if (a.length <= 1)
        {
            return false;
        }
        for (int i = a.length - 1; i > 0; i--)
        {
            if (a[i - 1] < a[i])
            {
                return true;
            }
        }
        return false;
    }

    public void swap(int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void reverse(int i, int j)
    {
        while (i < j)
        {
            swap(i, j);
            i++;
            j--;
        }
    }
}
