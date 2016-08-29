package p_05_13_enhance_intname_method;

import java.util.Scanner;

/**
 * For some values (for example, 20), the {@code intName} method returns a string
 * with a leading space (" twenty"). Repair that blemish and ensure that spaces
 * are inserted only when necessary. Hint: There are two ways of accomplishing
 * this. Either ensure that leading spaces are never inserted, or remove leading
 * spaces from the result before returning them.
 */
public class EnhanceIntnameMethod
{
    public static void main(String[] args)
    {
        int input = readInt("Please enter positive or negative integer < 1,000,000,000: ");
        System.out.print(removeLeadingSpace(negativeOrPositive(input)));
    }

    /**
     * The method prompts user for input and returns an integer
     * to the calling method
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

    /**
     * The method checks if the string has leading space and
     * returns modified string without leading space. Otherwise
     * it returns string without modification.
     *
     * @param str string
     * @return string
     */
    public static String removeLeadingSpace(String str)
    {
        String result;
        if (" ".equals(str.substring(0, 1)))
        {
            result = str.substring(1);
        }
        else
        {
            result = str;
        }
        return result;
    }

    /**
     * The method converts integer to positive if n < 0, passes n value
     * to the {@code intName} method and returns it with string "minus".
     * If an integer > 0, the method passes {@code n} to the {@code intName}
     * method and returns it.
     *
     * @param n integer
     * @return String
     */
    public static String negativeOrPositive(int n)
    {
        if (n < 0)
        {
            n = n * (-1);
            return "minus" + intName(n);
        }
        else
        {
            return intName(n);
        }
    }

    /**
     * Turns a number into its English name.
     *
     * @param number a positive integer < 1,000,000,000
     * @return the name of the number (e.g. "two hundred seventy four")
     */
    public static String intName(int number)
    {
        int part = number; // The part that still needs to be converted
        String name = ""; // The name of the number

        if (part == 0) // this if block deals with zero input
        {
            name = digitName(part);
        }

        if (part >= 100000000)
        {
            if (part / 1000000 % 100 == 0)
            {
                name = name + " " + digitName(part / 100000000) + " hundred million";
                part = part % 100000000;
            }
            else
            {
                name = name + " " + digitName(part / 100000000) + " hundred";
                part = part % 100000000;
            }
        }

        if (part >= 20000000)
        {
            if (part / 1000000 % 10 == 0)
            {
                name = name + " " + tensName(part / 1000000) + " million";
                part = part % 1000000;
            }
            else
            {
                name = name + " " + tensName(part / 1000000) + " " + digitName(part / 1000000 % 10) + " million";
                part = part % 1000000;
            }
        }
        else if (part >= 10000000)
        {
            name = name + " " + teenName(part / 1000000) + " million";
            part = part % 1000000;
        }

        if (part >= 1000000) // one million
        {
            name = name + " " + digitName(part / 1000000) + " million";
            part = part % 1000000;
        }

        if (part >= 100000) // one hundred thousand
        {
            if (part / 1000 % 100 == 0)
            {
                name = name + " " + digitName(part / 100000) + " hundred thousand";
                part = part % 100000;
            }
            else
            {
                name = name + " " + digitName(part / 100000) + " hundred";
                part = part % 100000;
            }
        }

        if (part >= 20000)
        {
            if (part / 1000 % 10 == 0)
            {
                name = name + " " + tensName(part / 1000) + " thousand";
                part = part % 1000;
            }
            else
            {
                name = name + " " + tensName(part / 1000) + " " + digitName(part / 1000 % 10) + " thousand";
                part = part % 1000;
            }
        }
        else if (part >= 10000)
        {
            name = name + " " + teenName(part / 1000) + " thousand";
            part = part % 1000;
        }

        if (part >= 1000)
        {
            name = name + " " + digitName(part / 1000) + " thousand";
            part = part % 1000;
        }

        if (part >= 100)
        {
            name = name + " " + digitName(part / 100) + " hundred";
            part = part % 100;
        }

        if (part >= 20)
        {
            name = name + " " + tensName(part);
            part = part % 10;
        }
        else if (part >= 10)
        {
            name = name + " " + teenName(part);
            part = 0;
        }

        if (part > 0)
        {
            name = name + " " + digitName(part);
        }
        return name;
    }

    /**
     * Turns a digit into its English name.
     *
     * @param digit an integer between 1 and 9
     * @return the name of digit ("one" ... "nine")
     */
    public static String digitName(int digit)
    {
        if (digit == 0)
        {
            return "zero";
        }
        if (digit == 1)
        {
            return "one";
        }
        if (digit == 2)
        {
            return "two";
        }
        if (digit == 3)
        {
            return "three";
        }
        if (digit == 4)
        {
            return "four";
        }
        if (digit == 5)
        {
            return "five";
        }
        if (digit == 6)
        {
            return "six";
        }
        if (digit == 7)
        {
            return "seven";
        }
        if (digit == 8)
        {
            return "eight";
        }
        if (digit == 9)
        {
            return "nine";
        }
        return "";
    }

    /**
     * Turns a number between 10 and 19 into its English name.
     *
     * @param number an integer between 10 and 19
     * @return the name of the given number ("ten" ... "nineteen")
     */
    public static String teenName(int number)
    {
        if (number == 10)
        {
            return "ten";
        }
        if (number == 11)
        {
            return "eleven";
        }
        if (number == 12)
        {
            return "twelve";
        }
        if (number == 13)
        {
            return "thirteen";
        }
        if (number == 14)
        {
            return "fourteen";
        }
        if (number == 15)
        {
            return "fifteen";
        }
        if (number == 16)
        {
            return "sixteen";
        }
        if (number == 17)
        {
            return "seventeen";
        }
        if (number == 18)
        {
            return "eighteen";
        }
        if (number == 19)
        {
            return "nineteen";
        }
        return "";
    }

    /**
     * Gives the name of the tens part of a number between 20 and 99.
     *
     * @param number an integer between 20 and 99
     * @return the name of the tens part of the number ("twenty" ... "ninety")
     */
    public static String tensName(int number)
    {
        if (number >= 90)
        {
            return "ninety";
        }
        if (number >= 80)
        {
            return "eighty";
        }
        if (number >= 70)
        {
            return "seventy";
        }
        if (number >= 60)
        {
            return "sixty";
        }
        if (number >= 50)
        {
            return "fifty";
        }
        if (number >= 40)
        {
            return "forty";
        }
        if (number >= 30)
        {
            return "thirty";
        }
        if (number >= 20)
        {
            return "twenty";
        }
        return "";
    }
}
