package p_04_19_multiplication_table;

/**
 * Write a program that prints a multiplication table 10x10.
 */
public class MultiplicationTable
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.printf("%5d", j * i);
            }
            System.out.println();
        }
    }
}
