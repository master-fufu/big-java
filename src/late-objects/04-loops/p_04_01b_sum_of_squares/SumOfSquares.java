package p_04_01b_sum_of_squares;

/**
 * Compute the sum of all squares between 1 and 100 (inclusive).
 */
public class SumOfSquares
{
    public static void main(String[] args)
    {
        int n = 0;
        int sum = 0;
        for (int i = 0; i <= 100; i++)
        {
            i = n * n;
            sum += i;
            System.out.println("number = " + n + " square = " + i + " sum = " + sum + " ");
            n++;
        }
    }
}
