package p_07_10_baby_names;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Get the data for file in prior decades from the Social Security
 * Administration. Paste the table data in files named {@code
 * babynames80s.txt}, etc. Modify the {@code worked_example_1/BabyNames.java}
 * program so that it prompts the user for a file name. The numbers in the
 * files have comma separators, so modify the program to handle them.
 * Can you spot a trend in the frequencies?
 */
public class BabyNames
{
    public static final int LIMIT = 40;

    public static void main(String[] args) throws FileNotFoundException
    {
        String fileName = fileName("Enter the name of the file: ");
        File babyNames = namesFile(fileName);
        Scanner in = new Scanner(babyNames);

        int totalNames = countNames(babyNames);

        double boyTotal = 0;
        double girlTotal = 0;

        while (boyTotal < LIMIT || girlTotal < LIMIT)
        {
            int rank = in.nextInt();
            System.out.print(rank + " ");

            boyTotal = processName(in, boyTotal, totalNames);
            girlTotal = processName(in, girlTotal, totalNames);

            System.out.println();
        }
        in.close();
    }

    /**
     * Reads name information, prints the name if total >= 0,
     * and adjusts the total.
     *
     * @param in         the input stream
     * @param total      the total percentage that should still be processed
     * @param totalNames the total number of all file
     * @return the adjusted total
     */
    public static double processName(Scanner in, double total, int totalNames)
    {
        String names = in.next();

        double percent = in.nextDouble() / totalNames * 100;

        if (total < LIMIT)
        {
            System.out.print(names + " ");
        }

        total = total + percent;
        return total;
    }

    /**
     * Counts the total of all boys and girls file for the given decade.
     * The code will work if the list of the file formatted this way:
     * <p><pre>
     *     1 	Michael 	663,592 	Jessica 	469,439</pre>
     *
     * @param theNames the file object to read file from
     * @return total sum of the file
     */
    public static int countNames(File theNames) throws FileNotFoundException
    {
        Scanner namesCount = new Scanner(theNames);
        int sum = 0;

        while (namesCount.hasNext())
        {
            int count = namesCount.nextInt();
            String firstName = namesCount.next();
            int firstNumber = namesCount.nextInt();
            String secondName = namesCount.next();
            int secondNumber = namesCount.nextInt();

            sum += firstNumber + secondNumber;
        }
        namesCount.close();

        return sum;
    }

    /**
     * Prompts user for input and returns it to the calling method.
     *
     * @param prompt prompts user for input
     * @return the user input
     */
    public static String fileName(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        String theName = in.next();
        in.close();
        return theName;
    }

    /**
     * Creates the file object and returns it to the calling method.
     *
     * @param fileName the file name
     * @return the file to read file from
     */
    public static File namesFile(String fileName)
    {
        return new File("src/late-objects/07-input-output-and-exception-handling/"
                + "p_07_10_baby_names/" + fileName + ".txt");
    }
}
