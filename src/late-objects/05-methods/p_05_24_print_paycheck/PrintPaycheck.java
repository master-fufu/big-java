package p_05_24_print_paycheck;

import java.util.Scanner;

/**
 * Write a program that prints a paycheck. Ask the program user for the name
 * of the employee, the hourly rate, and the number of hours worked. If the
 * number of hours exceeds 40, the employee is paid "time and a half", that is,
 * 150 percent of the hourly rate on the hours exceeding 40. Your check should
 * look similar to that in the figure below. Use fictitious file for the payer
 * and the bank. Be sure to use stepwise refinement and break your solution
 * into several methods. Use the intName method to print the dollar amount
 * of the check.
 */
public class PrintPaycheck
{
    public static void main(String[] args)
    {
        // input employee name
        String empName = employeeName("Enter employee name: ");

        // input hourly rate and hours worked to return employee salary from salary method
        double salary = salary("Enter hourly rate: ", "Enter hours worked: ");

        // extract cents from the salary
        int cents = cents(salary);

        // extract dollars from the salary
        int dollars = dollars(salary);

        // converts salary into text (max 999.99)
        String dollarsToText = intName(dollars) + " and " + cents(salary) + " CENTS";

        // prints the payslip
        box(salary, dollarsToText, empName);
    }

    /**
     * The method box take arguments from other methods and prints the pay check
     *
     * @param n          amount of dollars and cents, type of double
     * @param amountText amount of dollars only printed in text, type of String
     * @param name       type of String, name of the employee
     */
    public static void box(double n, String amountText, String name)
    {
        // top line
        System.out.printf("%s", "+");
        for (int i = 0; i < 48; i++)
        {
            if (i == 14 || i == 28)
            {
                System.out.printf("%s", "+");
            }
            System.out.printf("%s", "-");
        }
        System.out.printf("%s%n", "+");
        System.out.printf("|%-14s|%-14s|%-20s|%n", " Company:", " Bank:", " Check number: ");
        System.out.printf("|%-14s|%-14s|%-20s|%n", " WILEY", " Public Bank", " 063331");

        // separator
        System.out.printf("%s", "+");
        for (int i = 0; i < 47; i++)
        {
            if (i == 14 || i == 19 || i == 27)
            {
                System.out.printf("%s", "+");
            }
            System.out.printf("%s", "-");
        }
        System.out.printf("%s%n", "+");
        System.out.printf("|%20s|%29s|%n", " ", " ");
        System.out.printf("|%-20s|%-10s%-19.2f|%n", " Date: 08.10.15", " Amount: $", n); // date and amount
        System.out.printf("|%20s|%29s|%n", " ", " ");

        // separator
        System.out.printf("%s", "+");
        for (int i = 0; i < 49; i++)
        {
            if (i == 20)
            {
                System.out.printf("%s", "+");
            }
            System.out.printf("%s", "-");
        }
        System.out.printf("%s%n", "+");
        System.out.printf("|%50s|%n", " ");
        System.out.printf("| %-49s|%n", amountText);
        System.out.printf("|%50s|%n", " ");
        System.out.printf("|%-50s|%n", " TO THE ORDER OF: " + name);
        System.out.printf("|%50s|%n", " ");

        // bottom line
        System.out.printf("%s", "+");
        for (int i = 0; i < 50; i++)
        {
            System.out.printf("%s", "-");
        }
        System.out.printf("%s%n", "+");
    }

    /**
     * Turns a number into its English name.
     *
     * @param number a positive integer < 1,000
     * @return the name of the number (e.g. "two hundred seventy four")
     */
    public static String intName(int number)
    {
        int part = number; // The part that still needs to be converted
        String name = ""; // The name of the number

        if (part >= 100)
        {
            name = digitName(part / 100) + " HUNDRED";
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
        if (digit == 1)
        {
            return "ONE";
        }
        if (digit == 2)
        {
            return "TWO";
        }
        if (digit == 3)
        {
            return "THREE";
        }
        if (digit == 4)
        {
            return "FOUR";
        }
        if (digit == 5)
        {
            return "FIVE";
        }
        if (digit == 6)
        {
            return "SIX";
        }
        if (digit == 7)
        {
            return "SEVEN";
        }
        if (digit == 8)
        {
            return "EIGHT";
        }
        if (digit == 9)
        {
            return "NINE";
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
            return "TEN";
        }
        if (number == 11)
        {
            return "ELEVEN";
        }
        if (number == 12)
        {
            return "TWELVE";
        }
        if (number == 13)
        {
            return "THIRTEEN";
        }
        if (number == 14)
        {
            return "FOURTEEN";
        }
        if (number == 15)
        {
            return "FIFTEEN";
        }
        if (number == 16)
        {
            return "SIXTEEN";
        }
        if (number == 17)
        {
            return "SEVENTEEN";
        }
        if (number == 18)
        {
            return "EIGHTEEN";
        }
        if (number == 19)
        {
            return "NINETEEN";
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
            return "NINETY";
        }
        if (number >= 80)
        {
            return "EIGHTY";
        }
        if (number >= 70)
        {
            return "SEVENTY";
        }
        if (number >= 60)
        {
            return "SIXTY";
        }
        if (number >= 50)
        {
            return "FIFTY";
        }
        if (number >= 40)
        {
            return "FORTY";
        }
        if (number >= 30)
        {
            return "THIRTY";
        }
        if (number >= 20)
        {
            return "TWENTY";
        }
        return "";
    }

    /**
     * The method returns integer part (dollars) of workers salary.
     *
     * @param n the number of dollars
     * @return dollars type of int
     */
    public static int dollars(double n)
    {
        return (int) n;
    }

    /**
     * The method returns fractional part (cents) of
     * workers salary as an integer.
     *
     * @param n the number of cents
     * @return cents, type of int
     */
    public static int cents(double n)
    {
        return (int) (n * 100) % 100;
    }

    /**
     * Computes employee salary based on hourly rate and hours worked,if the
     * number of hours exceeds 40 hourly rate increases 1,5 times on exceeding
     * hours. The method salary prompts for a double, which is input from the
     * key board and returned to the calling method.
     *
     * @param rate  String
     * @param hours String
     * @return double
     */
    public static double salary(String rate, String hours)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(rate);
        double hourlyRate = in.nextDouble();
        System.out.print(hours);
        double hoursWorked = in.nextDouble();

        if (hoursWorked > 40)
        {
            return ((hourlyRate * 1.5) * (hoursWorked - 40) + (hourlyRate * hoursWorked));
        }
        return hourlyRate * hoursWorked;
    }

    /**
     * The method employeeName prompts for the name of employee and
     * return it to the calling method.
     *
     * @param prompt the prompt string
     * @return the name of the employee
     */
    public static String employeeName(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextLine();
    }
}
