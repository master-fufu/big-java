package bigJava_05_Methods;

import java.util.Scanner;

/**
 * A non-governmental organization needs a program to calculate the amount of
 * financial assistance for needy families. The formula is as follows:
 * <p><ul>
 * <li>If the annual household income is between $30,000 and $40,000 and the
 * household has at least three children, the amount is $1,000 per child.
 * <li>If the annual household income is between $20,000 and $30,000 and the
 * household has at least two children, the amount is $1,500 per child.
 * <li>If the annual income is less than $20,000, the amount is $2,000 per child.
 * </ul><p>
 * Implement a method for this computation. Write a program that asks for the
 * household income and number of children for each applicant, printing the
 * amount returned by your method. Use -1 as a sentinel value for the input.
 */
public class FinanceForFamilies
{
    public static void main(String[] args)
    {
        double income = input("Enter your annual income: ");
        int children = (int) input("Enter number of children: ");

        double amountPerChild = dataProcessing(income, children);
        System.out.printf("You are eligible for the amount of $%.2f per child", amountPerChild);
    }

    /**
     * The method process data received from user and prints the amount of
     * financial assistance according to the input received from user.
     *
     * @param income   annual income, type of double
     * @param children number of children, int
     * @return amount of financial assistance, double
     */
    public static double dataProcessing(double income, int children)
    {
        int amount = 0;

        if ((income >= 30000 && income < 40000) && (children >= 3))
        {
            amount = 1000;
        }
        else if ((income >= 20000 && income < 30000) && (children >= 2))
        {
            amount = 1500;
        }
        else if (income < 20000 && children > 0)
        {
            amount = 2000;
        }
        return amount;
    }

    /**
     * The method prompts user for input and returns
     * the input to the calling method.
     *
     * @param prompt String
     * @return double
     */
    public static double input(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        double input = 0;

        while (input != -1)
        {
            input = in.nextDouble();
            if (input != -1)
            {
                return input;
            }
        }
        return 0;
    }
}
