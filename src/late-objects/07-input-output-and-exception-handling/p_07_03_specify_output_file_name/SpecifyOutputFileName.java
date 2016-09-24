package p_07_03_specify_output_file_name;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Repeat Exercise P7.2, but allow the user to specify the file name on the
 * command line. If the user does not specify any file name, then prompt the
 * user for the name.
 */
public class SpecifyOutputFileName {

    public static void main(String[] args) throws IOException
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter file name: ");
        String fileName = console.nextLine();

        if (fileName.isEmpty())
        {
            Scanner prompt = new Scanner(Paths.get("src/late-objects/07-input-output-and-exception-handling/"
                    + "p_07_03_specify_output_file_name/promptNames.txt"));

            System.out.println("Please choose the name (Y/N)");

            boolean done = false;
            while (prompt.hasNextLine() && !done)
            {
                String namePrompt = prompt.nextLine();
                System.out.print(namePrompt + ": ");

                if (console.next().equalsIgnoreCase("y"))
                {
                    fileName = namePrompt;
                    done = true;
                }
            }
            prompt.close();
            console.close();

            if (!done)
            {
                fileName = "default";
            }
        }

        File inputFile = new File("src/late-objects/07-input-output-and-exception-handling/"
                + "p_07_03_specify_output_file_name/littleLamb.txt");

        Scanner in = new Scanner(inputFile);

        PrintWriter out = new PrintWriter("src/late-objects/07-input-output-and-exception-handling/"
                + "p_07_03_specify_output_file_name/" + fileName + ".txt", "UTF-8");

        int i = 1;
        while (in.hasNextLine())
        {
            out.println("/* " + i++ + " */ " + in.nextLine());
        }
        in.close();
        out.close();
    }
}
