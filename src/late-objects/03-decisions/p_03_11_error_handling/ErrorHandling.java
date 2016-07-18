package p_03_11_error_handling;

import java.util.Scanner;

/**
 * Add error handling to Exercise P3.10. If the user does not enter a number
 * when expected, or provides an invalid unit for the altitude, print an error
 * message and end the program.
 */
public class ErrorHandling
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temp = in.nextDouble();
        System.out.print("Enter C for Celsius or F for Fahrenheit: ");
        String cf = in.next().toUpperCase();
        System.out.print("Enter positive or zero altitude value: ");
        double alt = in.nextDouble();
        System.out.print("Enter F for feet or M for meter: ");
        String fm = in.next().toLowerCase();

        double boiling_celsius = 98.8;
        double boiling_fahrenheit = 209.84;

        if (fm.equals("f"))
        {
            double alt_factor = alt / 1000;
            boiling_celsius -= alt_factor;
            boiling_fahrenheit -= alt_factor;
        }
        else if (fm.equals("m"))
        {
            double alt_factor = alt / 300;
            System.out.println(alt_factor);
            boiling_celsius -= alt_factor;
            boiling_fahrenheit -= alt_factor;
        }
        else
        {
            System.out.println("Please provide valid altitude unit");
        }

        if (cf.equals("C"))
        {
            if (temp <= 0)
            {
                System.out.println(temp + cf + ": water is solid");
            }
            else if (temp > 0 && temp < boiling_celsius)
            {
                System.out.println(temp + cf + ": water is liquid");
            }
            else
            {
                System.out.println(temp + cf + ": water is gaseous");
            }
        }
        else if (cf.equals("F"))
        {
            if (temp <= 32)
            {
                System.out.println(temp + cf + ": water is solid");
            }
            else if (temp > 32 && temp < boiling_fahrenheit)
            {
                System.out.println(temp + cf + ": water is liquid");
            }
            else
            {
                System.out.println(temp + cf + ": water is gaseous");
            }
        }
        else
        {
            System.out.println("Please provide valid temperature unit");
        }
    }
}
