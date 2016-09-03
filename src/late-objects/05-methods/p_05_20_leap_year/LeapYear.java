package p_05_20_leap_year;

import java.util.Scanner;

/**
 * <em>Leap years</em>. Write a method
 * <p><pre>
 *      public static boolean isLeapYear(int year)</pre>
 * that tests whether a year is a leap year: that is, a year with 366 days.
 * Exercise P3.28 describes how to test whether a year is a leap year. In this
 * exercise, use multiple {@code if} statements and {@code return} statements to
 * return the result as soon as you know it.
 */
public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = in.nextInt();

        System.out.println(isLeapYear(year));
    }

    /**
     * The method returns true if year entered is leap year.
     *
     * @param y of int type
     * @return boolean
     */
    public static boolean isLeapYear(int y)
    {
        boolean a = (y % 4) == 0;
        boolean b = (y % 100) != 0;
        boolean c = ((y % 100 == 0) && (y % 400 == 0));

        return a && (b || c);
    }
}
