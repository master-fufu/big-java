package p_13_06_find_matching_string;

/**
 * Use recursion to implement a method
 * <p><pre>
 *      public static boolean find(String text, String str)</pre>
 * that tests whether a given text contains a string. For example, {@code find
 * ("Mississippi", "sip")} returns true.
 * <p>
 * <e>Hint:</em> If the text starts with the string you want to match, then
 * you are done. If not, consider the text that you obtain by removing the
 * first character.
 */
public class FindMatchingString
{
    public static void main(String[] args)
    {
        String text = "Mississippi";
        String str = "issir";

        boolean result = find(text, str);
        System.out.println(result);
    }

    /**
     * Finds matching string using recursion.
     *
     * @param text some given text
     * @param str  string that the text may contain
     * @return true if text contains the string
     */
    public static boolean find(String text, String str)
    {
        // terminate recursion if text.length() < str.length()
        boolean a = text.length() >= str.length();
        return a && (str.equals(text.substring(0, str.length())) || find(text.substring(1), str));
    }
}
