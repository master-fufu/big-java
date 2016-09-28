package p_07_15_read_hyperlinks_from_web_page;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * Using the mechanism described in Special Topic 7.1, write a program that
 * reads all data from a web page and prints all hyperlinks of the form
 * <p><pre>
 * &lt;a href="<em>link</em>"&gt;<em>link text</em>&lt;/a&gt;</pre>
 * Extra credit if your program can follow the links that it finds and find
 * links in those web pages as well. (This is the method that search engines
 * such as Google use to find web sites.)
 */
public class HyperlinksReader
{
    public static void main(String[] args) throws IOException
    {
        String address = "http://horstmann.com/index.html";
        URL pageLocation = new URL(address);

        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(pageLocation.openStream())));

        File file = new File("src/late-objects/07-input-output-and-exception-" +
                "handling/p_07_15_read_hyperlinks_from_web_page/links.txt");
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));

        while (in.hasNext())
        {
            String line = in.next();

            if (line.contains("href=\"http://"))
            {
                int from = line.indexOf("\"");
                line += " ";

                while (!line.contains("/a>"))
                {
                    line += in.next() + " ";
                }
                int to = line.indexOf("/a>");

                out.println("<a href=" + line.substring(from, to + 3));
            }
        }
        in.close();
        out.close();
    }
}
