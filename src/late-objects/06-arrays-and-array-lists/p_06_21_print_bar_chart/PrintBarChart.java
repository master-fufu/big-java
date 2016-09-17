package bigJava_06_ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that reads a sequence of input values and displays a bar
 * printChart of the values, using asterisks, like this:
 * <p>
 * **********************
 * ***************************************
 * ***************************
 * *************************
 * *************
 * <p>
 * You may assume that all values are positive. First figure out the maximum
 * value. That value's bar should be drawn drawn with 40 asterisks. Shorter bars
 * should use proportionally fewer asterisks.
 */
public class PrintBarChart
{
    public static void main(String[] args)
    {
        // Capture user input into array list
        ArrayList<Integer> barChartValues = userInput("Enter integers: ");

        // Find the largest value of user input
        int largest = largestValue(barChartValues);

        // Print bar chart
        printChart(barChartValues, largest);
    }

    /**
     * This method prints final bar chart.
     *
     * @param userValues array of values entered by user, ArrayList
     * @param largest    largest value of the userValues array
     */
    public static void printChart(ArrayList<Integer> userValues, int largest)
    {
        // Largest value converted to proportion of 40
        double index = 40.0 / largest;

        ArrayList<Double> convertedValues = new ArrayList<>();

        // Convert user input according to largest value proportion
        for (double el : userValues)
        {
            convertedValues.add(el * index);
        }

        // Print bar chart
        for (double el : convertedValues)
        {
            for (int j = 0; j < el; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * This method finds largest value in user inputs.
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
     * The method prompts user for an input and returns
     * it to the calling method.
     *
     * @param str string
     * @return Array List
     */
    public static ArrayList<Integer> userInput(String str)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(str);
        ArrayList<Integer> inputs = new ArrayList<>();

        while (in.hasNextInt())
        {
            inputs.add(in.nextInt());
        }
        return inputs;
    }
}
