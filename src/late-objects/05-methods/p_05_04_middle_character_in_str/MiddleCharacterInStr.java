package p_05_04_middle_character_in_str;

/**
 * Write a method
 * <p><pre>
 *      public static String middle(String str)</pre>
 * that returns a string containing the middle character in str if the length
 * of str is odd, or the two middle characters if the length is even.
 * For example, middle("middle") returns "dd".
 */
public class MiddleCharacterInStr
{
    public static void main(String[] args)
    {
        System.out.print(middle("middle"));
    }

    /**
     * The method returns middle character(-s) of the string.
     *
     * @param str any string
     * @return two characters if str length is even, one character if str length is odd.
     */
    public static String middle(String str)
    {
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
}
