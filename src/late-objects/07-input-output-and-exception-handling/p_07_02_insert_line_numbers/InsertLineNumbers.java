package p_07_02_insert_line_numbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Write a program that reads a file containing text. Read each line and send it
 * to the output file, preceded by <em>line numbers</em>. If the input file is
 * <p><ul>
 * Mary had a little lamb
 * Whose fleece was white as snow.
 * And everywhere that Mary went,
 * The lamb was sure to go!
 * </ul><p>
 * then the program produces the output file
 * <p><ul>
 * 1 Mary had a little lamb
 * 2 Whose fleece was white as snow.
 * 3 And everywhere that Mary went,
 * 4 The lamb was sure to go!
 * </ul>
 */
public class InsertLineNumbers
{
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
    {
        File inputFile = new File("src/late-objects/07-input-output-and-exception-handling/"
                + "p_07_02_insert_line_numbers/littleLamb.txt");

        Scanner in = new Scanner(inputFile);

        PrintWriter out = new PrintWriter("src/late-objects/07-input-output-and-exception-handling/"
                + "p_07_02_insert_line_numbers/lineNumbers.txt", "UTF-8");

        int i = 1;
        while (in.hasNextLine())
        {
            out.println("/* " + i++ + " */ " + in.nextLine());
        }
        in.close();
        out.close();
    }
}
