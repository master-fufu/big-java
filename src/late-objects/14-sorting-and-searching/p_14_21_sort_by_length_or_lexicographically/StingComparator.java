package p_14_21_sort_by_length_or_lexicographically;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Sort an array list of strings by increasing length, and so that strings
 * of the same length are sorted lexicographically.
 * <em>Hint:</em> Supply a {@code Comparator}.
 */
public class StingComparator
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<>();
        String text = "In computer science a string is any finite sequence of" +
                " characters. An important characteristic of each string is its" +
                " length, which is the number of characters in it. The length" +
                " can be any natural number.";

        Scanner in = new Scanner(text);

        while (in.hasNext())
        {
            String word = in.next();
            int endOfWord = word.length() - 1;

            // remove punctuation marks
            if (word.charAt(endOfWord) < 65 || word.charAt(endOfWord) > 122)
            {
                word = word.substring(0, word.length() - 1);
            }

            words.add(word);
        }
        words.trimToSize();

        // sort the array

        Collections.sort(words, new Comparator<String>()
        {
            @Override
            public int compare(String str1, String str2)
            {
                if (str1.length() - str2.length() == 0)
                {
                    return str1.compareTo(str2);
                }
                return str1.length() - str2.length();
            }
        });

        System.out.println(words);
    }
}
