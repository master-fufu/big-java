package p_04_29_sell_at_certain_target_price;

import java.util.Scanner;

/**
 * Your company has shares of stock it would like to sell when their value
 * exceeds a certain target price. Write a program that reads the target price
 * and then reads the current stock price until it is at least the target price.
 * Your program should use a Scanner to read a sequence of double values from
 * standard input. Once the minimum is reached, the program should report that
 * the stock price exceeds the target price.
 */
public class SellAtCertainTargetPrice
{
    public static void main(String[] args)
    {
        double targetPrice;
        double currentStockPrice;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter target price: ");
        targetPrice = in.nextDouble();

        System.out.print("Enter current stock price: ");

        while (in.hasNextDouble())
        {
            currentStockPrice = in.nextDouble();
            if (currentStockPrice < targetPrice)
            {
                System.out.print("Enter current stock price: ");
            }
            else
            {
                System.out.print("The stock price exceeds the target price");
                break;
            }
        }
    }
}
