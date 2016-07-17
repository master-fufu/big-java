package p_03_09_read_temperature_value;

import java.util.Scanner;

/**
 * Write a program that reads a temperature value and the letter C for Celsius
 * or F for Fahrenheit. Print whether water is liquid, solid, or gaseous at
 * the given temperature at sea level.
 */
public class ReadTemperatureValue
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temp = in.nextDouble();
        System.out.print("Enter C for Celcius or F for Fahrenheit: ");
        String cf = in.next().toUpperCase();

        if (cf.equals("C"))
        {
            if (temp <= 0)
            {
                System.out.println(temp + cf + ": water is solid");
            }
            else if (temp > 0 && temp < 98.8)
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
            else if (temp > 32 && temp < 209.84)
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
            System.out.println("Please try again");
        }
    }
}
