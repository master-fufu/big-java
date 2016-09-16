package p_06_19_construct_magic_square;

import java.util.Scanner;

/**
 * Implement the following algorithm to construct magic n * n squares; it works
 * only if n is odd.
 * <p><pre>
 *      Set row = n - 1, column = n / 2
 *      For k = 1 ... n * n
 *          Place k at [row][column]
 *          Increment row and column
 *          If the row or column is n, replace it with 0
 *          If the element at [row][column] has already been filled
 *              Set row and column to their previous values
 *              Decrement row</pre>
 * Here is the 5x5 square that you get if you follow this method:
 * <p><pre>
 *      11 18 25  2  9
 *      10 12 19 21  3
 *       4  6 13 20 22
 *      23  5  7 14 16
 *      17 24  1  8 15</pre>
 * Write a program whose input is the number n and whose output is the magic
 * square of order n if n is odd.
 */
public class ConstructMagicSquare
{
    public static void main(String[] args)
    {
        int squareOrder = userInput("Enter odd number: ");
        int[][] initialSquare = new int[squareOrder][squareOrder];

        int[][] magicSquare = constructMagicSquare(initialSquare, squareOrder);

        printMagicSquare(magicSquare);
    }

    /**
     * This method constructs magic square.
     *
     * @param arr initial 2D-array, type of int
     * @param n   size of 2D-array, type of int
     * @return 2D-array (magic square), type of int
     */
    public static int[][] constructMagicSquare(int[][] arr, int n)
    {
        int r = n - 1; // row
        int c = n / 2; // column

        for (int k = 1; k <= (n * n); k++)
        {
            arr[r][c] = k;
            r = (r + 1) % n;
            c = (c + 1) % n;
            if (arr[r][c] != 0)
            {
                c = (c - 1 + n) % n;
                r = (r - 2 + n) % n;
            }
        }
        return arr;
    }

    /**
     * This method prompts user for odd number input and returns integer
     * only if it is odd.
     *
     * @param prompt String
     * @return odd integer
     */
    public static int userInput(String prompt)
    {
        Scanner in = new Scanner(System.in);
        int input;

        do
        {
            System.out.print(prompt);
            input = in.nextInt();
        }
        while (input % 2 == 0);

        return input;
    }

    /**
     * This method prints 2D-array using enhanced for loops.
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
    }
}
