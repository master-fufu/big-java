package p_07_11_baby_names;

import java.io.*;
import java.util.Scanner;

/**
 * Write a program that reads in {@code worked_example_1/babyNames.txt}
 * and produces two files, {@code boynames.txt} and {@code girlnames.txt},
 * separating the data for the boys and girls.
 */
public class BabyNames
{
    public static void main(String[] args) throws IOException
    {
        File babyNames = file();
        Scanner in = new Scanner(new BufferedReader(new FileReader(babyNames)));

        File boynames = new File("src/late-objects/07-input-output-and-exception-"
                + "handling/p_07_11_baby_names/boynames.txt");
        File girlnames = new File("src/late-objects/07-input-output-and-exception-"
                + "handling/p_07_11_baby_names/girlnames.txt");

        PrintWriter boysOut = new PrintWriter(new BufferedWriter(new FileWriter(boynames)));
        PrintWriter girlsOut = new PrintWriter(new BufferedWriter(new FileWriter(girlnames)));

        while (in.hasNext())
        {
            int nameRank = in.nextInt();
            processNames(nameRank, in, boysOut);
            processNames(nameRank, in, girlsOut);
        }
        in.close();
        boysOut.close();
        girlsOut.close();
    }

    /**
     * Writes the name to the file boynames.txt or girlnames.txt.
     *
     * @param rank the popularity number
     * @param in   the input stream
     * @param out  the output stream
     */
    public static void processNames(int rank, Scanner in, PrintWriter out)
    {
        String name = in.next();
        int nameCount = in.nextInt();
        double namePercent = in.nextDouble();
        out.println(rank + " " + name);
    }

    /**
     * Creates the file object and returns it to the calling method.
     *
     * @return the file to read file from
     */
    public static File file()
    {
        return new File("src/late-objects/07-input-output-and-exception-" +
                "handling/p_07_11_baby_names/babynames.txt");
    }
}
