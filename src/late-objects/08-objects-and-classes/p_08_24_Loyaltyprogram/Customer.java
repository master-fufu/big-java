package p_08_24_Loyaltyprogram;

import java.util.ArrayList;

/**
 * The Downtown Marketing Association wants to promote downtown shopping with
 * a loyalty program similar to the one in Exercise P8.23. Shops are identified
 * by a number between 1 and 20. Add a new parameter variable to the
 * {@code makePurchase} method that indicates the shop. The discount is awarded
 * if a customer makes purchases in at least three different shops, spending
 * a total of $100 or more.
 */
public class Customer
{
    private double totalPurchases;
    private double discount;
    private ArrayList<Integer> shops;

    /**
     * Constructs a customer object.
     */
    public Customer()
    {
        discount = 0;
        totalPurchases = 0;
        shops = new ArrayList<>();
    }

    /**
     * Makes purchase and adds the amount spent to the total purchase value.
     *
     * @param amount the amount of money spent on a purchase
     * @param shop   the number of shop where the purchase was made
     */
    public void makePurchase(double amount, int shop)
    {
        if (shop >= 1 || shop <= 20)
        {
            shops.add(shop);
        }
        totalPurchases += amount - discount;
        discount = 0;
    }

    /**
     * Checks if total purchase value has reached 100 and minimum three
     * different shops used for purchases. If customer made 100 or more
     * on purchases, minus 100 from purchases and initialize discount to 10.
     *
     * @return true if purchases value reached 100 and number of shops >= 3
     */
    public boolean discountReached()
    {
        if (totalPurchases >= 100 && differentShopsUsed())
        {
            totalPurchases -= 100;
            shops.clear();
            discount = 10;
            return true;
        }
        return false;
    }

    /**
     * Checks how many different shops have been used by customer to make
     * purchase. Returns true if three different shops have been used.
     *
     * @return true if number of different shops >= 3, false otherwise
     */
    private boolean differentShopsUsed()
    {
        for (int i = 0; i < shops.size(); i++)
        {
            for (int j = i + 1; j < shops.size(); j++)
            {
                if (shops.get(i).equals(shops.get(j)))
                {
                    shops.remove(j);
                    j--;
                }
            }
        }
        return shops.size() >= 3;
    }

    /**
     * Gets total value of purchases made.
     *
     * @return total value of purchases
     */
    public double getTotalPurchases()
    {
        return totalPurchases;
    }
}
