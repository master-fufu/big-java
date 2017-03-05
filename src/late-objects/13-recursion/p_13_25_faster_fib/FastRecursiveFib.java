package p_13_25_faster_fib;

import java.util.Scanner;

/**
 * The recursive computation of Fibonacci numbers can be speeded up
 * significantly by keeping track of the values that have already been
 * computed. Provide an implementation of the {@code fib} method that uses this
 * strategy. Whenever you return a new value, also store it in an auxiliary
 * array. However, before embarking on a computation, consult the array to find
 * whether the result has already been computed. Compare the running time
 * of your improved implementation with that of the original recursive
 * implementation and the loop implementation.
 */
public class FastRecursiveFib
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        long[] track = new long[n];

        for (int i = 1; i <= n; i++)
        {
            long f = fib(i, track);
            System.out.println("fib(" + i + ") = " + f);
        }
    }

    /**
     * Computes a Fibonacci number.
     *
     * @param n an integer
     * @return the n-th Fibonacci number
     */
    public static long fib(int n, long[] track)
    {
        if (track[n - 1] == 0)
        {
            if (n <= 2)
            {
//                 track[n - 1] = n - 1;
                return 1;
            }
            else
            {
                track[n - 1] = (fib(n - 1, track) + fib(n - 2, track));
            }
        }
        return track[n - 1];
    }
}
