package p_14_02_sort_coins_by_value;

/**
 * {@code SelectionSorter} class.
 */
public class SelectionSorter
{
    private Coin[] coins;

    public SelectionSorter(Coin[] coins)
    {
        this.coins = coins;
    }

    /**
     * Sorts an array of coins, using selection sort.
     */
    public void sort()
    {
        for (int i = 0; i < coins.length - 1; i++)
        {
            int minPos = minimumPosition(coins, i);
            ArrayUtil.swap(coins, minPos, i);
        }
    }

    /**
     * Finds the smallest element in a tail range of the array.
     *
     * @param a    the array to sort
     * @param from the first position in a to compare
     * @return the position of the smallest element in the
     * range a[from] . . . a[a.length - 1]
     */
    private static int minimumPosition(Coin[] a, int from)
    {
        int minPos = from;
        for (int i = from + 1; i < a.length; i++)
        {
            if (a[i].getValue() < a[minPos].getValue())
            {
                minPos = i;
            }
        }
        return minPos;
    }
}
