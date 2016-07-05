package p_02_06_meters_converter;

import java.util.Scanner;

/**
 * Write a program that prompts user for a measurement in meters and then
 * converts it to miles, feet and inches.
 */
public class MetersConverter
{
    public static void main(String[] args)
    {
        final double MILE = 0.000621371192;
        final double INCH = 39.3700787;
        final double FEET = 3.2808399;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter value in meters: ");
        double meters = in.nextDouble();
        System.out.println("");
        double m_to_miles = meters * MILE;
        double m_to_inches = meters * INCH;
        double m_to_feets = meters * FEET;

        System.out.printf("%.2fm = %.4f miles, %.4f inches, %.4f feets.\n",
                meters, m_to_miles, m_to_inches, m_to_feets);
    }
}
