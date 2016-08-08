package p_04_17a_factoring_of_integers;

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
                for (int k = 2; k < i; k++)
                {
                    if (integer % k == 0)
                    {
                        integer /= k;
                        System.out.printf("%d ", k);
                    }
                }
            }
            if (!(integer == 1))
            {
                System.out.printf("%d%n", integer);
            }
        } while (!(input <= 0));
    }
}
