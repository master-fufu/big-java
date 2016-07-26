package p_03_27_days_in_month;

import java.util.Scanner;

/**
 * Write a program that asks the user to enter a month (1 for January, 2 for
 * February, and so on) and then prints the number of days in the month. For
 * February, print "28 or 29 days". Do not use a separate if/else branch for
 * each month. Use Boolean operators.
 */
public class DaysInMonth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a month (from 1 to 12): ");
        int i = in.nextInt();

        boolean feb = i == 2;
        boolean apr = i == 4;
        boolean jun = i == 6;
        boolean sep = i == 9;
        boolean nov = i == 11;

        if (i < 1 || i > 12)
        {
            System.out.println("Error. Enter month from 1 to 12");
            return;
        }

        if (apr || jun || sep || nov)
        {
            System.out.println("30 days");
        }
        else if (feb)
        {
            System.out.println("28 or 29 days");
        }
        else
        {
            System.out.println("31 days");
        }
    }
}
