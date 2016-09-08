package p_06_04_sum_wo_smallest;

/**
 * Write a method {@code sumWithoutSmallest} that computes the sum of an array
 * of values, except for the smallest one, in a single loop. In the loop, update
 * the sum and the smallest value. After the loop, return the difference.
 */
public class SumWithoutSmallest
{
    public static void main(String[] args)
    {
        int[] arr = randomArray();
        printArray(arr);

        int result = sumWithoutSmallest(arr);
        System.out.println(result);
    }

    /**
     * This method computes the sum of an array of values and returns the
     * difference of the sum and smallest array value.
     *
     * @param A array, type of int
     * @return sum and smallest value difference, type of int
     */
    public static int sumWithoutSmallest(int[] A)
    {
        int sum = 0;
        int smallest = A[0];

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] < smallest)
            {
                smallest = A[i];
            }
            sum += A[i];
        }
        return sum - smallest;
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
