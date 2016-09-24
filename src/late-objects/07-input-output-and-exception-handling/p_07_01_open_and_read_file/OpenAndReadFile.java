package p_07_01_open_and_read_file;

import java.io.*;

/**
 * Write a program that carries out the following tasks:
 * <p><pre>
 *      <b>Open a file with the name hello.txt.
 *      Store the message &quot;Hello, World!&quot; in the file.
 *      Close the file.
 *      Open the same file again.
 *      Read the message into a string variable and print it.</b></pre>
 */
public class OpenAndReadFile
{
    public static void main(String[] args) throws IOException
    {
        File hello = theFile();

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(hello)));
        out.println("\"Hello, World!\"");
        out.close();

        BufferedReader in = new BufferedReader(new FileReader(hello));
        String str = in.readLine();
        System.out.println(str);
    }

    /**
     * Gets the hello.txt file.
     *
     * @return the file object
     */
    public static File theFile()
    {
        return new File("src/late-objects/" +
                "07-input-output-and-exception-handling/p_07_01_open_and_read_file/hello.txt");
    }
}
