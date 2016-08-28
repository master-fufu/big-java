package p_05_08_scrambled_words;

import java.util.Scanner;

/**
 * It is a well-known phenomenon that most people are easily able to read a text
 * whose words have two characters flipped, provided the first and last letter
 * of each word are not changed. For example,
 * <p><pre>
 *      I dn'ot gvie a dman for a man taht can olny sepll a wrod one way. (Mrak Taiwn)</pre>
 * Write a method {@code String scramble(String word)} that constructs a scrambled
 * version of a given word, randomly flipping two characters other than the
 * first and last one. Then write a program that reads words and prints the
 * scrambled words.
 */
public class ScrambledWords
{
    public static void main(String[] args)
    {
        System.out.print(scramble("Enter a word: "));
    }

    /**
     * The method prompts user for input of type String and returns
     * a scrambled version of input.
     *
     * @param word any string
     * @return scrambled word, type of String
     */
    public static String scramble(String word)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(word);
        word = in.next();

        if (word.length() > 3)
        {
            int i = (int) (Math.random() * (word.length() - 3)) + 1;
            int j = (int) (Math.random() * (word.length() - i - 2)) + i + 1;
            return word.substring(0, i) + word.charAt(j) + word.substring(i + 1, j) + word.charAt(i) + word.substring(j + 1);
        }
        else
        {
            return word;
        }
    }
}
