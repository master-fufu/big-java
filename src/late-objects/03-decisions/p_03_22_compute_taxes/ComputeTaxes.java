package p_03_22_compute_taxes;

import java.util.Scanner;

/**
 * Write a program that computes taxes.
 */
public class ComputeTaxes
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your marital status 's' or 'm': ");
        String maritalStatus = in.next().toLowerCase();
        System.out.print("Enter the amount of taxable income: ");
        double income = in.nextDouble();

        double computedTax = 0;

        if (maritalStatus.equals("s"))
        {
            if (income >= 0 && income < 8000)
            {
                computedTax = income * 0.1;
            }
            else if (income < 32000)
            {
                computedTax = income * 0.15 + 800;
            }
            else
            {
                computedTax = income * 0.25 + 4400;
            }
        }
        else if (maritalStatus.equals("m"))
        {
            if (income >= 0 && income < 16000)
            {
                computedTax = income * 0.1;
            }
            else if (income < 64000)
            {
                computedTax = income * 0.15 + 1600;
            }
            else
            {
                computedTax = income * 0.25 + 8800;
            }
        }
        System.out.printf("Status: %5s\nIncome: %12.2f\nTax to pay: %2.2f\n", maritalStatus, income, computedTax);
    }
}
