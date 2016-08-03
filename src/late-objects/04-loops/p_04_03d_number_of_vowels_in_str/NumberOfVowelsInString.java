package p_04_03d_number_of_vowels_in_str;

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
public class NumberOfVowelsInString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Your string: ");
        String input = in.nextLine().toLowerCase();

        int i = 0;
        int vowelsCount = 0;

        while (i < input.length())
        {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y')
            {
                vowelsCount++;
            }
            i++;
        }
        System.out.println(vowelsCount);
    }
}
