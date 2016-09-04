package bigJava_05_Methods;

/**
 * Write a program that converts a Roman number such as MCMLXXVIII to its
 * decimal number representation. Hint: first write a method that yields
 * the numeric value of each of the letters. Then use the following algorithm:
 * <p><pre>
 *      total = 0
 *      While the roman number string is not empty
 *          If value(first character) is at least value(second character), or the string has length 1
 *              Add value(first character) to total.
 *              Remove the character.
 *          Else
 *              Add the difference value(second character) - value(first character) to total.
 *              Remove both characters.</pre>
 */
public class RomansToDecimal
{
    public static void main(String[] args)
    {
        String input = "MCMLXXXIV";
        System.out.print(convert(input));
    }

    /**
     * The method converts string of Roman numerals to integer.
     *
     * @param s string of Roman numbers
     * @return integer
     */
    public static int convert(String s)
    {
        int total = 0;
        String str = s;

        while (str.length() > 1)
        {
            if ((value(str.charAt(0)) >= value(str.charAt(1))))
            {
                if (str.length() == 2)
                {
                    total = total + value(str.charAt(0));
                }
                total = total + value(str.charAt(0));
                str = str.substring(1);
            }
            else
            {
                total = total + (value(str.charAt(1)) - value(str.charAt(0)));
                str = str.substring(2);
            }
        }
        return total;
    }

    /**
     * The method yields the numeric value for each of the Roman numeral.
     *
     * @param c character, type of char
     * @return integer
     */
    public static int value(Character c)
    {
        int value = 0;
        if ('M' == c)
        {
            value = 1000;
        }
        if ('D' == c)
        {
            value = 500;
        }
        if ('C' == c)
        {
            value = 100;
        }
        if ('L' == c)
        {
            value = 50;
        }
        if ('X' == c)
        {
            value = 10;
        }
        if ('V' == c)
        {
            value = 5;
        }
        if ('I' == c)
        {
            value = 1;
        }
        return value;
    }
}


