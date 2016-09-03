package p_05_19_recursively_compute_powers_of_int;

/**
 * Use recursion to compute a^n, where n is a positive integer.
 * Hint: if n is 1, then a^n = a. If n is even, then a^n = (a^n/2)^2.
 * Otherwise, a^n = a x a^n-1.
 */
public class RecursivelyComputePowersOfInt
{
    public static void main(String[] args)
    {
        int a = 2;
        int n = 10;
        System.out.printf("%d%n", computePowers(a, n));
    }

    /**
     * The method computes recursively a^n (a raised to the power n).
     *
     * @param a integer
     * @param n integer
     * @return integer
     */
    public static int computePowers(int a, int n)
    {
        if (n == 1)
        {
            return a;
        }
        return a * computePowers(a, n - 1);
    }
}
