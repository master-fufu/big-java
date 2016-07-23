package p_03_21_income_tax;

import java.util.Scanner;

/**
 * Write a program that computes the income tax according to the original US
 * income tax of 1913. There was no separate schedule for single or married
 * taxpayers.
 */
public class IncomeTax
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = in.nextDouble();

        final double ONE_PERCENT_TAX = 0.01;
        final double TWO_PERCENT_TAX = 0.02;
        final double THREE_PERCENT_TAX = 0.03;
        final double FOUR_PERCENT_TAX = 0.04;
        final double FIVE_PERCENT_TAX = 0.05;
        final double SIX_PERCENT_TAX = 0.06;

        double income_tax = 0;

        if (income <= 50000)
        {
            income_tax = income * ONE_PERCENT_TAX;
        }
        else if (income > 50000)
        {
            income_tax = income * TWO_PERCENT_TAX;
        }
        else if (income > 75000)
        {
            income_tax = income * THREE_PERCENT_TAX;
        }
        else if (income > 100000)
        {
            income_tax = income * FOUR_PERCENT_TAX;
        }
        else if (income > 250000)
        {
            income_tax = income * FIVE_PERCENT_TAX;
        }
        else if (income > 500000)
        {
            income_tax = income * SIX_PERCENT_TAX;
        }
        System.out.println("If your income is " + income + ", your income tax is " + income_tax);
    }
}
