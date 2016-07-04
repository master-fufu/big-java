package p_02_04_values;

import java.util.Scanner;

/**
 * Write a program that prompts the user for two integers and then prints the
 * sum, the difference, the product, the average, the distance (absolute value
 * of the difference), the maximum (the larger of the two), the minimum (the
 * smaller of the two).
 */
public class Values
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("First integer: ");
        int firstInt = in.nextInt();
        System.out.print("Second integer: ");
        int secondInt = in.nextInt();

        System.out.printf("Sum: %d%n", firstInt + secondInt);
        System.out.printf("Difference: %d%n", firstInt - secondInt);
        System.out.printf("Product: %d%n", firstInt * secondInt);
        System.out.printf("Average: %.2f%n", (double) (firstInt + secondInt) / 2);
        System.out.printf("Distance: %d%n", Math.abs(firstInt - secondInt));
        System.out.printf("Max: %d%n", Math.max(firstInt, secondInt));
        System.out.printf("Min: %d%n", Math.min(firstInt, secondInt));
    }
}
