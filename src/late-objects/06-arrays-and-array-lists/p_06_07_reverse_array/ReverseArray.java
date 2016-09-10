package p_06_07_reverse_array;

import java.util.Scanner;

/**
 * Write a method that reverses the sequence of elements in an array.
 * For example, if you call the method with the array
 * <p><pre>
 * 1 4 9 16 7 4 9 11</pre>
 * then the array is changed to
 * <p><pre>
 * 11 9 4 7 9 16 9 4 1</pre>
 */
public class ReverseArray
{
    public static void main(String[] args)
    {
        int[] A = readInputs(5);

        int[] reversedArray = reverseArray(A);

        printArray(reversedArray);
    }

    /**
     * This method prints an array.
     *
     * @param arr array, type of int
     */
    public static void printArray(int[] arr)
    {
        for (int el : arr)
        {
            System.out.print(el + " ");
        }
    }

    /**
     * This method reverses an array and returns it to the calling method.
     *
     * @param arr array, type of int
     * @return reversed array
     */
    public static int[] reverseArray(int[] arr)
    {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    /**
     * Reads a sequence of integers from user.
     *
     * @param numberOfInputs the number of inputs to read
     * @return an array containing the input values
     */
    public static int[] readInputs(int numberOfInputs)
    {
        System.out.print("Enter " + numberOfInputs + " numbers: ");
        Scanner in = new Scanner(System.in);
        int[] inputs = new int[numberOfInputs];

        for (int i = 0; i < inputs.length; i++)
        {
            inputs[i] = in.nextInt();
        }
        return inputs;
    }
}
