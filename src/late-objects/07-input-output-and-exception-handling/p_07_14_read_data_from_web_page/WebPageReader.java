package p_07_14_read_data_from_web_page;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * Using the mechanism described in Special Topic 7.1, write a program that
 * reads all data from a web page and writes them to a file. Prompt the user
 * for the web page URL and the file.
 */
public class WebPageReader
{
    public static void main(String[] args) throws IOException
    {
        String address = "http://bbc.co.uk";
        URL pageLocation = new URL(address);

        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(pageLocation.openStream())));

        File file = new File("src/late-objects/07-input-output-and-exception-" +
                "handling/p_07_14_read_data_from_web_page/page.txt");
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));

        while (in.hasNext())
        {
            String line = in.nextLine();
            out.println(line);
        }
        in.close();
        out.close();
    }
}
