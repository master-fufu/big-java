package p_13_08_largest_element_in_array;

/**
 * Using recursion, find the largest element in an array.
 * <p>
 * <em>Hint:</em> Find the largest element in the subset containing all but the
 * last element. Then compare that maximum to the value of the last element.
 */
public class LargestElement
{
    public static void main(String[] args)
    {
        int[] array = {-4, 0, 5, 13, -5, 8};

        System.out.println(largest(array));
    }

    /**
     * Finds the largest element in the array.
     *
     * @param A the array of data
     * @return the largest element
     */
    public static int largest(int[] A)
    {
        return largest(A, 0, A.length - 1);
    }

    /**
     * Recursive helper method to find the largest element in the array.
     *
     * @param A     the array of data
     * @param first the first index of the array
     * @param last  the last index the last index of the array
     * @return the largest element
     */
    public static int largest(int[] A, int first, int last)
    {
        int max;

        if (first == last)
        {
            return A[first];
        }
        else
        {
            max = largest(A, first + 1, last);

            if (A[first] >= max)
            {
                return A[first];
            }
            else
            {
                return max;
            }
        }
    }
}
