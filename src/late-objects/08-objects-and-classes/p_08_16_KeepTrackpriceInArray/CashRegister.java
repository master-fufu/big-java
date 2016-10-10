package p_08_16_KeepTrackpriceInArray;

import java.util.ArrayList;

/**
 * Reimplement the {@code CashRegister} class so that it keeps track of the
 * price of each added item in an {@code ArrayList&lt;Double&gt;}. Remove the
 * {@code itemCount} and {@code totalPrice} instance variables. Reimplement
 * the {@code clear}, {@code addItem}, {@code getTotal}, and {@code getCount}
 * methods. Add a method {@code displayAll} that displays the prices of all
 * items in the current sale.
 */
public class CashRegister
{
    private ArrayList<Double> prices;

    /**
     * Constructs a cash register with cleared item count and total.
     */
    public CashRegister()
    {
        prices = new ArrayList<>();
    }

    /**
     * Adds an item to this cash register.
     *
     * @param price the price of this item
     */
    public void addItem(double price)
    {
        prices.add(price);
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
        return total;
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
     * Clears the item count and the total.
     */
    public void clear()
    {
        prices.clear();
    }

    public void displayAll()
    {
        for (double el : prices)
        {
            System.out.print(el + " ");
        }
    }
}
