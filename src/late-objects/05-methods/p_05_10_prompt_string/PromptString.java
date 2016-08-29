package p_05_10_prompt_string;

import java.util.Scanner;

/**
 * Write a method
 * <p><pre>
 *      public static double readDouble(String prompt)</pre>
 * that displays the prompt string, followed by a space, reads a floating-point
 * number in, and returns it. Here is a typical usage:
 * <p><pre>
 *      salary = readDouble("Please enter your salary:");
 *      percentageRise = readDouble("What percentage raise would you like?");</pre>
 */
public class PromptString
{
    public static void main(String[] args)
    {
        double salary = readDouble("Please enter your salary: ");
        System.out.printf("%.2f%n", salary);
        double percentage = readDouble("What percentage raise would you like? ");
        System.out.printf("%.2f%n", percentage);
    }

    /**
     * The method prompts user for an input and returns it to the calling method
     *
     * @param prompt any String
     * @return double
     */
    public static double readDouble(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextDouble();
    }
}
