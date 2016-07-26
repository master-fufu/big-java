package p_03_28_leap_year;

import java.util.Scanner;

/**
 * Write a program that asks the user for a year and computes whether that year
 * is a leap year, use a single if statement and Boolean operators. A year with
 * 366 days is called a leap year. Leap years are necessary to keep the calendar
 * synchronised with the sun because the earth revolves around the sun once
 * every 365.25 days. Actually, that figure is not entirely precise, and for all
 * dates after 1582 the Gregorian correction applies. Usually years that are
 * divisible by 4 are leap years, for example 1996. However, years that are
 * divisible by 100 (for example, 1900) are not leap years, but years that are
 * divisible by 400 are leap years (for example, 2000).
 */
public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = in.nextInt();

        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100 == 0) && (year % 400 == 0));

        if (a && (b || c))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}
