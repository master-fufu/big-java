package p_08_17_KeepTrackpriceAsInteger;

import java.util.ArrayList;

/**
 * Reimplement the {@code CashRegister} class so that it keeps track of the
 * total price as an integer: the total cents of the price. For example,
 * instead of storing 17.29, store the integer 1729. Such an implementation is
 * commonly used because it avoids the accumulation of roundoff errors. Do not
 * change the public interface of the class.
 */
public class CashRegister
{
    private ArrayList<Integer> prices;

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
        prices.add((int) (price * 100));
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
