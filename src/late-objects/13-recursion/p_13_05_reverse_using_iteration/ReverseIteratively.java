package p_13_05_reverse_using_iteration;

/**
 * Implement the reverse method of Exercise P13.3 as an iteration.
 */
public class ReverseIteratively
{
    public static void main(String[] args)
    {
        String text = "Hello, world!";

        for (int i = text.length() - 1; i >= 0; i--)
        {
            System.out.print(text.charAt(i));
        }
    }
}
