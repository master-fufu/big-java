package p_05_18_recursively_find_number_of_digits;

import java.util.Scanner;

/**
 * Use recursion to determine the number of digits in an integer {@code n}.
 * Hint: If {@code n} is < 10, it has one digit. Otherwise, it has one more
 * digit than {@code n / 10}.
 */
public class RecursivelyFindNumberOfDigits
{
    public static void main(String[] args)
    {
        int input = readInt("Enter an integer: ");
        int digits = digits(input);
        System.out.printf("%d%n", digits);
    }

    /**
     * The method determines the number of digits in
     * an integer using recursion.
     *
     * @param n integer
     * @return number of digits in integer n, type of int
     */
    public static int digits(int n)
    {
        if (n < 10)
        {
            return 1;
        }
        return 1 + digits(n / 10);
    }

    /**
     * The method prompts user for an input and returns
     * integer to the calling method.
     *
     * @param prompt String
     * @return int
     */
    public static int readInt(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s", prompt);
        return in.nextInt();
    }
}
