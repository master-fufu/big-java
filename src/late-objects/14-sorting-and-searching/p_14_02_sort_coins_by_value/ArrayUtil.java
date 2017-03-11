package p_14_02_sort_coins_by_value;

/**
 * This class contains utility methods for array manipulation.
 */
public class ArrayUtil
{
    /**
     * Swaps two entries of an array.
     *
     * @param a the array
     * @param i the first position to swap
     * @param j the second position to swap
     */
    public static void swap(Coin[] a, int i, int j)
    {
        Coin temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
