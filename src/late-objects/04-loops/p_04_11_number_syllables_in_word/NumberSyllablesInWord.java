package p_04_11_number_syllables_in_word;

import java.util.Scanner;

/**
 * Write a program that reads a word and prints the number of syllables in
 * the word. For this exercise, assume that syllables are determined as follows:
 * Each sequence of adjacent vowels {@code a e i o u y}, except for the last
 * {@code e} in a word, is a syllable. However, if that algorithm yields a
 * count of 0, change it to 1. For example: Harry hairy hare the
 * <p><pre>
 *      Word     Syllables
 *      Harry    2
 *      hairy    2
 *      hare     1
 *      the      1</pre>
 */
public class NumberSyllablesInWord
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner("Harry");
        String input = in.next();

        int count = 0;
        boolean inVowelGroup = false;

        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y')
            {
                if (!inVowelGroup)
                {
                    inVowelGroup = true;
                    count++;
                }
            }
            else
            {
                inVowelGroup = false;
            }
        }

        if (input.endsWith("e"))
        {
            count--;
        }

        if (count == 0)
        {
            count = 1;
        }
        System.out.println(count);
    }
}
