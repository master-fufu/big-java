package p_05_17_recursion_find_matching_str;

/**
 * Use recursion to implement a method
 * <p><pre>
 *      public static boolean find(String str, String match)</pre>
 * that tests whether match is contained in str:
 * <p><pre>
 *      boolean b = find("Mississippi", "sip"); // Sets b to true </pre>
 * Hint: If str starts with match, then you are done. If not, consider
 * the string that you obtain by removing the first character.
 */
public class RecursionFindMatchingStr
{
    public static void main(String[] args)
    {
        String str = "Mississippi";
        String match = "ppi";
        System.out.printf("%s%n", find(str, match));
    }

    /**
     * The method tests recursively whether match is contained in the string.
     * Condition (str.length() >= match.length()) terminates recursion if match
     * is not found. Condition (match.equals(str.substring(0, match.length())
     * checks whether str starts with match. If false, then method
     * find(String str, String match) called recursively removing the first
     * character in the str until match is found.
     *
     * @param str   initial String
     * @param match String match length <= str length
     * @return boolean true or false
     */
    public static boolean find(String str, String match)
    {
        boolean a = str.length() >= match.length();
        return a && (match.equals(str.substring(0, match.length())) || find(str.substring(1), match));
    }
}
