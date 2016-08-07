package p_04_13_powers_of_two;

/**
 * Write a program that prints all powers of two from 2^0 up to 2^20
 */
public class PowersOfTwo
{
    public static void main(String[] args)
    {
        int result = 1;
        for (int i = 0; i <= 20; i++)
        {
            System.out.printf("%d %d%n", i, result);
            result = result * 2;
        }
    }
}
