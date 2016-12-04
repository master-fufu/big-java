package p_09_17_Filter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Declare an interface Filter as follows:
 * <p><pre>
 *      public interface Filter
 *      {
 *          boolean accept(Object x);
 *      }</pre>
 * Write a method
 * <p><pre>
 *      public static ArrayList&lt;Object&gt;collectAll(ArrayList&lt;Object&gt; objects, Filter f)</pre>
 * that returns all objects in the objects array that are accepted by the
 * given filter. Provide a class {@code ShortWordFilter} whose filter method
 * accepts all strings of length < 5. Then write a program that reads all
 * words from {@code System.in}, puts them into an {@code ArrayList<Object>},
 * calls {@code collectAll}, and prints a list of the short words.
 */
public class FilterTest
{
    public static void main(String[] args)
    {
        ArrayList<Object> words = userInput();
        Filter wordsFilter = new ShortWordFilter();

        words = collectAll(words, wordsFilter);

        System.out.println(words);
    }

    /**
     * Filters the words with length strictly less than 5
     * and returns them in ArrayList.
     *
     * @param o the list of objects
     * @param f the filter
     * @return the list of short words
     */
    public static ArrayList<Object> collectAll(ArrayList<Object> o, Filter f)
    {
        ArrayList<Object> shortWords = new ArrayList<>(o.size());
        if (o.size() == 0)
        {
            return null;
        }
        for (Object obj : o)
        {
            if (f.accept(obj))
            {
                shortWords.add(obj);
            }
        }
        shortWords.trimToSize();
        return shortWords;
    }

    /**
     * Prompts user for input and gathers the input into ArrayList.
     *
     * @return the list of words
     */
    public static ArrayList<Object> userInput()
    {
        ArrayList<Object> words = new ArrayList<>();
        words.ensureCapacity(10);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 10 words: ");
        for (int i = 0; i < 10; i++)
        {
            words.add(in.next());
        }
        words.trimToSize();
        return words;
    }
}
