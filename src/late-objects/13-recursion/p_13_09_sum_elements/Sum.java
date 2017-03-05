package p_13_09_sum_elements;

/**
 * Using recursion, compute the sum of all values in an array.
 */
public class Sum
{
    public static void main(String[] args)
    {
        int[] A = {1, 2, 3, 4, 5};

        int result = sum(A);

        System.out.println(result);
    }

    /**
     * Recursively sums all elements of the array.
     *
     * @param A the array of values
     * @return the sum of the elements
     */
    public static int sum(int[] A)
    {
        return sum(A, A.length - 1);
    }

    /**
     * Recursive helper method to find a sum of all array elements.
     *
     * @param A     the array of values
     * @param index the starting position
     * @return the sum of all elements
     */
    public static int sum(int[] A, int index)
    {
        if (index == 0)
        {
            return A[0];
        }
        else
        {
            return A[index] + sum(A, index - 1);
        }
    }
}
