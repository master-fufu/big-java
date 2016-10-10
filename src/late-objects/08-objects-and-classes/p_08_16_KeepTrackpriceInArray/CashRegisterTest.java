package p_08_16_KeepTrackpriceInArray;

import java.util.Scanner;

/**
 * Reimplement the {@code CashRegister} class so that it keeps track of the
 * price of each added item in an {@code ArrayList&lt;Double&gt;}. Remove the
 * {@code itemCount} and {@code totalPrice} instance variables. Reimplement
 * the {@code clear}, {@code addItem}, {@code getTotal}, and {@code getCount}
 * methods. Add a method {@code displayAll} that displays the prices of all
 * items in the current sale.
 */
public class CashRegisterTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner("1.5 2.0 3.60 5 10.05");

        CashRegister register1 = new CashRegister();

        while (in.hasNextDouble())
        {
            register1.addItem(in.nextDouble());
        }

        double total = register1.getTotal();
        System.out.println("Total: " + total);

        int count = register1.getCount();
        System.out.println("Count: " + count);

        System.out.print("Display all: ");
        register1.displayAll();
        System.out.println();

        register1.clear();

        total = register1.getTotal();
        System.out.println("Clear all: " + total);
    }
}
