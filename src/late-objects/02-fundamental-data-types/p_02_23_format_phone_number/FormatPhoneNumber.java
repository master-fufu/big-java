package p_02_23_format_phone_number;

import java.util.Scanner;

/**
 * The following pseudocode describes how to turn a string containing a
 * ten-digit phone number (such as "{@code 4155551212}") into a more readable
 * string with parentheses and dashes, like this: "{@code (415) 555-1212}".
 * <p><pre>
 *      Take the substring consisting of the first three characters and
 *          surround it with "(" and ") ". This is the area code.
 *      Concatenate the area code, the substring consisting of the next three
 *          characters, a hyphen, and the substring consisting of the last four
 *          characters. This is the formatted number.</pre>
 * Translate this pseudocode into a Java program that reads a telephone number into a
 * string variable, computes the formatted number, and prints it.
 */
public class FormatPhoneNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a ten-digit phone number: ");
        String n = in.next();

        String areaCode = "(" + n.substring(0, 3) + ") ";
        String formattedNumber = areaCode + n.substring(3, 6) + "-" + n.substring(6);
        System.out.println("Formatted number: " + formattedNumber);
    }
}
