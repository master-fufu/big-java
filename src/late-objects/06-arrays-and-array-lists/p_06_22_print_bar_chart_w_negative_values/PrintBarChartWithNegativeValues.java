package p_06_22_print_bar_chart_w_negative_values;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Improve the program of Exercise P6.21 to work correctly when the data set
 * contains negative values.
 */
public class PrintBarChartWithNegativeValues
{
    public static void main(String[] args)
    {
        // Capture user input into array list
        ArrayList<Integer> barChartValues = userInput("Enter integers: ");

        // Find the smallest value
        int smallest = smallestValue(barChartValues);

        // convert array values according to smallest index
        barChartValues = smallestConvert(barChartValues, smallest);

        // Find the largest value
        int largest = largestValue(barChartValues);

        printChart(barChartValues, largest);
    }

    /**
     * This method prints final bar chart.
     *
     * @param A array of values entered by user, ArrayList
     * @param l largest value of the A array
     */
    public static void printChart(ArrayList<Integer> A, int l)
    {
        // Largest value converted to proportion of 40
        double index = 40.0 / l;

        ArrayList<Double> convertedValues = new ArrayList<>();

        // Convert user input according to largest value proportion
        for (double el : A)
        {
            convertedValues.add(el * index);
        }

        // Print bar chart
        for (double el : convertedValues)
        {
            if (el == 0)
            {
                System.out.print("*");
            }

            for (int j = 0; j < el; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * The method converts array values according to its smallest value. The
     * smallest value is added to all array elements, so that after addition
     * the smallest value is 0.
     *
     * @param A array of user entered values
     * @param s smallest value of an array
     * @return array with smallest value added to all elements of an array
     */
    public static ArrayList<Integer> smallestConvert(ArrayList<Integer> A, int s)
    {
        if (s < 1)
        {
            for (int i = 0; i < A.size(); i++)
            {
                A.set(i, A.get(i) + (s * (-1)));
            }
        }
        return A;
    }

    /**
     * Find the smallest value in an array.
     *
     * @param A array list
     * @return smallest value of an array
     */
    public static int smallestValue(ArrayList<Integer> A)
    {
        int smallest = A.get(0);

        for (int i = 1; i < A.size(); i++)
        {
            if (A.get(i) < smallest)
            {
                smallest = A.get(i);
            }
        }
        return smallest;
    }

    /**
     * This method finds largest value in user inputs.
     *
     * @param A array list
     * @return largest value in array list, type of int
     */
    public static int largestValue(ArrayList<Integer> A)
    {
        int largest = A.get(0);
        for (int i = 1; i < A.size(); i++)
        {
            if (A.get(i) > largest)
            {
                largest = A.get(i);
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
        ArrayList<Integer> inputs = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.print(str);

        while (in.hasNextInt())
        {
            inputs.add(in.nextInt());
        }
        return inputs;
    }
}
