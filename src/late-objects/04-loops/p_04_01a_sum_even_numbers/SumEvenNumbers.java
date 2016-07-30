package p_04_01a_sum_even_numbers;

/**
 * Compute sum of all even numbers between 2 and 100 (inclusive).
 */
public class SumEvenNumbers
{
    public static void main(String[] args)
    {
        int n = 0;
        int sum = 0;
        while (n < 100)
        {
            n = n + 2;
            sum += n;
            System.out.print(sum + " ");
        }
    }
}
