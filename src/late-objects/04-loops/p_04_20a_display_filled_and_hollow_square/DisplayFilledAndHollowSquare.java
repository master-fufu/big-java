package p_04_20a_display_filled_and_hollow_square;

import java.util.Scanner;

/**
 * Write a program that reads an integer and displays, using asterisks,
 * a filled and hollow square, placed next to each other. For example,
 * if the side length is 5, the program should display
 * <p><pre>
 *      ***** *****
 *      ***** *   *
 *      ***** *   *
 *      ***** *   *
 *      ***** *****</pre>
 */
public class DisplayFilledAndHollowSquare
{
    public static void main(String[] args)
    {
        int n = readInteger("Type in an integer greater than or equal to 2: ");

        while (n < 2)
        {
            n = readInteger("Type in an integer greater than or equal to 2: ");
        }

        String side = " ";
        for (int i = 1; i <= n; i++)
        {
            side = side + "*"; // side to consist of n asterisks in a row
        }

        String border = side + "" + side; // upper and lower borders of the figure formed by the two squares
        String interior = side + " *"; // to be a row of asterisks and spaces between the two borders

        for (int i = 1; i <= n - 2; i++)
        {
            interior = interior + " ";
        }
        interior = interior + "*";

        System.out.println(border); // upper border
        for (int i = 2; i < n; i++)
        {
            System.out.println(interior); // interior
        }
        System.out.println(border); // lower border

    }

    /**
     * The method readInteger prompts for an integer, which is input from
     * the key board and returned to the calling method.
     *
     * @param prompt any string
     * @return integer
     */
    public static int readInteger(String prompt)
    {
        System.out.print(prompt);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return n;
    }
}

