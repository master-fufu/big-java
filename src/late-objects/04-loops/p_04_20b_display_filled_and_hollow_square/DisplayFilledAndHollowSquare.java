package p_04_20b_display_filled_and_hollow_square;

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
        int input = readInteger("Type in an integer greater or equals to 2: ");

        while (input < 2)
        {
            input = readInteger("Type in an integer greater or equals to 2: ");
        }

        // First Line
        for (int i = 0; i < input; i += input)
        {
            // First Column
            for (int j = 0; j < input; j += input)
            {
                for (int k = 0; k < input; k++)
                {
                    System.out.print("*");
                }
                System.out.print(" ");
            }

            // Second Column
            for (int j = 0; j < input; j += input)
            {
                for (int k = 0; k < input; k++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Body
        for (int i = 1; i < input - 1; i++)
        {
            // First Column
            for (int j = 0; j < input; j += input)
            {
                for (int k = 0; k < input; k++)
                {
                    System.out.print("*");
                }
                System.out.print(" ");
            }

            // Second Column
            for (int j = 0; j < input; j += input)
            {
                // First *
                for (int k = 0; k < input; k += input)
                {
                    System.out.print("*");
                }

                // Empty space
                for (int l = 0; l < input - 2; l++)
                {
                    System.out.print(" ");
                }

                // Last *
                for (int k = input - 1; k < input; k++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Last Line
        for (int i = input - 1; i < input; i++)
        {
            // First Column
            for (int j = 0; j < input; j += input)
            {
                for (int k = 0; k < input; k++)
                {
                    System.out.print("*");
                }
                System.out.print(" ");
            }

            // Second Column
            for (int j = 0; j < input; j += input)
            {
                for (int k = 0; k < input; k++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static int readInteger(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextInt();
    }
}
