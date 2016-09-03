package p_05_22_compute_balance;

import java.util.Scanner;

/**
 * Write a method that computes the balance of a bank account with a given
 * initial balance and interest rate, after a given number of years.
 * Assume interest is compounded yearly.
 */
public class ComputeBalance
{
    public static void main(String[] args)
    {
        double balance = readInitialData("Enter initial balance: ");
        double rate = readInitialData("Enter yearly interest rate (%): ");
        int years = (int) readInitialData("Enter number of years: ");

        double result = computeBalance(balance, rate, years);
        System.out.printf("%s %d %s is %.2f", "The balance after", years, (years > 1) ? "years" : "year", result);
    }

    /**
     * The method prompts user for initial data input and
     * returns it to the calling method.
     *
     * @param prompt prompts user for input, String
     * @return double
     */
    public static double readInitialData(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextDouble();
    }

    /**
     * The method computes the balance of a bank account with a given initial
     * balance and interest rate, after a given number of years.
     *
     * @param initialBalance initial balance, type of double
     * @param interestRate   yearly interest rate, type of double
     * @param years          number of years, type of int
     * @return balance of a bank account after n years, type of double
     */
    public static double computeBalance(double initialBalance, double interestRate, int years)
    {
        return initialBalance * (1 + (interestRate / 100)) * years;
    }
}
