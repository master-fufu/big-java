package p_04_21a_display_filled_diamond;

import java.util.Scanner;

/**
 * Write a program that reads an integer and displays, using asterisks,
 * a filled diamond of the given side length. For example, if the side
 * length is 4, the program should display
 * <p><pre>
 *         *
 *        ***
 *       *****
 *      *******
 *       *****
 *        ***
 *         *</pre>
 */
public class Diamond
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int side;
        int input;

        do
        {
            System.out.print("Enter number: ");
            side = in.nextInt();
            input = side;

            // print top side of the diamond
            for (int i = 0; i < side; i++)
            {
                // print spaces from top left side
                for (int k = side; k > i; k--)
                {
                    System.out.print(" ");
                }

                // print asterisks from left side
                for (int l = 0; l < i; l++)
                {
                    System.out.print("*");
                }

                // add asterisks to the top right
                for (int m = 1; m < i; m++)
                {
                    System.out.print("*");
                }

                System.out.println();
            }

            // print middle line
            for (int n = 0; n <= side * 2 - 2; n++)
            {
                System.out.print("*");
            }
            System.out.println();

            // print bottom side of the diamond
            for (int o = side; o > 0; o--)
            {
                // print bottom left spaces
                for (int p = side + 1; p > o; p--)
                {
                    System.out.print(" ");
                }

                // print bottom left asterisks
                for (int q = 1; q < o; q++)
                {
                    System.out.print("*");
                }

                // print bottom right asterisks
                for (int r = 2; r < o; r++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        } while (!(input <= 0));
    }
}
