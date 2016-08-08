package p_04_17b_factoring_of_integers;

import java.util.Scanner;

/**
 * Factoring of integers. Write a program that asks the user for an integer
 * and then prints out all its factors. For example, when the user enters 150,
 * the program should print 2 3 5 5
 */
public class FactoringOfIntegers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int input;
        int integer;

        do
        {
            System.out.print("Enter an integer: ");
            integer = in.nextInt();
            input = integer;

            for (int i = 2; i <= integer; i++)
            {
                if (integer % i == 0)
                {
                    integer /= i;
                    System.out.printf("%d ", i);
                }
            }
            if (!(integer == 1))
            {
                System.out.printf("%d", integer);
            }
            System.out.println();
        } while (!(input <= 0));
    }
}
