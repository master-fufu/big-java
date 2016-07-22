package p_03_19_compare_float_decimal_places;

import java.util.Scanner;
/**
 * Write a program that reads in two floating-point numbers and tests whether
 * they are the same up to two decimal places.
 */
public class CompareFloatDecimalPlaces
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter floating-point number: ");
        double x = in.nextDouble();
        double y = in.nextDouble();

        x = Math.round(x * 100);
        x = x / 100;

        y = Math.round(y * 100);
        y = y / 100;

        if (x == y)
        {
            System.out.println("They are the same up to two decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
