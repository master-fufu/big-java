package p_04_01d_sum_odd_numbers;

import java.util.Scanner;

/**
 * Compute the sum of all odd numbers between a and b (inclusive), where a and b are inputs.
 */
public class SumOddNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int a = in.nextInt();
        System.out.print("Enter b value: ");
        int b = in.nextInt();

        int sum = 0;

        if (a > 0 && b > 0)
        {
            System.out.print("Odd numbers: ");
            for (int i = a; i <= b; i++)
            {
                if (i % 2 != 0)
                {
                    sum += i;
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.printf("Sum of odds between %s and %s is %d", a, b, sum);
        }
        else
        {
            System.err.println("Enter positive values");
        }
    }
}
