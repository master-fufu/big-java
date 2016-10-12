package p_08_24_Loyaltyprogram;

/**
 * {@code Customer} class demo.
 */
public class CustomerDemo
{
    public static void main(String[] args)
    {
        Customer customer1 = new Customer();
        boolean discountReached;

        customer1.makePurchase(40, 3);
        customer1.makePurchase(40, 2);
        customer1.makePurchase(40, 3);
        customer1.makePurchase(40, 3);
        customer1.makePurchase(40, 1);

        discountReached = customer1.discountReached();
        System.out.println("Discount reached? " + discountReached);
    }
}
