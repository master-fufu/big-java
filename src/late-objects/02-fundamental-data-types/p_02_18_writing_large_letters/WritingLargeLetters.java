package p_02_18_writing_large_letters;

/**
 * Writing large letters. A large letter H can be produced like this:
 * <p><pre>
 * *   *
 * *   *
 * *****
 * *   *
 * *   *</pre>
 * It can be declared as a string literal like this:
 * <p><pre>
 * final string LETTER_H = "* *\n* *\n*****\n* *\n* *\n";</pre>
 * (The {@code \n} escape sequence denotes a “newline” character that causes
 * subsequent characters to be printed on a new line.) Do the same for the
 * letters E, L, and O. Then write the message
 * <p><pre>
 *      H
 *      E
 *      L
 *      L
 *      O</pre>
 * in large letters.
 */
public class WritingLargeLetters
{
    public static void main(String[] args)
    {
        final String LETTER_H = "*   *\n*   *\n*****\n*   *\n*   *\n";
        final String LETTER_E = "*****\n*    \n***  \n*    \n*****\n";
        final String LETTER_L = "*    \n*    \n*    \n*    \n*****\n";
        final String LETTER_O = "*****\n*   *\n*   *\n*   *\n*****\n";

        System.out.println(LETTER_H);
        System.out.println(LETTER_E);
        System.out.println(LETTER_L);
        System.out.println(LETTER_L);
        System.out.println(LETTER_O);
    }
}
