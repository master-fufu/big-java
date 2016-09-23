package p_06_29_discount;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A pet shop wants to give a discount to its clients if they buy one or more
 * pets and at least five other items. The discount is equal to 20 percent of
 * the cost of the other items, but not the pets.
 * Implement a method
 * <p><pre>
 *      public static void discount(double[] prices, boolean[] isPet, int nItems)</pre>
 * The method receives information about a particular sale. For the ith item,
 * {@code prices[i]} is the price before any discount, and {@code isPet[i]} is
 * true if the item is a pet.
 * <p>
 * Write a program that prompts a cashier to enter each price and then a
 * {@code Y} for a pet or {@code N} for another item. Use a price of –1 as a
 * sentinel. Save the inputs in an array. Call the method that you implemented,
 * and display the discount.
 */
public class PetShopDiscount
{
    public static void main(String[] args)
    {
        buyItems();
    }

    /**
     * Calculates the sum of the prices entered by cashier and calculates the
     * discount if number of items is greater than 5 (excluding pets) and
     * number of pets greater than 1.
     *
     * @param prices array of prices, type of double
     * @param isPet  array of true/false values, type of boolean
     * @param nItems total number of items sold
     */
    public static void discount(double[] prices, boolean[] isPet, int nItems)
    {
        if (nItems > 0)
        {
            int itemsForDiscount = isPet.length - countPets(isPet);
            double sumToDiscount = 0;
            double sum = 0;

            if (itemsForDiscount >= 5 && countPets(isPet) > 0)
            {
                int i = 0;
                while (i < prices.length)
                {
                    if (!isPet[i])
                    {
                        sumToDiscount += prices[i];
                    }
                    i++;
                }
            }
            else
            {
                int j = 0;
                while (j < prices.length)
                {
                    sum += prices[j];
                    j++;
                }
            }
            System.out.println("Total items sold: " + prices.length);
            System.out.println("Number of pets: " + countPets(isPet));

            if (itemsForDiscount >= 5 && countPets(isPet) > 0)
            {
                System.out.println("Discount: " + (sumToDiscount / 100 * 20));
                System.out.println("Total with discount: "
                        + (sumToDiscount - (sumToDiscount / 100 * 20)));
            }
            else
            {
                System.out.println("Total sum: " + sum);
            }
        }
        else
        {
            System.out.println("Items sold: " + nItems);
        }
    }

    /**
     * Prompts a cashier to enter price for an item. If price not equals to -1,
     * then cashier is prompted to enter 'Y' or 'N' to confirm whether the item
     * is a pet. Prices entered by cashier are getting recorded to array type
     * of double and 'Y' or 'N' signify TRUE or FALSE values in boolean array.
     * Selling is stopped when cashier enters -1. When selling is stopped,
     * then arrays prices[], isPet[], and prices.length are getting passed to
     * discount() function.
     */
    public static void buyItems()
    {
        final int LENGTH = 10;

        double[] prices = new double[LENGTH];
        boolean[] isPet = new boolean[LENGTH];
        int currentSize = 0;

        boolean done = false;

        while (!done)
        {
            prices[currentSize] = getPrice("Please enter price: ");

            if (prices[currentSize] == -1)
            {
                done = true;
            }
            else
            {
                if (currentSize >= prices.length)
                {
                    prices = Arrays.copyOf(prices, 2 * prices.length);
                    isPet = Arrays.copyOf(isPet, 2 * isPet.length);
                }
                isPet[currentSize] = getPet("Is it a pet? (Y/N) ");
                currentSize++;
            }
        }
        // Cut array size to match it to the number of items bought (inc. pets)
        prices = Arrays.copyOf(prices, currentSize);
        isPet = Arrays.copyOf(isPet, currentSize);

        discount(prices, isPet, prices.length);
    }

    /**
     * Counts elements with TRUE value in the array of boolean values
     *
     * @param A array, type of boolean
     * @return number of elements with value of TRUE
     */
    public static int countPets(boolean[] A)
    {
        int counter = 0;
        for (boolean el : A)
        {
            if (el)
            {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Prompts cashier to input Y or N to register if item is a pet or no.
     *
     * @param prompt ask cashier to input Y if item is pet, N otherwise
     * @return TRUE if input is 'Y'
     */
    public static boolean getPet(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.next().equalsIgnoreCase("y");
    }

    /**
     * Prompts cashier to input price of an item.
     *
     * @param prompt prompts cashier to input price, type of String
     * @return price of an item, type of double
     */
    public static double getPrice(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextDouble();
    }
}
