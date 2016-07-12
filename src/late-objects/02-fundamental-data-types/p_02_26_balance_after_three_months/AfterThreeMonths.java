package p_02_26_balance_after_three_months;

import java.util.Scanner;

/**
 * An online bank wants you to create a program that show prospective customers
 * how their deposits will grow. Your program should read the initial balance
 * and the annual interest rate. Interest is compounded monthly. Print out
 * the balances after the first three months. Here is a sample run:
 * <p><pre>
 *      Initial balance: 1000
 *      Annual interest rate in percent: 6.0
 *      After first month:    1005.00
 *      After second month:   1010.03
 *      After third month:    1015.08</pre>
 */
public class AfterThreeMonths
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Initial balance: ");
        double initial = in.nextDouble();
        System.out.print("Annual interest rate in percent: ");
        double interest = in.nextDouble();

        double monthlyRate = interest / 12;
        double first = initial + (initial * monthlyRate / 100);
        double second = first + (first * monthlyRate / 100);
        double third = second + (second * monthlyRate / 100);

        System.out.printf("%-25s%.2f\n","After first month:", first);
        System.out.printf("%-25s%.2f\n","After second month:", second);
        System.out.printf("%-25s%.2f\n","After third month:", third);
    }
}
