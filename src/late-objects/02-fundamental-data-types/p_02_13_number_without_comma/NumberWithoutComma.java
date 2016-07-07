package p_02_13_number_without_comma;

import java.util.Scanner;

/**
 * Write a program that reads a number between 1,000 and 999,999 from the user,
 * where the user enters a comma in the input. Then print the number without a
 * comma. Here is a sample dialog; the user input is in color:
 * <p><pre>
 *      Please enter an integer between 1,000 and 999,999: 23,456
 *      23456</pre>
 * Hint: Read the input as a string. Measure the length of the string. Suppose
 * it contains <em>n</em> characters. Then extract substrings consisting of the
 * first <em>n – 4</em> characters and the last three characters.
 */
public class NumberWithoutComma
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        String input = in.next();

        String beforeComma = input.substring(0, input.length() - 4);
        String afterComma = input.substring(input.length() - 3);

        System.out.print(beforeComma + afterComma + "\n");
    }
}
