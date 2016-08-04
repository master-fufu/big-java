package p_04_07_randomly_permuting_characters_in_string;

import java.util.Scanner;

/**
 * Translate the following pseudocode for randomly permuting the characters in
 * a string into a Java program:
 * <p><pre>
 *      Read a word
 *      Repeat word.length() times
 *          Pick a random position i in the word, but not the last position
 *          Pick a random position j > i in the word
 *          Swap the letters at positions j and i
 *      Print the word</pre>
 * To swap the letters, construct substrings as follows:
 * <p><pre>
 *      ----- + ------ + ----
 *      first i middle j last</pre>
 * Then replace the string with
 * <p><pre>
 *      first + word.charAt(j) + middle + word.charAt(i) + last</pre>
 */
public class RandomlyPermutingCharactersInString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();

        for (int repeat = 0; repeat < word.length(); repeat++)
        {
            int i = (int) (Math.random() * word.length() - 1);
            int j = (int) (Math.random() * word.length());

            if (j > i)
            {
                String random = word.substring(0, i) + word.charAt(j) +
                        word.substring(i + 1, j) + word.charAt(i) + word.substring(j + 1);

                System.out.printf("Random string: %s%n", random);
            }
        }
    }
}
