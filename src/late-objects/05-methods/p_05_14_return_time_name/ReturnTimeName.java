package p_05_14_return_time_name;

import java.util.Scanner;

/**
 * Write a method {@code String getTimeName(int hours, int minutes)} that
 * returns the English name for a point in time, such as {@code "ten minutes past
 * two"}, {@code "half past three"}, {@code "a quarter to four"}, or {@code "five
 * o'clock"}. Assume that hours is between 1 and 12.
 */
public class ReturnTimeName
{
    public static void main(String[] args)
    {
        int hour = readIntBetween(1, 12);
        int minute = readIntBetween(0, 59);

        System.out.printf("%s", printTime(hour, minute));
    }

    /**
     * The method passes integer to printHours() and printMinutes() methods,
     * concatenates the strings returned by these methods and prints the
     * correct time. To remove the leading space from the final string, the
     * final result is returned through the removeLeadingSpace() method.
     *
     * @param h int hours
     * @param m int minutes
     * @return removeLeadingSpace(String)
     */
    public static String printTime(int h, int m)
    {
        String past = " past ";
        String to = " to ";
        String time = printMinutes(m) + past + printHours(h);

        if (m > 30)
        {
            if (h == 12)
            {
                time = printMinutes(60 - m) + to + printHours(1);
            }
            else
            {
                time = printMinutes(60 - m) + to + printHours(h + 1);
            }
        }
        if (m == 45)
        {
            if (h == 12)
            {
                time = "quarter" + to + printHours(1);
            }
            else
            {
                time = "quarter" + to + printHours(h + 1);
            }
        }
        if (m == 30)
        {
            time = "half" + past + printHours(h);
        }
        if (m == 15)
        {
            time = "quarter" + past + printHours(h);
        }
        if (m == 0)
        {
            time = printHours(h) + " o'clock";
        }
        return removeLeadingSpace(time); // remove leading space
    }

    /**
     * The method checks if the string has leading space and returns
     * modified string without leading space. Otherwise it returns string
     * without modification.
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
     * The method converts int hours into String name
     *
     * @param h int 1 to 12
     * @return String
     */
    public static String printHours(int h)
    {
        String hour;
        if (h < 10)
        {
            hour = digitName(h);
        }
        else
        {
            hour = teenName(h);
        }
        return hour;
    }

    /**
     * The method converts int minutes into String name
     *
     * @param m int 0 to 59
     * @return String
     */
    public static String printMinutes(int m)
    {
        int input = m;
        String minutes = "";

        if (input >= 20)
        {
            minutes = minutes + " " + tensName(m);
            input = input % 10;
        }
        else if (input >= 10)
        {
            minutes = minutes + " " + teenName(input);
            input = 0;
        }

        if (input > 0)
        {
            minutes = minutes + " " + digitName(input);
        }
        return minutes;
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
     * Gives the name of the tens part of a number between 20 and 59.
     *
     * @param number an integer between 20 and 59
     * @return the name of the tens part of the number ("twenty" ... "fifty")
     */
    public static String tensName(int number)
    {
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

    /**
     * The method reads input from user. Can be used to input
     * either hours or minutes.
     *
     * @param x int
     * @param y int
     * @return integer
     */
    public static int readIntBetween(int x, int y)
    {
        Scanner in = new Scanner(System.in);
        int input;
        do
        {
            System.out.print("Enter a value between " + x + " and " + y + ": ");
            input = in.nextInt();
        } while (input < x || input > y);
        return input;
    }
}
