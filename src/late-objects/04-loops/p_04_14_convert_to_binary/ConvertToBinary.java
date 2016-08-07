package p_04_14_convert_to_binary;

import java.util.Scanner;

/**
 * Write a program that reads an number and prints all of its binary digits:
 * Print the remainder 'number % 2', then replace the number with 'number / 2'.
 * Keep going until the number is 0. For example, if the user provides the
 * input 13, the output should be
 * <p><pre>
 *      1
 *      0
 *      1
 *      1</pre>
 */
public class ConvertToBinary
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int input;

        do
        {
            System.out.print("Enter number: ");
            int number = in.nextInt();
            input = number;

            while (number > 0)
            {
                System.out.printf("%s%n", number % 2);
                number /= 2;
            }
        } while (input != 0);
    }
}
