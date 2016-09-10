package p_06_09_check_if_arrays_equal;

/**
 * Write a method
 * <p><pre>
 *      public static boolean equals(int[] a, int[] b)</pre>
 * that checks whether two arrays have the same elements in the same order.
 */
public class CheckIfArraysEqual
{
    public static void main(String[] args)
    {
        // Test random

        int[] r1 = randomArray();
        int[] r2 = randomArray();

        boolean resultRandom = equals(r1, r2);
        System.out.println("Random: " + resultRandom);

        // Test sorted

        int[] s1 = sortedArray();
        int[] s2 = sortedArray();

        boolean resultSorted = equals(s1, s2);
        System.out.println("Sorted: " + resultSorted);
    }

    /**
     * Method checks whether two arrays have
     * the same elements in the same order.
     *
     * @param A array, int
     * @param B array, int
     * @return TRUE or FALSE
     */
    public static boolean equals(int[] A, int[] B)
    {
        if (A.length == B.length)
        {
            int count = 0;

            for (int i = 0; i < A.length; i++)
            {
                if (A[i] == B[i])
                {
                    count++;
                }
            }
            if (count == A.length)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * This method initializes array with random integers from 1 to 10.
     *
     * @return array, type of int
     */
    public static int[] randomArray()
    {
        int[] A = new int[10];
        for (int i = 0; i < A.length; i++)
        {
            A[i] = (int) (Math.random() * 10 + 1);
        }
        return A;
    }

    /**
     * This method initializes sorted array with values from 0 to 9.
     *
     * @return array, type of int
     */
    public static int[] sortedArray()
    {
        int[] A = new int[10];
        for (int i = 0; i < A.length; i++)
        {
            A[i] = i;
        }
        return A;
    }
}
