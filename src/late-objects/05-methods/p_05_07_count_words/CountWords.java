package p_05_07_count_words;

import java.util.Scanner;

/**
 * Write a method
 * <p><pre>
 *      public static int countWords(String str)</pre>
 * that returns a count of all words in the string {@code str}. Words are
 * separated by spaces. For example, {@code countWords("Mary had a little lamb")}
 * should return 5.
 */
public class CountWords
{
    public static void main(String[] args)
    {
        System.out.print(countWords("Enter a string: "));
    }

    /**
     * The method prompts user for string input and returns
     * number of words in the string.
     *
     * @param str any string
     * @return number of words type of int
     */
    public static int countWords(String str)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(str);
        str = in.nextLine().trim();

        int count = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                count++;
            }
        }

        return count + 1;
    }
}
