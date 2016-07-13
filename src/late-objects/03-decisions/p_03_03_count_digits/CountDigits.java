package p_03_03_count_digits;

import java.util.Scanner;

/**
 * Write a program that reads an integer and prints how many digits the number
 * has, by checking whether the number is >=10, >=100, and so on. (Assume that
 * all integers are less than ten billion). If the number is negative, first
 * multiply it with -1.
 */
public class CountDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer less than ten billion: ");

        if (in.hasNextLong())
        {

            long input = in.nextLong();

            if (input < 0)
            {
                input *= -1;
            }
            else if (input >= 10000000000L)
            {
                System.out.println("Integer is greater or equals 10,000,000,000.\nPlease try again.");
            }
            else
            {
                int digits = 1;
                if (input >= 10 && input < 100)
                {
                    digits = 2;
                }
                else if (input >= 100 && input < 1000)
                {
                    digits = 3;
                }
                else if (input >= 1000 && input < 10000)
                {
                    digits = 4;
                }
                else if (input >= 10000 && input < 100000)
                {
                    digits = 5;
                }
                else if (input >= 100000 && input < 1000000)
                {
                    digits = 6;
                }
                else if (input >= 1000000 && input < 10000000)
                {
                    digits = 7;
                }
                else if (input >= 10000000 && input < 100000000)
                {
                    digits = 8;
                }
                else if (input >= 100000000 && input < 1000000000)
                {
                    digits = 9;
                }
                else if (input >= 1000000000 && input < 10000000000L)
                {
                    digits = 10;
                }
                System.out.println("Digits in the number: " + digits);
            }
        }
        else
        {
            System.out.println("Not an integer");
        }
    }
}
