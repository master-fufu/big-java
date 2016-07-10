package p_02_19_numbers_to_months;

import java.util.Scanner;

/**
 * Write a program that transforms numbers {@code 1, 2, 3, ..., 12} into the
 * corresponding month file {@code January, February, March, ..., December}.
 * Hint: Make a very long string {@code "January February March ..."}, in
 * which you add spaces such that each month name has <em>the same length</em>.
 * Then use substring to extract the month you want.
 */
public class NumbersToMonths
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNumber = in.nextInt();

        final String monthNames = String.format(
                "%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s",
                "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December");

        String getMonth = monthNames.substring((monthNumber - 1) * 9, monthNumber * 9);
        System.out.println(getMonth);
    }
}
