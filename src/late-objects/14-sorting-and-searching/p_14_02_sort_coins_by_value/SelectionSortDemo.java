package p_14_02_sort_coins_by_value;

import java.util.Arrays;

/**
 * Modify the selection sort algorithm to sort an array of coins by their value.
 */
public class SelectionSortDemo
{
    public static void main(String[] args)
    {
        Coin[] a = {
                new Coin(0.05, "Nickel"),
                new Coin(0.05, "Nickel"),
                new Coin(0.25, "Quarter"),
                new Coin(0.01, "Penny"),
                new Coin(0.1, "Dime")
        };

        SelectionSorter selectionSorter = new SelectionSorter(a);
        selectionSorter.sort();

        System.out.println("Result:   " + Arrays.toString(a));

        System.out.println("Expected: [Coin[value=0.01,name=Penny]," +
                " Coin[value=0.05,name=Nickel]," +
                " Coin[value=0.05,name=Nickel]," +
                " Coin[value=0.1,name=Dime]," +
                " Coin[value=0.25,name=Quarter]]");
    }
}
