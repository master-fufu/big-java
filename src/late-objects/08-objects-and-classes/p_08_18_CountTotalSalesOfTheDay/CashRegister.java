package p_08_18_CountTotalSalesOfTheDay;

import java.util.ArrayList;

/**
 * After closing time, the store manager would like to know how much business
 * was transacted during the day. Modify the {@code CashRegister} class to
 * enable this functionality. Supply methods {@code getSalesTotal} and
 * {@code getSalesCount} to get the total amount of all sales and the number
 * of sales. Supply a method {@code resetSales} that resets any counters and
 * totals so that the next day's sales start from zero.
 */
public class CashRegister
{
    private static double totalSales = 0;
    private static int totalSalesCount = 0;
    private ArrayList<Integer> prices;

    /**
     * Constructs a cash register with cleared item count and total.
     */
    public CashRegister()
    {
        prices = new ArrayList<>();
    }

    /**
     * Gets the total amount of all sales during business day.
     *
     * @return total sales
     */
    public static double getSalesTotal()
    {
        return totalSales / 100;
    }

    /**
     * Gets the number of all sales during business day.
     *
     * @return number of all sales
     */
    public static int getSalesCount()
    {
        return totalSalesCount;
    }

    /**
     * Resets all counters and totals to zero for the next business day.
     */
    public static void resetSales()
    {
        totalSales = 0;
        totalSalesCount = 0;
    }

    /**
     * Adds an item to this cash register, counts number of total sales and
     * the total value of sales of the day.
     *
     * @param price the price of this item
     */
    public void addItem(double price)
    {
        prices.add((int) (price * 100));
        totalSalesCount++;
        totalSales += (int) (price * 100);
    }

    /**
     * Gets the price of all items in the current sale.
     *
     * @return the total amount
     */
    public double getTotal()
    {
        double total = 0;

        for (double el : prices)
        {
            total += el;
        }
        return total / 100;
    }

    /**
     * Gets the number of items in the current sale.
     *
     * @return the item count
     */
    public int getCount()
    {
        return prices.size();
    }

    /**
     * Clears the item count and the total using clear() method for ArrayList.
     */
    public void clear()
    {
        prices.clear();
    }

    /**
     * Displays all prices in the array.
     */
    public void displayAll()
    {
        for (int el : prices)
        {
            System.out.print(el + " ");
        }
    }
}
