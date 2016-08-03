package p_04_03c_replace_vowels_w_underscore;

import java.util.Scanner;

/**
 * Write program that read a line of input as a string and print: a) Only the
 * uppercase letters in the string. b) Every second letter of the string.
 * c) The string, with all vowels replaced by underscore. d) The number of
 * vowels * in the string. e) The positions of all vowels in the string.
 * <p>
 * String example: The British Broadcasting Corporation is the public-service
 * broadcaster of the United Kingdom.
 */
public class ReplaceVowelsWithUnderscore
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Your string here: ");
        String input = in.nextLine().toLowerCase();

        int position = 0;

        while (position < input.length())
        {
            char ch = input.charAt(position);
            position++;
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y')
            {
                ch = '_';
            }
            System.out.print(ch);
        }
    }
}
