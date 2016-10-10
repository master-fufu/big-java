package p_08_18_CountTotalSalesOfTheDay;

import java.util.Scanner;

/**
 * After closing time, the store manager would like to know how much business
 * was transacted during the day. Modify the {@code CashRegister} class to
 * enable this functionality. Supply methods {@code getSalesTotal} and
 * {@code getSalesCount} to get the total amount of all sales and the number
 * of sales. Supply a method {@code resetSales} that resets any counters and
 * totals so that the next day's sales start from zero.
 */
public class CashRegisterTest
{

    public static void main(String[] args)
    {
        double total;
        int count;

        // First cash register

        Scanner reg1 = new Scanner("10.51 2.010 3.61 5.01 10.055");

        CashRegister register1 = new CashRegister();

        while (reg1.hasNextDouble())
        {
            register1.addItem(reg1.nextDouble());
        }

        total = register1.getTotal();
        System.out.println("Register 1 total: " + total);

        count = register1.getCount();
        System.out.println("Register 1 count: " + count);

        System.out.print("Register 1 display all: ");
        register1.displayAll();
        System.out.println();

        System.out.println();

        // Second cash register

        Scanner reg2 = new Scanner("15.60 3.015 5.6 10");

        CashRegister register2 = new CashRegister();

        while (reg2.hasNextDouble())
        {
            register2.addItem(reg2.nextDouble());
        }

        total = register2.getTotal();
        System.out.println("Register 2 total: " + total);

        count = register2.getCount();
        System.out.println("Register 2 count: " + count);

        System.out.print("Register 2 display all: ");
        register2.displayAll();
        System.out.println();

        System.out.println();

        System.out.println("Total sales of the day: " + CashRegister.getSalesTotal());
        System.out.println("Total sales count: " + CashRegister.getSalesCount());
        System.out.println();

        System.out.println("Reset sales: ");
        CashRegister.resetSales();

        System.out.println("Total sales of the day: " + CashRegister.getSalesTotal());
        System.out.println("Total sales count: " + CashRegister.getSalesCount());
    }
}
