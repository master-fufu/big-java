package p_07_07_spelling_check;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a program that checks the spelling of all words in a file. It should
 * read each word of a file and check whether it is contained in a word list.
 * A word list is available on most Linux systems in the file {@code
 * /usr/share/dict/words}. (If you don't have access to a Linux system, your
 * instructor should be able to get you a copy.) The program should print out
 * all words that it cannot find in the word list.
 */
public class SpellingCheck
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File myWordList = file("src/late-objects/07-input-output-and-" +
                "exception-handling/p_07_07_spelling_check/myWordList.txt");
        Scanner myFile = new Scanner(myWordList);

        File dictionary = file("/usr/share/dict/words");
        Scanner dict = new Scanner(dictionary);

        while (myFile.hasNext())
        {
            boolean found = false;
            String myWord = myFile.next();

            while (dict.hasNext() && !found)
            {
                String dictWord = dict.next();

                if (myWord.equals(dictWord))
                {
                    System.out.println("\"" + myWord + "\"" + " is correct.");
                    found = true;
                }
            }

            if (!found)
            {
                System.out.println("\"" + myWord + "\"" + " is not in the dictionary.");
            }
        }

    }

    /**
     * Creates a file object with user's word list.
     *
     * @param path the path to the file
     * @return the file with user's words
     */
    public static File file(String path)
    {
        return new File(path);
    }
}
