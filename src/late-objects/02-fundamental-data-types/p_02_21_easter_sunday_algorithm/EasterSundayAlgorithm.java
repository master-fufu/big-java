package p_02_21_easter_sunday_algorithm;

import java.util.Scanner;

/**
 * Easter Sunday is the first Sunday after the first full moon of spring. To
 * compute the date, you can use this algorithm, invented by the mathematician
 * Carl Friedrich Gauss in 1800:
 * <p><ol>
 * <li> Let {@code y} be the year (such as 1800 or 2001).
 * <li> Divide {@code y} by {@code 19} and call the remainder {@code a}. Ignore the quotient.
 * <li> Divide {@code y} by {@code 100} to get a quotient {@code b} and a remainder {@code c}.
 * <li> Divide {@code b} by {@code 4} to get a quotient {@code d} and and a remainder {@code e}.
 * <li> Divide {@code 8 * b + 13} by {@code 25} to get a quotient {@code g}. Ignore the remainder.
 * <li> Divide {@code 19 * a + b - d - g + 15} by {@code 30} to get a remainder {@code h}. Ignore the quotient.
 * <li> Divide {@code c} by {@code 4} to get a quotient {@code j} and a remainder {@code k}.
 * <li> Divide {@code a + 11 * h} by {@code 319} to get a quotient {@code m}. Ignore the remainder.
 * <li> Divide {@code 2 * e + 2 * j - k - h + m + 32} by {@code 7} to get a remainder {@code r}. Ignore the quotient.
 * <li> Divide {@code h - m + r + 90} by {@code 25} to get a quotient {@code n}. Ignore the remainder.
 * <li> Divide {@code h - m + r + n + 19} by {@code 32} to get a remainder {@code p}. Ignore the quotient.</ol>
 * <p>
 * Then Easter falls on day p of month n. Write a program that prompts the user for a year
 * and prints out the month and day of Easter Sunday.
 */
public class EasterSundayAlgorithm
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int y = in.nextInt();
        int a = y % 19;
        int b = y / 100;
        int c = y % 100;
        int d = b / 4;
        int e = b % 4;
        int g = (8 * b + 13) / 25;
        int h = (19 * a + b - d - g + 15) % 30;
        int j = c / 4;
        int k = c % 4;
        int m = (a + 11 * h) / 319;
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        int n = (h - m + r + 90) / 25;
        int p = (h - m + r + n + 19) % 32;

        System.out.printf("y: %s, a: %s, b: %s, c: %s, d: %s, e %s, g: %s, h: %s, j: %s, k: %s, "
                + "m: %s, r: %s, n: %s, p: %s\n", y, a, b, c, d, e, g, h, j, k, m, r, n, p);

        System.out.printf("Easter Sunday day %s month %s year %s\n", p, n, y);
    }
}
