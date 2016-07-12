package p_03_01_negative_zero_positive;

import java.util.Scanner;

/**
 * Write a program that reads an integer and prints whether it is
 * negative, zero, or positive.
 */
public class NegativeZeroPositive
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = in.nextInt();

        if (input > 0)
        {
            System.out.println("Number is positive");
        }
        else if (input < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
}
