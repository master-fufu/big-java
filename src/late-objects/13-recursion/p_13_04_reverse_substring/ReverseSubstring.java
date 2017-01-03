package p_13_04_reverse_substring;

/**
 * Redo Exercise P13.3 with a recursive helper method that reverses
 * a substring of the message text.
 */
public class ReverseSubstring
{
    public static void main(String[] args)
    {
        String message = "Hello, world!";
        System.out.println(reverse(message));
    }

    /**
     * Reverses a substring of the message text.
     *
     * @param message the message
     * @return the message with reversed substring
     */
    public static String reverse(String message)
    {
        return reverse(message, 0, 7);
    }

    /**
     * Helper method to reverse a part of the sentence.
     *
     * @param message the text to reverse a substring in
     * @param start   the first index to include in the reversal
     * @param end     the last index to include in the reversal
     * @return the text with reversed substring
     * @throws IllegalArgumentException
     */
    public static String reverse(String message, int start, int end) throws IllegalArgumentException
    {
        if (start > end)
        {
            throw new IllegalArgumentException("start must be < end");
        }

        if (start == end)
        {
            return message;
        }
        else
        {
            return reverse(message.substring(1), start + 1, end) + message.charAt(0);
        }
    }
}
