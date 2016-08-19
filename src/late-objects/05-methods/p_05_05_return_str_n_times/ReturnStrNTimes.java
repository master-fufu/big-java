package p_05_05_return_str_n_times;

/**
 * Write a method
 * <p><pre>
 *      public static String repeat (String str, int n)</pre>
 * that returns the string {@code str} repeated {@code n} times. For example,
 * {@code repeat ("ho", 3)}  returns "hohoho".
 */
public class ReturnStrNTimes
{
    public static void main(String[] args)
    {
        String input = "ho";
        System.out.print(repeat(input, 3));
    }

    public static String repeat(String str, int n)
    {
        String result = "";
        for (int i = 0; i < n; i++)
        {
            result += str;
        }
        return result;
    }
}
