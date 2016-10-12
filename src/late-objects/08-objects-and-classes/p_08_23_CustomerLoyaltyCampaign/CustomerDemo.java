package p_08_23_CustomerLoyaltyCampaign;

/**
 * {@code Customer} class demo.
 */
public class CustomerDemo
{
    public static void main(String[] args)
    {
        Customer customer1 = new Customer();

        customer1.makePurchase(20);
        customer1.makePurchase(10);
        customer1.makePurchase(40);

        boolean discountReached = customer1.discountReached();
        System.out.print("Total value: " + customer1.getTotalPurchases());
        System.out.println(" Discount reached? " + discountReached);

        customer1.makePurchase(60);
        discountReached = customer1.discountReached();
        System.out.printf("Total value: %.2f", customer1.getTotalPurchases());
        System.out.println(" Discount reached? " + discountReached);
        System.out.printf("After discount value: %.2f%n", customer1.getTotalPurchases());

        customer1.makePurchase(50);
        System.out.printf("After 50 purchase: %.2f%n", customer1.getTotalPurchases());

        customer1.makePurchase(20);
        System.out.printf("After 20 purchase: %.2f%n", customer1.getTotalPurchases());
        discountReached = customer1.discountReached();
        System.out.println("Discount reached? " + discountReached);

        customer1.makePurchase(30);
        System.out.printf("After 20 purchase: %.2f%n", customer1.getTotalPurchases());
        discountReached = customer1.discountReached();
        System.out.println("Discount reached? " + discountReached);
    }
}
