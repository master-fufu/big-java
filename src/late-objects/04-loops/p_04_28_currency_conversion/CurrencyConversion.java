package p_04_28_currency_conversion;

import java.util.Scanner;

/**
 * Write a program that first asks the user to type in today's price of one
 * dollar in Japanese yen, then reads US dollar values and converts each to
 * Japanese yen. Use 0 as the sentinel value to denote the end of dollar inputs.
 * Then the program reads a sequence of yen amounts and converts them to
 * dollars. The second sequence is terminated by another zero value.
 */
public class CurrencyConversion
{
    public static void main(String[] args)
    {
        double currencyInput;
        double yensInput;
        double conversionResult;
        double input;
        double dollarsToConvert;

        System.out.print("Enter today's price for one USD ($) in JPY (¥): ");
        Scanner in = new Scanner(System.in);
        currencyInput = in.nextDouble();
        input = currencyInput; // to stop conversion before entering loop

        while (input != 0)
        {
            System.out.print("Now enter how many USD ($) do you want convert to JPY (¥): ");
            dollarsToConvert = in.nextDouble();
            input = dollarsToConvert; // stop conversion if input is 0;

            if (input != 0)
            {
                conversionResult = dollarsToConvert * currencyInput;
                System.out.printf("%.2f USD = %.2f JPY%n", dollarsToConvert, conversionResult);
            }
            else
            {
                System.out.print("Now enter JPY (¥) amounts to convert them to USD ($): ");
                yensInput = in.nextDouble();
                input = yensInput;
                conversionResult = yensInput / currencyInput;
                System.out.printf("%.2f JPY = %.2f USD%n", yensInput, conversionResult);

                while (input != 0)
                {
                    System.out.print("Now enter JPY (¥) amounts to convert them to USD ($): ");
                    yensInput = in.nextDouble();
                    input = yensInput;

                    if (input != 0)
                    {
                        conversionResult = yensInput / currencyInput;
                        System.out.printf("%.2f JPY = %.2f USD%n", yensInput, conversionResult);
                    }
                    else
                    {
                        System.out.println("Good bye.");
                    }
                }
            }
        }
    }
}
