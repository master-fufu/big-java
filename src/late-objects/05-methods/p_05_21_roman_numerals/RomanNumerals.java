package p_05_21_roman_numerals;

import java.util.Scanner;

/**
 * In Exercise P3.26 you were asked to write a program to convert a number to
 * its representation in Roman numerals. At the time, you did not know how to
 * eliminate duplicate code, and as a consequence the resulting program was
 * rather long. Rewrite that program by implementing and using the following method:
 * <p><pre>
 *      public static String romanDigit(int n, String one, String five, String ten)</pre>
 * That method translates one digit, using the string specified for the one,
 * five, and ten values. You would call the method as follows:
 * <p><pre>
 *      romanOnes = romanDigit(n % 10, "I", "V", "X");
 *      n = n / 10;
 *      romanTens = romanDigit(n % 10, "X", "L", "C");
 *      . . .</pre>
 */
public class RomanNumerals
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int number;

        do
        {
            System.out.print("Enter number: ");
            number = in.nextInt();
            System.out.println(intToRoman(number));
        } while (number != 0);
    }

    public static String intToRoman(int n)
    {
        String romanOnes = romanDigit(n % 10, "I", "V", "X");
        n = n / 10;
        String romanTens = romanDigit(n % 10, "X", "L", "C");
        n = n / 10;
        String romanHundreds = romanDigit(n % 10, "C", "D", "M");
        n = n / 10;
        String romanThousands = romanDigit(n % 10, "M", "M", "M");

        return romanThousands + romanHundreds + romanTens + romanOnes;
    }

    public static String romanDigit(int n, String one, String five, String ten)
    {
        if (n != 0)
        {
            if (n == 9)
            {
                return one + ten;
            }
            else if (n == 8)
            {
                return five + one + one + one;
            }
            else if (n == 7)
            {
                return five + one + one;
            }
            else if (n == 6)
            {
                return five + one;
            }
            else if (n == 5)
            {
                return five;
            }
            else if (n == 4)
            {
                return one + five;
            }
            else if (n == 3)
            {
                return one + one + one;
            }
            else if (n == 2)
            {
                return one + one;
            }
            else
            {
                return one;
            }
        }
        return "";
    }
}
