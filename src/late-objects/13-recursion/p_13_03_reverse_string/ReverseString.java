package p_13_03_reverse_string;

/**
 * Write a recursive method {@code String reverse(String text)} that reverses
 * a string. For example, {@code reverse("Hello!")} returns the string
 * {"@code !olleH"}. Implement a recursive solution by removing the first
 * character, reversing the remaining text, and combining the two.
 */
public class ReverseString
{
    public static void main(String[] args)
    {
        System.out.println(reverse("Hello!"));
    }

    /**
     * Recursively reverses a string.
     *
     * @param text a text to be reversed
     * @return the result
     */
    public static String reverse(String text)
    {
        if (text.length() <= 1)
        {
            return text;
        }
        else
        {
            return reverse(text.substring(1)) + text.charAt(0);
        }
    }
}
