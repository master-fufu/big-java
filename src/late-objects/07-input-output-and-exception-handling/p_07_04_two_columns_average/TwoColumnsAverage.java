package p_07_04_two_columns_average;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a program that reads a file containing two columns of floating-point
 * numbers. Prompt the user for the file name. Print the average of each column.
 */
public class TwoColumnsAverage
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Create file object with given hard-coded path
        File numbers = createFile();

        // Prompt user to enter name for resulting file
        String fileName = inputFileName("Enter the name for the file: ");

        // Create Scanner object to read the file with numbers
        Scanner readNumbers = new Scanner(numbers);

        double firstCol = readNumbers.nextDouble();
        double secondCol = readNumbers.nextDouble();
        int count = 1;

        while (readNumbers.hasNext())
        {
            firstCol = firstCol + readNumbers.nextDouble();
            secondCol = secondCol + readNumbers.nextDouble();
            count++;
        }
        readNumbers.close();

        firstCol = firstCol / count;
        secondCol = secondCol / count;

        PrintWriter out = new PrintWriter("src/late-objects/07-input-output-and-exception-handling/"
                + "p_07_04_two_columns_average/" + fileName + ".txt");

        out.printf("%-30s%5.2f%n", "First column average: ", firstCol);
        out.printf("%-30s%5.2f%n", "Second column average: ", secondCol);
        out.close();
    }

    /**
     * Creates File object.
     *
     * @return File object
     */
    public static File createFile()
    {
        return new File("src/late-objects/07-input-output-and-exception-handling/"
                + "p_07_04_two_columns_average/numbers.txt");
    }

    /**
     * Prompts user for input and returns String to the calling method.
     *
     * @param prompt String
     * @return user input
     */
    public static String inputFileName(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.next();
    }
}
