package p_06_18_check_if_square_is_magic;

import java.util.Scanner;

/**
 * Magic squares. An n * n matrix that is filled with the numbers 1, 2, 3, ...,
 * n^2 is a magic square if the sum of the elements in each row, in each column,
 * and in the two diagonals is the same value.
 * <p><pre>
 *      16   3   2  13
 *       5  10  11   8
 *       9   6   7  12
 *       4  15  14   1</pre>
 * Write a program that reads in 16 values from the keyboard and tests whether
 * they form a magic square when put into a 4x4 array. You need to test two
 * features:
 * <p><ol>
 * <li>Does each of the numbers 1, 2, ..., 16 occur in the user input?
 * <li>When the numbers are put into a square, are the sums of the rows, columns,
 * and diagonals equal to each other?</ol>
 * <p>
 * Example: 16 3 2 13 5 10 11 8 9 6 7 12 4 15 14 1
 */
public class CheckIfSquareIsMagic
{
    public static void main(String[] args)
    {
        int magicSquareSize = squareSize("Enter size of the magic square: ");
        int[][] array = readInput("Enter " + (magicSquareSize * magicSquareSize)
                + " integers: ", magicSquareSize);

        printMagicSquare(array);

        if ((checkArray(array, magicSquareSize)) && RowsColumnsDiagonalSum(array))
        {
            System.out.println("This square is magic!");
        }
        else
        {
            System.out.println("square is not magic");
        }
    }

    /**
     * This method checks if sums of all rows, columns, and major and minor
     * diagonals are equal.
     *
     * @param arr 2D-array, type of int
     * @return TRUE if sums of all rows, columns and two diagonals are equal
     */
    public static boolean RowsColumnsDiagonalSum(int[][] arr)
    {
        int rowSum = 0;
        int colSum = 0;
        int majorDiagonalSum = 0;
        int minorDiagonalSum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            rowSum += arr[0][i];
            colSum += arr[i][0];
            majorDiagonalSum += arr[i][i];
            minorDiagonalSum += arr[arr.length - i - 1][i];
        }

        if (rowSum == colSum && rowSum == majorDiagonalSum && rowSum == minorDiagonalSum)
        {
            for (int j = 1; j < arr.length; j++)
            {
                int nextRowSum = 0;
                int nextColSum = 0;

                for (int i = 0; i < arr.length; i++)
                {
                    nextColSum += arr[i][j];
                    nextRowSum += arr[j][i];
                }

                if (nextColSum == colSum || nextRowSum == rowSum)
                {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * This method checks whether all 2D-array values are unique and the values
     * do not exceed given range. Method takes 2D-array and its size as
     * arguments and then flattens 2D-array into 1D. And then it checks for unique
     * values in the 1D-array with minimum value = 1 and maximum value = size * size.
     *
     * @param A    2D-array, type of int
     * @param size size of 2D-array
     * @return TRUE if all array values are unique and they do not exceed given range
     */
    public static boolean checkArray(int[][] A, int size)
    {
        // Initialize 1D-array
        int sizeSquare = size * size;
        int[] C = new int[sizeSquare];

        // Flatten 2D-array into 1D
        int cIndex = 0;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                C[cIndex++] = A[i][j];
            }
        }

        // Compare values of the array
        for (int i = 0; i < sizeSquare; i++)
        {
            for (int j = i + 1; j < sizeSquare; j++)
            {
                if (C[j] == C[i])
                {
                    return false;
                }
            }

            // Check if array values fall into given range
            if (C[i] < 1 || C[i] > sizeSquare)
            {
                return false;
            }
        }
        return true;
    }

    /**
     * This method prompts user for input and returns 2D-array of integers.
     *
     * @param prompt String
     * @return 2D-array
     */
    public static int[][] readInput(String prompt, int size)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);

        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }

    /**
     * This method prompts user for the size of magic square.
     *
     * @param prompt String
     * @return size of the magic square, type of int
     */
    public static int squareSize(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextInt();
    }

    /**
     * This method prints 2D-array.
     *
     * @param arr 2D-array, type of int
     */
    public static void printMagicSquare(int[][] arr)
    {
        for (int[] arr1 : arr)
        {
            for (int el : arr1)
            {
                System.out.printf("%3d", el);
            }
            System.out.println();
        }
        System.out.println();
    }
}
