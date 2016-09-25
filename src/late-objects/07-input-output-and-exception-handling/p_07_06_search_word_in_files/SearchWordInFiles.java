package p_07_06_search_word_in_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a program {@code Find} that all files specified on the command line
 * and prints out all lines containing a specified word. For example,
 * if you call
 * <p><pre>
 *      java  ring report.txt address.txt homework.txt</pre>
 * then the program might print
 * <p><pre>
 *      report.txt: has broken up an international ring of DVD bootleggers that
 *      address.txt: Kris Kringle, North Pole
 *      address.txt: Homer Simpson, Springfield
 *      homework.txt: String filename;</pre>
 * The specified word is always the first command line argument.
 */
public class SearchWordInFiles
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String wordToFind;
        String filesToSearchIn = "";

        if (args.length > 0)
        {
            // Specified word is the first command line argument
            wordToFind = args[0];

            // Concatenate file file to the String
            for (int i = 1; i < args.length; i++)
            {
                filesToSearchIn += args[i] + " ";
            }
        }
        else
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a word you are looking for: ");
            wordToFind = in.next().toLowerCase();

            System.out.print("Enter file file to look in (0 to quit): ");
            boolean done = false;

            while (!done)
            {
                String input = in.next();
                if (input.equals("0"))
                {
                    done = true;
                }
                else
                {
                    filesToSearchIn += input + " ";
                }
            }
            in.close();
        }

        // Send string of file file entered by user to the Scanner
        Scanner fileNamesList = new Scanner(filesToSearchIn);

        // Read the file file and send each to the printIfMatchFound() method
        while (fileNamesList.hasNext())
        {
            printIfMatchFound(fileNamesList.next(), wordToFind);
        }
        fileNamesList.close();
    }

    /**
     * Prints entire line from the text file in which given word was found.
     *
     * @param fileName name of the file entered by user
     * @param word     a word that the user is searching in the file
     * @throws FileNotFoundException
     */
    public static void printIfMatchFound(String fileName, String word) throws FileNotFoundException
    {
        Scanner in = readFile(fileName);

        while (in.hasNext())
        {
            String line = in.nextLine();

            if (isInFile(line, word))
            {
                System.out.println(fileName + ": " + line);
            }
        }
        in.close();
    }

    /**
     * Recursively finds whether substring is contained in the string.
     * Condition {@code (str.length() >= match.length())} terminates
     * recursion if match is not found.
     * Condition {@code (match.equals(str.substring(0, match.length())}
     * checks whether str starts with match. If false, then method
     * {@code find(String str, String match)} called recursively removing
     * the first character in the str until match is found.
     *
     * @param str   initial String
     * @param match String match length <= str length
     * @return boolean true or false
     */
    public static boolean isInFile(String str, String match)
    {
        boolean a = str.length() >= match.length();
        return a && (match.equals(str.substring(0, match.length())) || isInFile(str.substring(1), match));
    }

    /**
     * Creates Scanner object to read data from specified file name.
     *
     * @param fileName file name entered by user
     * @return Scanner object
     * @throws FileNotFoundException
     */
    public static Scanner readFile(String fileName) throws FileNotFoundException
    {
        return new Scanner(fileToSearchIn(fileName));
    }

    /**
     * Creates File object with given file name in the hard-coded folder.
     *
     * @param fileName file name provided by user
     * @return File object
     */
    public static File fileToSearchIn(String fileName)
    {
        return new File("src/late-objects/07-input-output-and-exception-handling/"
                + "p_07_06_search_word_in_files/" + fileName + ".txt");
    }
}
