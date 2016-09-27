package p_07_09_reverse_lines_top_to_bottom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a program that reads each line in a file, reverses its lines, and
 * writes them to another file. For example, if the file {@code input.txt}
 * contains the lines:
 * <p><pre>
 *      Mary had a little lamb
 *      Its fleece was white as snow
 *      And everywhere that Mary went
 *      The lamb was sure to go.</pre>
 * and you run {@code reverse input.txt output.txt}
 * then {@code output.txt} contains
 * <p><pre>
 *      The lamb was sure to go.
 *      And everywhere that Mary went
 *      Its fleece was white as snow
 *      Mary had a little lamb</pre>
 */
public class Reverse
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String filenameRead;
        String filenameWrite;

        if (args.length == 2)
        {
            filenameRead = "src/late-objects/07-input-output-and-exception-handling/"
                    + "p_07_09_reverse_lines_top_to_bottom/" + args[0] + ".txt";
            filenameWrite = "src/late-objects/07-input-output-and-exception-handling/"
                    + "p_07_09_reverse_lines_top_to_bottom/" + args[1] + ".txt";
        }
        else
        {
            Scanner in = new Scanner(System.in);
            System.out.print("File to read: ");
            filenameRead = "src/late-objects/07-input-output-and-exception-handling/"
                    + "p_07_09_reverse_lines_top_to_bottom/" + in.next() + ".txt";

            System.out.print("File to output in: ");
            filenameWrite = "src/late-objects/07-input-output-and-exception-handling/"
                    + "p_07_09_reverse_lines_top_to_bottom/" + in.next() + ".txt";

            in.close();
        }

        String[] fileLines = fileLines(filenameRead);
        writeLinesReverse(fileLines, filenameWrite);
    }

    /**
     * Reads lines from the file to the array of strings.
     *
     * @param filename name of the file to read from
     * @return array of strings, each line of the file is an element of array
     * @throws FileNotFoundException
     */
    public static String[] fileLines(String filename) throws FileNotFoundException
    {
        // Hard coded length of the array
        String[] lines = new String[4];
        Scanner fileRead = new Scanner(new File(filename));

        int i = 0;
        while (fileRead.hasNextLine())
        {
            String line = fileRead.nextLine();
            lines[i] = line;
            i++;
        }
        fileRead.close();
        return lines;
    }

    /**
     * Writes lines to the file in reverse order.
     * Each line is an element of String array.
     *
     * @param lines    array, type of String
     * @param filename name of the file to write to
     * @throws FileNotFoundException
     */
    public static void writeLinesReverse(String[] lines, String filename) throws FileNotFoundException
    {
        PrintWriter fileWrite = new PrintWriter(new File(filename));

        for (int i = lines.length - 1; i > -1; i--)
        {
            fileWrite.println(lines[i]);
        }
        fileWrite.close();
    }
}
