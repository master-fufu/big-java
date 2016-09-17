package p_06_23_print_bar_chart_w_captions;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Improve the program of Exercise P6.21 by adding captions for each bar.
 * Prompt the user for the captions and data values.
 * The output should look like this:
 * <p><pre>
 *        Egypt **********************
 *       France ***************************************
 *        Japan ***************************
 *      Uruguay *************************
 *  Switzerland *************</pre>
 */
public class PrintBarChartWithCaptions
{
    public static void main(String[] args)
    {
        ArrayList<Integer> countryValues = userInputNumbers("Enter numeric values" +
                " for countries: ");

        ArrayList<String> countryNames = userInputCaptions("Enter countries " +
                "(Ctrl+D to finish input): ");

        if (arraysAreEqual(countryNames, countryValues))
        {
            int longestCountry = longestCountryName(countryNames);
            int largestNumber = largestValue(countryValues);

            // Call method to print bar chart
            printChart(countryValues, countryNames, largestNumber, longestCountry);
        }
        else
        {
            System.out.println("Sorry, number of values and file " +
                    "entered do not match. Please try again.");
        }
    }

    /**
     * This method prints final bar chart
     *
     * @param numbers   array of numbers entered by user, ArrayList
     * @param countries array of country file provided by user, ArrayList
     * @param largest   largest number of the numbers ArrayList
     * @param longest   longest country name from the countries ArrayList
     */
    public static void printChart(ArrayList<Integer> numbers,
            ArrayList<String> countries,
            int largest, int longest)
    {
        // Largest value converted to proportion of 40
        double index = 40.0 / largest;

        ArrayList<Double> convertedValues = new ArrayList<>();

        // Convert user input to largest value proportion
        for (double el : numbers)
        {
            convertedValues.add(el * index);
        }

        // Print bar chart
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.printf("%" + longest + "s ", countries.get(i));
            for (int j = 0; j < convertedValues.get(i); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /**
     * This method finds longest country name in the array of country file
     * provided by user
     *
     * @param countryName array list
     * @return length of the country name, type of int
     */
    public static int longestCountryName(ArrayList<String> countryName)
    {
        int longest = countryName.get(0).length();

        for (String str : countryName)
        {
            if (str.length() > longest)
            {
                longest = str.length();
            }
        }
        return longest;
    }

    /**
     * This method checks if captions array and numbers array are of equal size
     *
     * @param c ArrayList of captions provided by user
     * @param n ArrayList of numbers provided by user
     * @return TRUE if arrays are of equal size
     */
    public static boolean arraysAreEqual(ArrayList<String> c, ArrayList<Integer> n)
    {
        return c.size() == n.size();
    }

    /**
     * This method finds and returns largest value in the array list
     *
     * @param userInputs array list
     * @return largest value in array list, type of int
     */
    public static int largestValue(ArrayList<Integer> userInputs)
    {
        int largest = userInputs.get(0);
        for (int i = 1; i < userInputs.size(); i++)
        {
            if (userInputs.get(i) > largest)
            {
                largest = userInputs.get(i);
            }
        }
        return largest;
    }

    /**
     * The method prompts user for an input and returns array of captions
     * to the calling method
     *
     * @param str string
     * @return ArrayList
     */
    public static ArrayList<String> userInputCaptions(String str)
    {
        Scanner scanCountries = new Scanner(System.in);
        System.out.print(str);
        ArrayList<String> captions = new ArrayList<>();

        while (scanCountries.hasNext())
        {
            captions.add(scanCountries.next());
        }
        return captions;
    }

    /**
     * The method prompts user for an input and returns array list
     * to the calling method
     *
     * @param str string
     * @return ArrayList
     */
    public static ArrayList<Integer> userInputNumbers(String str)
    {
        Scanner scanNumbers = new Scanner(System.in);
        System.out.print(str);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (scanNumbers.hasNextInt())
        {
            numbers.add(scanNumbers.nextInt());
        }
        return numbers;
    }
}
