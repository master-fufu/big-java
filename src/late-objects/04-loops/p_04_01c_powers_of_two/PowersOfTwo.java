package p_04_01c_powers_of_two;

/**
 * Compute all powers of 2 from 2^0 up to 2^20
 */
public class PowersOfTwo
{
    public static void main(String[] args)
    {
        int n = 1;

        for (int i = 0; i <= 20; i++)
        {
            System.out.printf("2^%d = %d\n", i, n);
            n = 2 * n;
        }
    }
}
