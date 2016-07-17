package p_03_10_altitude_water_boiling;

import java.util.Scanner;

/**
 * The boiling point of water drops by about one degree centigrade for every
 * 300 meters (or 1,000 feet) of altitude. Improve the program of Exercise P3.9
 * to allow the user to supply the altitude in meters or feet.
 */
public class AltitudeWaterBoiling
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temp = in.nextDouble();
        System.out.print("Enter C for Celcius or F for Fahrenheit: ");
        String cf = in.next().toUpperCase();
        System.out.print("Enter altitude value: ");
        double alt = in.nextDouble();
        System.out.print("Enter f for feets or m for meters: ");
        String fm = in.next().toLowerCase();

        double boiling_celsius = 98.8;
        double boiling_fahrenheit = 209.84;

        switch (fm)
        {
            case "f":
            {
                double alt_factor = alt / 1000;
                boiling_celsius -= alt_factor;
                boiling_fahrenheit -= alt_factor;
                break;
            }
            case "m":
            {
                double alt_factor = alt / 300;
                boiling_celsius -= alt_factor;
                boiling_fahrenheit -= alt_factor;
                break;
            }
        }

        switch (cf)
        {
            case "C":
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
                break;
            case "F":
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
                break;
            default:
                System.out.println("Please try again");
                break;
        }
    }
}
