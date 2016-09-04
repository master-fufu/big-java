package p_05_26_decode_postal_bar_code;

/**
 * Write a program that reads in a bar code (with ':' denoting half bars and '|'
 * denoting full bars) and prints out the zip code it represents. Print an
 * error message if the bar code is not correct.
 *
 * Example string ||:|:::|:|:||::::::||:|::|:::|||
 */
public class DecodePostalBarCode
{
    public static void main(String[] args)
    {
        String input = "|:||:::|:|:||::::::||:|::|:|::||";

        // Check the length of the bar code.
        // Print error message if the length != 32.
        if (input.length() == 32)
        {
            // cuts off firs and last '|' pipe characters from the string
            String barcode = firstAndLast(input);

            // Converts bar code to the string of digits (5 + 1 check digit)
            String zipCode = barCodeToZipCode(barcode);

            // Parse string of digits into integer (5 + 1 check digit)
            int n = parseInt(zipCode);

            // Sum of all digits in the integer (5 + 1 check digit)
            int sum = sumOfDigits(n);

            // Print the zip code (5 digits)
            System.out.printf("%s %d%n", "Zip Code:", n / 10);

            // Check if zip code is correct
            System.out.printf("%s %s", "Is it correct?", checkBarCode(sum));
        }
        else
        {
            System.out.println("Error. Check the length of the bar code.");
        }
    }

    /**
     * The method converts barcode to the string of 5 digits + 1 check number.
     *
     * @param barcode string containing '|' ':', length of 30
     * @return string of digits, length of 6
     */
    public static String barCodeToZipCode(String barcode)
    {
        String result = "";
        int i = 0;

        while (i < barcode.length())
        {
            String code = barcode.substring(i, i + 5);
            result = result + codeToNumber(code);
            i = i + 5;
        }
        return result;
    }

    /**
     * The method checks if bar code is correct. Bar code length equals 32,
     * otherwise it is too short or too long. And n % 10 checks if remainder
     * equals 0. Returns true if both conditions are true.
     *
     * @param n sum of 6-digit integer (5-digit zip code + 1-digit check number)
     * @return true or false
     */
    public static boolean checkBarCode(int n)
    {
        return n % 10 == 0;
    }

    /**
     * The method computes recursively the sum of all digits of zip code,
     * including the check number.
     *
     * @param d integer
     * @return sum of digits, type of int
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
     * The method takes the zip code as an argument and parses it into integer.
     *
     * @param str string of digits
     * @return integer
     */
    public static int parseInt(String str)
    {
        return Integer.parseInt(str);
    }

    /**
     * The method takes postal bar code as input and returns it without first
     * and the last '|' characters.
     *
     * @param barcode String
     * @return String
     */
    public static String firstAndLast(String barcode)
    {
        String firstLast = barcode;
        firstLast = firstLast.substring(1, firstLast.length() - 1);
        return firstLast;
    }

    /**
     * The method converts five-character bar codes to numbers.
     *
     * @param barcode String
     * @return numbers as String
     */
    public static String codeToNumber(String barcode)
    {
        String n = "";
        if (":::||".equals(barcode))
        {
            n = "1";
        }
        if ("::|:|".equals(barcode))
        {
            n = "2";
        }
        if ("::||:".equals(barcode))
        {
            n = "3";
        }
        if (":|::|".equals(barcode))
        {
            n = "4";
        }
        if (":|:|:".equals(barcode))
        {
            n = "5";
        }
        if (":||::".equals(barcode))
        {
            n = "6";
        }
        if ("|:::|".equals(barcode))
        {
            n = "7";
        }
        if ("|::|:".equals(barcode))
        {
            n = "8";
        }
        if ("|:|::".equals(barcode))
        {
            n = "9";
        }
        if ("||:::".equals(barcode))
        {
            n = "0";
        }
        return n;
    }
}
