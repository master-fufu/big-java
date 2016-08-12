package p_04_21b_display_filled_diamond;

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
        Scanner input = new Scanner(System.in);
        System.out.print("Side length: ");
        int sideLength = input.nextInt();
        input.close();

        int maxWidth = sideLength * 2 - 1;
        int halfWidth = maxWidth / 2;
        int dotNum = 1;

        // top half
        for (int i = 0; i < sideLength; i++)
        {
            for (int j = 0; j < halfWidth; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < dotNum; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            dotNum += 2;
            halfWidth -= 1;
        }

        // bottom half
        dotNum = maxWidth - 2;
        halfWidth = 1;
        for (int i = 0; i < sideLength; i++)
        {
            for (int j = 0; j < halfWidth; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < dotNum; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            dotNum -= 2;
            halfWidth += 1;
        }
    }
}
