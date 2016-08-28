package p_05_06_count_vowels;

import java.util.Scanner;

/**
 * Write a method
 * <p><pre>
 *      public static int countVowels(String str)</pre>
 * that returns a count of all vowels in the string str. Vowels are the letters
 * {@code a e i o}, and {@code u}, and their uppercase variants.
 */
public class CountVowels
{
    public static void main(String[] args)
    {
        System.out.print(countVowels("Enter a string: "));
    }

    /**
     * The method prompts for an input and returns a count of all
     * vowels in the string.
     *
     * @param str any string
     * @return number of vowels, type of int
     */
    public static int countVowels(String str)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(str);
        str = in.next().toLowerCase();

        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char v = str.charAt(i);
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
