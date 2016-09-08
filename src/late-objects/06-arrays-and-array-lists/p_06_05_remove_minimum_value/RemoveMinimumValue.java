package p_06_05_remove_minimum_value;

/**
 * Write a method {@code public static void removeMin} that removes the minimum
 * value from a partially filled array without calling other methods.
 */
public class RemoveMinimumValue
{
    public static void main(String[] args)
    {
        int len = 15;
        int currentSize = len / 2;

        printArray(partFilledArray(len, currentSize));

        removeMin(partFilledArray(len, currentSize), currentSize);
    }

    /**
     * This method removes the minimum value from a partially filled array.
     *
     * @param A           array, int
     * @param currentSize current size of the array, int
     */
    public static void removeMin(int[] A, int currentSize)
    {
        int min = 0;
        for (int i = 0; i < currentSize; i++)
        {
            if (A[i] < A[min])
            {
                min = i;
            }
        }

        for (int i = min + 1; i < currentSize; i++)
        {
            A[i - 1] = A[i];
        }
        currentSize--;

        for (int i = 0; i < currentSize; i++)
        {
            System.out.print(A[i] + " ");
        }
    }

    /**
     * The method creates partially filled array.
     *
     * @param l length of the array, int
     * @param s current size of the array, int
     * @return array, type of int
     */
    public static int[] partFilledArray(int l, int s)
    {
        final int LENGTH = l;
        int[] A = new int[LENGTH];

        for (int i = 0; i < s; i++)
        {
            A[i] = i + 1;
        }
        return A;
    }

    /**
     * This method prints an array.
     *
     * @param A array, type of int
     */
    public static void printArray(int[] A)
    {
        for (int el : A)
        {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
