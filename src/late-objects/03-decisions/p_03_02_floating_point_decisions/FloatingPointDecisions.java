package p_03_02_floating_point_decisions;

import java.util.Scanner;

/**
 * Write a program that reads a floating-point number and prints "zero" if
 * the number is zero. Otherwise, print "positive" or "negative". Add "small"
 * if the absolute value of the number is less than 1, or "large" if it
 * exceeds 1,000,000.
 */
public class FloatingPointDecisions
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value: ");
        double input = in.nextDouble();

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Positive small");
            }
            else if (input > 1000000)
            {
                System.out.println("Positive large");
            }
            else
            {
                System.out.println("Positive");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("Negative small");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("Negative large");
            }
            else
            {
                System.out.println("Negative");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
