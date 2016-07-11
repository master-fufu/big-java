package p_02_22_translate_pseudocode;

import java.util.Scanner;

/**
 * The following pseudocode describes how a bookstore computes the price of an
 * order from the total price and the number of the books that were ordered.
 * <p><pre>
 *      Read the total book price and the number of books.
 *      Compute the tax (7.5 percent of the total book price).
 *      Compute the shipping charge ($2 per book).
 *      The price of the order is the sum of the total book price, the tax, and the shipping charge.
 *      Print the price of the order.</pre>
 * Translate this pseudocode into a Java program.
 */
public class TranslatePseudocode
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total book price: ");
        double totalPrice = in.nextDouble();
        System.out.print("Enter number of books: ");
        int books = in.nextInt();

        final double TAX = 7.5;
        final int SHIPPING_FEE = 2;

        double totalTax = totalPrice / 100 * TAX;
        int totalShipFee = books * SHIPPING_FEE;

        double orderPrice = totalPrice + totalTax + totalShipFee;

        System.out.printf("Tax: %.2f\n", totalTax);
        System.out.println("Shipping charge: " + totalShipFee);
        System.out.printf("Total order price is: %.2f\n", orderPrice);

    }
}
