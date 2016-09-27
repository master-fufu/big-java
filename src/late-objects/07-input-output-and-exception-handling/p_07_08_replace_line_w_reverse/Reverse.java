package p_07_08_replace_line_w_reverse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Write a program that replaces each line of a file with its reverse.
 * For example, if you run {@code java Reverse HelloPrinter.java}
 * then the contents of HelloPrinter.java are changed to
 * <p><pre>
 *      retnirPolleH ssalc cilbup
 *      {
 *      )sgra ][gnirtS(niam diov citats cilbup
 *      {
 *      wodniw elosnoc eht ni gniteerg a yalpsiD //
 *      ;)"!dlroW ,olleH"(nltnirp.tuo.metsyS
 *      }
 *      }</pre>
 * Of course, if you run Reverse twice on the same file, you get back the
 * original file.
 */
public class Reverse
{
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
    {
        // Construct File object
        File fileToReverse = fileToReverse();

        // Construct Scanner object to read File
        Scanner in = new Scanner(fileToReverse);
        String result = "";

        while (in.hasNextLine())
        {
            String line = in.nextLine();
            result += reverse(line) + "\n";
        }
        in.close();

        // Construct PrintWriter object
        PrintWriter out = toWrite();
        out.print(result);
        out.close();
    }

    /**
     * Reverses a string using StringBuilder class.
     *
     * @param string any string
     * @return reversed string
     */
    public static String reverse(String string)
    {
        return new StringBuilder(string).reverse().toString();
    }

    /**
     * Constructs PrintWriter object to write reversed string to the file.
     * PrintWriter accepts a File object returned by fileToReverse() function
     * as a first argument.
     *
     * @return PrintWriter object with path to the file and default charset
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    public static PrintWriter toWrite() throws FileNotFoundException,
            UnsupportedEncodingException
    {
        return new PrintWriter(fileToReverse(), "UTF-8");
    }

    /**
     * Constructs File object.
     *
     * @return original file to be reversed
     */
    public static File fileToReverse()
    {
        return new File("src/late-objects/07-input-output-and-exception-handling/"
                + "p_07_08_replace_line_w_reverse/HelloWorld.txt");
    }
}
