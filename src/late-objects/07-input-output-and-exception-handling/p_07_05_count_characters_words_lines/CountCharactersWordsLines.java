package p_07_05_count_characters_words_lines;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a program that asks the user for a file name and prints the number
 * of characters, words, and lines in that file.
 */
public class CountCharactersWordsLines
{
    public static void main(String[] args)
    {
        String fileName = fileNameByUser("Enter file name: ");
        File file = fileToRead(fileName);

        try
        {
            int numberOfLines = countLines(file);
            int numberOfWords = countWords(file);
            int numberOfChars = countCharacters(file, numberOfLines);

            System.out.println("Lines: " + numberOfLines);
            System.out.println("Words: " + numberOfWords);
            System.out.println("Characters: " + numberOfChars);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Counts lines in the text file.
     *
     * @param fileToRead file to count lines
     * @return number of lines in the file
     * @throws FileNotFoundException
     */
    public static int countLines(File fileToRead) throws FileNotFoundException
    {
        int countLines = 0;
        Scanner in = new Scanner(fileToRead);

        while (in.hasNext())
        {
            in.nextLine();
            countLines++;
        }
        return countLines;
    }

    /**
     * Counts words in the text file. Words are delimited by space character.
     *
     * @param fileToRead file to count words
     * @return number of words in the file
     * @throws FileNotFoundException
     */
    public static int countWords(File fileToRead) throws FileNotFoundException
    {
        int countWords = 0;
        Scanner in = new Scanner(fileToRead);

        while (in.hasNext())
        {
            in.next();
            countWords++;
        }
        return countWords;
    }

    /**
     * Counts characters in the text file. The method counts all characters
     * in the file, including new line characters, so it returns number of
     * characters minus number of lines.
     *
     * @param fileToRead file to count characters
     * @return number of characters in the file, type of int
     * @throws FileNotFoundException
     */
    public static int countCharacters(File fileToRead, int lines) throws FileNotFoundException
    {
        int countCharacters = 0;
        Scanner in = new Scanner(fileToRead);
        in.useDelimiter("");

        while (in.hasNext())
        {
            in.next();
            countCharacters++;
        }
        return countCharacters - lines;
    }

    /**
     * Returns file object based on file name provided by user.
     *
     * @param userInput file name entered by user.
     * @return File object
     */
    public static File fileToRead(String userInput)
    {
        return new File("src/late-objects/07-input-output-and-exception-handling/"
                + "p_07_05_count_characters_words_lines/" + userInput + ".txt");
    }

    /**
     * Prompts user to enter file name to read data from.
     *
     * @param prompt String
     * @return file name, type of String
     */
    public static String fileNameByUser(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.next();
    }
}
