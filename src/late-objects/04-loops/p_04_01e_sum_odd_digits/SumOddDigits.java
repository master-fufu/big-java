package p_04_01e_sum_odd_digits;

/**
 * The sum of all odd digits of an input. (For example, if the input is 32677,
 * the sum would be 3 + 7 + 7 = 17.)
 */
public class SumOddDigits
{
    public static void main(String[] args)
    {
        int input = 32677;
        int digit;
        int sum = 0;

        for (int i = input; i > 0; i = input % 10)
        {
            digit = input % 10;
            input = input / 10;
            if (digit % 2 != 0)
            {
                sum += digit;
            }
        }
        System.out.printf("Sum of odd digits: %d", sum);
    }
}
