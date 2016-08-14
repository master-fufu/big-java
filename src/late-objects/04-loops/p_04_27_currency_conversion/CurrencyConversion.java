package p_04_27_currency_conversion;

import java.util.Scanner;

/**
 * Currency conversion. Write a program that first asks the user to type
 * today's price for one dollar in Japanese yen, then reads US dollar values
 * and converts each to yen. Use 0 as sentinel.
 */
public class CurrencyConversion
{
    public static void main(String[] args)
    {
        double dollarPrice = 0;
        double conversionResult = 0;
        double input;
        double dollarsToConvert = 0;

        System.out.print("Enter today's price for one Dollar in Japanese Yen: ");
        Scanner in = new Scanner(System.in);
        dollarPrice = in.nextDouble();
        input = dollarPrice; // to stop conversion before entering loop

        while (input != 0)
        {
            System.out.print("Now enter how many US Dollar do you want convert to Yens: ");
            dollarsToConvert = in.nextDouble();
            input = dollarsToConvert; // stop conversion if input is 0;

            if (input != 0)
            {
                conversionResult = dollarsToConvert * dollarPrice;
                System.out.printf("%.2f dollars = %.2f yens%n", dollarsToConvert, conversionResult);
            }
            else
            {
                System.out.println("Good bye");
            }
        }
    }
}
