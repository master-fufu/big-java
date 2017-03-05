package p_13_07_starting_position_index;

/**
 * Use recursion to implement a method
 * <p><pre>
 *      public static int indexOf(String text, String str)</pre>
 * that returns the starting position of the first substring of the text that
 * matches {@code str}. Return -1 if {@code str} is not a substring of the text.
 * <p>
 * For example, {@code s.indexOf("Mississippi", "sip")} returns 6.
 * <p>
 * <em>Hint:</em> This is a bit trickier than Exercise P13.6, because you must
 * keep track of how far the match is from the beginning of the text. Make that
 * value a parameter variable of a helper method.
 */
public class IndexOfStartingPosition
{
    public static void main(String[] args)
    {
        String text = "Mississippi";
        String str = "mis";

        int position = indexOf(text, str);

        System.out.println(position);
    }

    /**
     * Recursively finds the starting position for of the first
     * substring of the text.
     *
     * @param text the text to search the substring in
     * @param str  the substring to match
     * @return the index of the substring's starting position
     */
    public static int indexOf(String text, String str)
    {
        text = text.toLowerCase();
        str = str.toLowerCase();

        return indexOf(text, str, 0);
    }

    /**
     * Helper method to find the index of the substring's starting position.
     *
     * @param text     the text to search the substring in
     * @param str      the substring to match
     * @param position the initial position of the substring
     * @return the index of the starting position of the substring
     */
    public static int indexOf(String text, String str, int position)
    {
        if (text.length() >= str.length())
        {
            if (str.equals(text.substring(0, str.length())))
            {
                return position;
            }
            else
            {
                return indexOf(text.substring(1), str, position + 1);
            }
        }
        else
        {
            return -1;
        }
    }
}
