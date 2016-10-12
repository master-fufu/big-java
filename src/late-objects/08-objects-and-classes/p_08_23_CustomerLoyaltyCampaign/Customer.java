package p_08_23_CustomerLoyaltyCampaign;

/**
 * Design a {@code Customer} class to handle a customer loyalty marketing
 * campaign. After accumulating $100 in purchases, the customer receives
 * a $10 discount on the next purchase. Provide methods
 * <p><ul>
 * <li>{@code void makePurchase(double amount)}
 * <li>{@code boolean discountReached()}</ul>
 * <p>
 * Provide a test program and test a scenario in which a customer has earned
 * a discount and then made over $90, but less than $100 in purchases. This
 * should not result in a second discount. Then add another purchase that
 * results in the second discount.
 */
public class Customer
{
    private double totalPurchases;
    private double discount;

    /**
     * Constructs a customer object.
     */
    public Customer()
    {
        totalPurchases = 0;
        discount = 0;
    }

    /**
     * Makes purchase and adds the amount spent to the total purchase value.
     *
     * @param amount amount of money spent on a purchase
     */
    public void makePurchase(double amount)
    {
        totalPurchases += amount - discount;
        discount = 0;
    }

    /**
     * Checks if total purchase value has reached 100. If customer
     * made 100 or more on purchases, minus 100 from purchases and
     * initialize discount to 10.
     *
     * @return true if purchases value reached 100
     */
    public boolean discountReached()
    {
        if (totalPurchases >= 100)
        {
            totalPurchases -= 100;
            discount = 10;
            return true;
        }
        return false;
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
