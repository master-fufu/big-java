package p_04_18_prime_numbers;

import java.util.Scanner;

/**
 * Prime numbers. Write a program that prompts the user for an integer and
 * then prints out all prime numbers up to that integer. For example, when
 * the user enters 20, the program should print 2 3 5 7 11 13 17 19
 */
public class PrimeNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer: ");

        int input = in.nextInt();

        for (int i = 2; i < input; i++)
        {
            boolean isPrime = true;

            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                }
            }
            if (isPrime)
            {
                System.out.printf("%d ", i);
            }
        }
    }
}
