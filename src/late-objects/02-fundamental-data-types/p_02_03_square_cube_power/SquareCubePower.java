package p_02_03_square_cube_power;

import java.util.Scanner;

/**
 * Write a program that reads a number and display the square, cube, and fourth power.
 */
public class SquareCubePower
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length value: ");
        double value = in.nextDouble();

        System.out.printf("The square: %12.2f\n", value * value);
        System.out.printf("The cube: %14.2f\n", value * value * value);
        System.out.printf("The fourth power: %6.2f\n", Math.pow(value, 4));
    }
}
