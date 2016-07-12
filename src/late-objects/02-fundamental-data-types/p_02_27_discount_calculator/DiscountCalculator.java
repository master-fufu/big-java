package p_02_27_discount_calculator;

import java.util.Scanner;

/**
 * A video club wants to reward its best members with a discount based on the
 * member's number of movie rentals and the number of new member referred by
 * the member. The discount is in percent and is equal to the sum of the rental
 * and the referrals, but it cannot exceed 75 percent. (Hint: Math.min) Write
 * a program {@code Discount-Calculator} to calculate the value of the discount.
 * <p>
 * Here is a sample run:
 * <p><pre>
 *      Enter the number of movie rentals: 56
 *      Enter the number of members referred to the video club: 3
 *      The discount is equal to: 59.00 percent.</pre>
 */
public class DiscountCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of movie rentals: ");
        int rentals = in.nextInt();
        System.out.print("Enter the number of members referred to the video club: ");
        int membersReferred = in.nextInt();

        double discount = Math.min(rentals + membersReferred, 75);
        System.out.printf("The discount is equal to: %.2f percent\n", discount);
    }
}
