package p_07_16_services_sold_to_client;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A hotel salesperson enters sales in a text file. Each line contains the
 * following, separated by semicolons: The name of the client, the service sold
 * (such as Dinner, Conference, Lodging, and so on), the amount of the sale,
 * and the date of that event. Write a program that reads such a file and
 * displays the total amount for each service category. Display an error if
 * the file does not exist or the format is incorrect.
 */
public class ServicesSold
{
    public static void main(String[] args) throws FileNotFoundException
    {
        try
        {
            File report = readFile("src/late-objects/07-input-output-and-" +
                    "exception-handling/p_07_16_services_sold_to_client/services.txt");
            Scanner in = new Scanner(report);

            double dinner = 0;
            double conference = 0;
            double lodging = 0;
            double breakfast = 0;
            double event = 0;

            while (in.hasNext())
            {
                String firstName = in.next();
                String secondName = in.next();
                String service = in.next();
                double amount = Double.parseDouble(in.next().substring(1));
                String date = in.next();

                switch (service)
                {
                    case "Dinner":
                        dinner += amount;
                        break;
                    case "Conference":
                        conference += amount;
                        break;
                    case "Lodging":
                        lodging += amount;
                        break;
                    case "Breakfast":
                        breakfast += amount;
                        break;
                    default:
                        event += amount;
                        break;
                }
            }

            System.out.println("Dinner: " + dinner);
            System.out.println("Conference: " + conference);
            System.out.println("Lodging: " + lodging);
            System.out.println("Breakfast: " + breakfast);
            System.out.println("Event: " + event);
        }
        catch (FileNotFoundException e)
        {
            throw new FileNotFoundException("File not found.\n" + e);
        }
    }

    /**
     * @return file object to read data from
     */
    public static File readFile(String path)
    {
        return new File(path);
    }
}
