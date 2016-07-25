package p_03_23_tax_calculator;

import java.util.Scanner;

/**
 * The TaxCalculator.java program uses a simplified version of the 2008 US
 * income tax schedule. Look up the tax brackets and rates for the current year,
 * for both single and married filers, and implement a program that computes
 * the actual income tax.
 */
public class TaxCalculator
{
    public static void main(String[] args)
    {
        final double RATE1 = 0.10;
        final double RATE2 = 0.15;
        final double RATE3 = 0.25;
        final double RATE4 = 0.28;
        final double RATE5 = 0.33;
        final double RATE6 = 0.35;
        final double RATE7 = 0.396;

        final double RATE1_SINGLE_LIMIT = 9075;
        final double RATE2_SINGLE_LIMIT = 36900;
        final double RATE3_SINGLE_LIMIT = 89350;
        final double RATE4_SINGLE_LIMIT = 186350;
        final double RATE5_SINGLE_LIMIT = 405100;
        final double RATE6_SINGLE_LIMIT = 406750;
        final double RATE7_SINGLE_LIMIT = 406751;

        final double RATE1_MARRIED_LIMIT = 18150;
        final double RATE2_MARRIED_LIMIT = 73800;
        final double RATE3_MARRIED_LIMIT = 148850;
        final double RATE4_MARRIED_LIMIT = 226850;
        final double RATE5_MARRIED_LIMIT = 405100;
        final double RATE6_MARRIED_LIMIT = 457600;
        final double RATE7_MARRIED_LIMIT = 457601;

        double tax = 0;

        // Read income and marital status
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        double income = in.nextDouble();

        System.out.print("Please enter s for single, m for married: ");
        String maritalStatus = in.next();

        // Compute taxes due
        if (maritalStatus.equals("s"))
        {
            if (income > 0 && income <= RATE1_SINGLE_LIMIT)
            {
                tax = RATE1 * income;
            }
            else if (income <= RATE2_SINGLE_LIMIT)
            {
                tax = RATE2 * income;
            }
            else if (income <= RATE3_SINGLE_LIMIT)
            {
                tax = RATE3 * income;
            }
            else if (income <= RATE4_SINGLE_LIMIT)
            {
                tax = RATE4 * income;
            }
            else if (income <= RATE5_SINGLE_LIMIT)
            {
                tax = RATE5 * income;
            }
            else if (income <= RATE6_SINGLE_LIMIT)
            {
                tax = RATE6 * income;
            }
            else if (income >= RATE7_SINGLE_LIMIT)
            {
                tax = RATE7 * income;
            }
        }
        else
        {
            if (income > 0 && income <= RATE1_MARRIED_LIMIT)
            {
                tax = RATE1 * income;
            }
            else if (income <= RATE2_MARRIED_LIMIT)
            {
                tax = RATE2 * income;
            }
            else if (income <= RATE3_MARRIED_LIMIT)
            {
                tax = RATE3 * income;
            }
            else if (income <= RATE4_MARRIED_LIMIT)
            {
                tax = RATE4 * income;
            }
            else if (income <= RATE5_MARRIED_LIMIT)
            {
                tax = RATE5 * income;
            }
            else if (income <= RATE6_MARRIED_LIMIT)
            {
                tax = RATE6 * income;
            }
            else if (income >= RATE7_MARRIED_LIMIT)
            {
                tax = RATE7 * income;
            }
        }

        System.out.println("The tax is $" + tax);
    }
}
