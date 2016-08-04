package p_04_04_print_highest_temperature;

import java.util.Scanner;

/**
 * Complete the program in HowTo 4.1 on page 169. Your program should read
 * twelve temperature values and print the month with the highest temperature.
 * 7 7 9 11 14 16 19 19 17 13 10 7
 */
public class PrintHighestTemperature
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature value in Celsius");

        double maxTemp = 0;
        int maxTempMonth = 1;

        for (int currentMonth = 1; currentMonth <= 12; currentMonth++)
        {
            System.out.printf("Month %d: ", currentMonth);
            double input = in.nextDouble();
            if (input > maxTemp)
            {
                maxTemp = input;
                maxTempMonth = currentMonth;
            }
        }
        System.out.println("Max temperature month: " + maxTempMonth);
        System.out.println("Highest temperature: " + maxTemp);
    }
}
