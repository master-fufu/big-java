package p_04_08_character_on_separate_line;

import java.util.Scanner;

/**
 * Write a program that reads a word and prints each character of the word on
 * a separate line. For example, if the user provides the input "Harry",
 * the program prints
 * <p><pre>
 *      H
 *      a
 *      r
 *      r
 *      y</pre
 */
public class CharacterOnSeparateLine
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");

        String input = in.next();
        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            System.out.printf("%s%n", ch);
        }
    }
}
