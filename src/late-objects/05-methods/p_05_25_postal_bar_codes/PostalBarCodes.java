package p_05_25_postal_bar_codes;

import java.util.Scanner;

/**
 * <em>Postal bar codes</em>. For faster sorting of letters, the United States
 * Postal Services encourages companies that send large volume of mail to use
 * a bar code denoting the zip code (see Figure 6). The encoding scheme for a
 * five-digit zip code is shown in Figure 7. There are full-height frame bars
 * on each side. The five encoded digits are followed by a check digit, which
 * is computed as follows: Add up all digits, and choose the check digit to
 * make the sum a multiple of 10. For example, the zip code 95014 has a sum
 * of 19, so the check digit is 1 to make the sum equal to 20.
 * <p>
 * Each digit of the zip code, and the check digit, is encoded according to the
 * table below, where 1 denotes a full bar and 0 a half bar. The digit can be
 * easily computed from the bar code using column weights 7, 4, 2, 1, 0. For
 * example, 01100 is 0 x 7 + 1 x 4 + 1 x 2 + 0 x 1 + 0 x 0 = 6. The only
 * exception is 0, which would yield 11 according to the weight formula.
 * <p>
 * Write a program that asks the user for a zip code and prints the bar code.
 * Use ':' for half bars, '|' for full bars. For example, 95014 becomes
 * <p><pre>
 *      ||:|:::|:|:||::::::||:|::|:::|||</pre>
 * Provide these methods:
 * <p><pre>
 *      public static void printDigit(4)
 *      public static void printBarCode(int zipCode)</pre>
 */
public class PostalBarCodes
{
    public static void main(String[] args)
    {
        int input = readInt("Enter a zip code: ");

        while (input > 99999)
        {
            input = readInt("Enter a zip code less than 99999: ");
        }

        int sum = sumOfDigits(input); // sum of zip code digits
        int zipCode = input * 10 + checkNumber(sum); // add check number to zip code

        printBarCode(zipCode); // prints zip code in a form of bar code
    }

    /**
     * The method prints zip code in a form of postal bar code.
     *
     * @param zipCode the zip code
     */
    public static void printBarCode(int zipCode)
    {
        System.out.print("|");
        int n = 1000000;
        while (n / 10 != 0)
        {
            n /= 10;
            printDigit(zipCode / n % 10);
        }
        System.out.print("|");
    }

    /**
     * The method prints one digit in the form of barcode
     *
     * @param d one digit of five-digit zip code, type of int
     */
    public static void printDigit(int d)
    {
        System.out.printf("%s", weightTable(d));
    }

    /**
     * The method computes recursively the sum of all digits of zip code.
     * The sum of digits is needed to calculate check number for the barcode.
     *
     * @param d the five-digit zip code
     * @return sum of the zip code digits, type of int
     */
    public static int sumOfDigits(int d)
    {
        if (d / 10 == 0)
        {
            return d;
        }
        return d % 10 + sumOfDigits(d / 10);
    }

    /**
     * The method calculates check number for a postal barcode.
     * It takes the result of sumOfDigits() method as input.
     *
     * @param n the sum of five-digit zip code
     * @return the check number
     */
    public static int checkNumber(int n)
    {
        // this if block deals with 00000 zip code
        // as well as when sum of digits % 10 == 0
        // in this case check number will be 0
        if (n == 0 || n % 10 == 0)
        {
            return 0;
        }
        return ((n % 10) - 10) * (-1);
    }

    /**
     * The method converts single integer into five-character bar code
     * according to the weight table.
     *
     * @param n five-digit zip code
     * @return five-character bar code, type of String
     */
    public static String weightTable(int n)
    {
        String barcode = "";
        if (n == 1)
        {
            barcode = ":::||";
        }
        if (n == 2)
        {
            barcode = "::|:|";
        }
        if (n == 3)
        {
            barcode = "::||:";
        }
        if (n == 4)
        {
            barcode = ":|::|";
        }
        if (n == 5)
        {
            barcode = ":|:|:";
        }
        if (n == 6)
        {
            barcode = ":||::";
        }
        if (n == 7)
        {
            barcode = "|:::|";
        }
        if (n == 8)
        {
            barcode = "|::|:";
        }
        if (n == 9)
        {
            barcode = "|:|::";
        }
        if (n == 0)
        {
            barcode = "||:::";
        }
        return barcode;
    }

    /**
     * The method prompt the user for input and returns integer
     * to the calling method.
     *
     * @param prompt String
     * @return integer
     */
    public static int readInt(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextInt();
    }
}
