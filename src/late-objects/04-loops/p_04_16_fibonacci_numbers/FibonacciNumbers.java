package p_04_16_fibonacci_numbers;

import java.util.Scanner;

/**
 * The Fibonacci numbers are defined by the sequence
 * <p><pre>
 *      f1 = 1
 *      f2 = 1
 *      fn = fn-1 + fn-2</pre>
 * Reformulate that as
 * <p><pre>
 *      fold1 = 1;
 *      fold2 = 1;
 *      fnew = fold1 + fold2;</pre>
 * After that discard fold2, which is no longer needed, and set fold2 to fold1
 * and fold1 to fnew. Repeat an appropriate number of times. Implement a
 * program that prompts the user for an integer n and prints the nth Fibonacci
 * number, using the above algorithm.
 */
public class FibonacciNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter nth Fibonacci number: ");

        int nth_number = in.nextInt();
        int i = 0;
        int f_old1 = 0;
        int f_old2 = 1;
        int f_new = 0;

        while (nth_number != i)
        {
            System.out.printf("%d ", f_new);
            f_new = f_old1 + f_old2;
            f_old2 = f_old1;
            f_old1 = f_new;
            i++;
        }
    }
}
