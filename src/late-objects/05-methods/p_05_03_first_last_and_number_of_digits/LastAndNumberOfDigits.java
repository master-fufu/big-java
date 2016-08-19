package p_05_03_first_last_and_number_of_digits;

/**
 * Write the following methods.
 * a) {@code int firstDigit(int n)}, returning the first digit of the argument.
 * b) {@code int lastDigit(int n)}, returning the last digit of the argument.
 * c) {@code int digits(int n)}, returning the number of digits of the argument.
 * <p>
 * For example, firstDigit(1729) is 1, lastDigit(1729) is 9, digits(1729) is 4.
 * Provide a program that tests your methods.
 */
public class LastAndNumberOfDigits
{
    public static void main(String[] args)
    {
        int firstDigitRecursion = firstDigitRecursion(1729);
        System.out.printf("%s%d%n", "The first digit of 1729 using recursion is ",
                firstDigitRecursion);

        int firstDigit = firstDigit(3729);
        System.out.printf("%s%d%n", "The first digit of 3729 using while loop is ",
                firstDigit);

        int lastDigit = lastDigit(1729);
        System.out.printf("%s%d%n", "The last digit of 1729 is ", lastDigit);

        int digits = digits(1709005);
        System.out.printf("%s%d%n", "The number of digits in 1709005 is ", digits);
    }

    /**
     * The method returns first digit of the argument using while loop.
     *
     * @param n any integer
     * @return first digit of an argument
     */
    public static int firstDigit(int n)
    {
        while (n > 9)
        {
            n = n / 10;
        }
        return n;
    }

    /**
     * The method returns first digit of the argument using recursion.
     *
     * @param n any integer
     * @return first digit of an argument
     */
    public static int firstDigitRecursion(int n)
    {
        if (n / 10 == 0)
        {
            return n;
        }
        return firstDigitRecursion(n / 10);
    }

    /**
     * The method returns the last digit of an argument
     *
     * @param n any integer
     * @return last digit of an argument
     */
    public static int lastDigit(int n)
    {
        return n % 10;
    }

    /**
     * The method returns number of digits of the argument
     *
     * @param n any integer
     * @return number of digits of the argument
     */
    public static int digits(int n)
    {
        int count = 0;
        while (n != 0)
        {
            n = n / 10;
            count++;
        }
        return count;
    }
}
