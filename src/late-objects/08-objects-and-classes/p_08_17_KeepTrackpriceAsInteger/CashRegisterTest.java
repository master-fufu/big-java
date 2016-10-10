package p_08_17_KeepTrackpriceAsInteger;

import java.util.Scanner;

/**
 * Reimplement the {@code CashRegister} class so that it keeps track of the
 * total price as an integer: the total cents of the price. For example,
 * instead of storing 17.29, store the integer 1729. Such an implementation is
 * commonly used because it avoids the accumulation of roundoff errors. Do not
 * change the public interface of the class.
 */
public class CashRegisterTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner("10.51 2.010 3.61 5.01 10.055");

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

        register1.displayAll();
    }
}
