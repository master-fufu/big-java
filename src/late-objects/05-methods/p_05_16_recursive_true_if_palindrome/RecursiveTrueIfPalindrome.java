package p_05_16_recursive_true_if_palindrome;

import java.util.Scanner;

/**
 * Write a recursive method
 * <p><pre>
 *      public static boolean isPalindrome(String str)</pre>
 * that returns {@code true} if {@code str} is a palindrome, that is, a word
 * that is the same when reversed. Examples of palindrome are "deed", "rotor",
 * of "aibohphobia". Hint: A word is a palindrome if the first and last letters
 * match and the remainder is also a palindrome.
 */
public class RecursiveTrueIfPalindrome
{
    public static void main(String[] args)
    {
        System.out.printf("%s%s", "Is it a palindrome? ", isPalindrome(readString("Enter a string: ")));
    }

    /**
     * The recursive method returns true if string is a palindrome or false
     * otherwise.
     * <p>
     * First, it returns true if str length equals 0 or 1.
     * <p>
     * Second, if first condition is false it checks whether first and last
     * characters are equal, if they are not equal, then the {@code str} is not
     * a palindrome and method returns false. If first and last characters are
     * equal then method {@code isPalindrome} called recursively cutting off
     * the first and last characters and comparing them in each recursion
     * iteration. If all iterations return true, then the string is a palindrome.
     *
     * @param str the given string
     * @return true or false
     */
    public static boolean isPalindrome(String str)
    {
        boolean endOfStr = str.length() == 0 || str.length() == 1;

        return (endOfStr || (str.charAt(0) == str.charAt(str.length() - 1))
                && (isPalindrome(str.substring(1, str.length() - 1))));
    }

    /**
     * The method prompts user for an input and returns string in lowercase
     * characters to the calling method.
     *
     * @param prompt prompts user for input
     * @return user input
     */
    public static String readString(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s", prompt);
        return in.nextLine().toLowerCase();
    }
}
