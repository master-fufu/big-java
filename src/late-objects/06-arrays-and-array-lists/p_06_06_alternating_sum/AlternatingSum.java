package p_06_06_alternating_sum;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Compute the alternating sum of all elements in an array.
 * For example, if your program reads the input
 * <p><pre>
 *      1 4 9 16 9 7 4 9 11</pre>
 * then it computes
 * <p><pre>
 *      1 – 4 + 9 – 16 + 9 – 7 + 4 – 9 + 11 = –2</pre>
 */
public class AlternatingSum
{
    public static void main(String[] args)
    {
        final int LENGTH = 7;

        int[] values = readInputs(LENGTH);
        int alternatedSum = alternateSum(values);

        System.out.print(alternatedSum);
    }

    /**
     * Alternates sum of array elements.
     *
     * @param arr array, type of int
     * @return alternated sum of array elements
     */
    public static int alternateSum(int[] arr)
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (i % 2 == 1)
            {
                sum -= arr[i];
            }
            else
            {
                sum += arr[i];
            }
        }
        return sum;
    }

    /**
     * Reads a sequence of integers from user. Extends array twice its size
     * when array is filled. When all inputs are done, discards excess
     * (unfilled) elements.
     *
     * @param numberOfInputs the number of inputs to read
     * @return an array containing the input values
     */
    public static int[] readInputs(int numberOfInputs)
    {
        System.out.print("Please enter values, Q to quit: ");
        Scanner in = new Scanner(System.in);

        int[] inputs = new int[numberOfInputs];
        int currentSize = 0;

        while (in.hasNextDouble())
        {
            if (currentSize >= inputs.length)
            {
                inputs = Arrays.copyOf(inputs, 2 * inputs.length);
            }

            inputs[currentSize] = in.nextInt();
            currentSize++;
        }

        inputs = Arrays.copyOf(inputs, currentSize);

        return inputs;
    }
}
