package p_02_11_gas;

import java.util.Scanner;

/**
 * Write a program that asks the user to input the number of gallons of gas
 * in the tank, the fuel efficiency in miles per gallon, the price of gas per
 * gallon. Then print the cost per 100 miles and how far the car can go with
 * the gas in the tank.
 */
public class Gas
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of gallons of gas in the tank: ");
        double gasInTank = in.nextDouble(); // 10 Imperial (UK) gal

        System.out.print("Enter fuel efficiecy in mile per gallon: ");
        double milesPerGallon = in.nextDouble(); // 27 miles to the gallon

        System.out.print("Enter price of gas per gallon (pence): ");
        double dieselPrice = in.nextDouble(); // 527.80p per gallon

        // Cost per 100 miles
        double gallonsPerMiles = 100 / milesPerGallon;
        double costPerMiles = gallonsPerMiles * dieselPrice / 100;
        System.out.printf("Cost per 100 miles (pounds and pence): %.2f\n", costPerMiles);

        // How far the car can go with the gas in the tank.
        double distance = milesPerGallon * gasInTank;
        System.out.println("How far the car can go with the gas in the tank: " + distance + " miles");
    }
}
