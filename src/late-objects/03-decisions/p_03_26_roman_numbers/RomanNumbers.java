package p_03_26_roman_numbers;

import java.util.Scanner;

/**
 * Write a program that converts a positive integer into the Roman number
 * system. The Roman number system has digits. I = 1, V = 5, X = 10, L = 50,
 * C = 100, D = 500, M = 1000. Numbers are formed according to the following
 * rules: a) Only numbers up to 3999 are represented. b) As in the decimal
 * system, the thousands, hundreds, tens, and ones are expressed separately.
 * c) The numbers 1 to 9 expressed as I = 1, II = 2, III = 3, IV = 4, V = 5,
 * VI = 6, VII = 7, VIII = 8, IX = 9. As you can see, an I preceding a V or X
 * is subtracted from the value, and you can never have more than three I's
 * in a row. d) Tens and hundreds are done the same way, except that the
 * letters X, L, C and C, D, M are used instead of I, V, X, respectively.
 */
public class RomanNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter positive number (<= 3,999): ");
        int number = in.nextInt();

        int thousands = number / 1000;
        int hundreds = number / 100 % 10;
        int tens = number / 10 % 10;
        int ones = number % 10;

        // Initialize roman letters
        String m = "";
        String cm = "";
        String d = "";
        String cd = "";
        String c = "";
        String xc = "";
        String l = "";
        String xl = "";
        String x = "";
        String ix = "";
        String v = "";
        String iv = "";
        String i = "";

        if (thousands != 0)
        {
            if (thousands == 1)
            {
                m = "M";
            }
            else if (thousands == 2)
            {
                m = "MM";
            }
            else if (thousands == 3)
            {
                m = "MMM";
            }
        }

        if (hundreds != 0)
        {
            if (hundreds == 1)
            {
                c = "C";
            }
            else if (hundreds == 2)
            {
                c = "CC";
            }
            else if (hundreds == 3)
            {
                c = "CCC";
            }
            else if (hundreds == 4)
            {
                cd = "CD";
            }
            else if (hundreds == 5)
            {
                d = "D";
            }
            else if (hundreds == 6)
            {
                d = "DC";
            }
            else if (hundreds == 7)
            {
                d = "DCC";
            }
            else if (hundreds == 8)
            {
                d = "DCCC";
            }
            else if (hundreds == 9)
            {
                cm = "CM";
            }
        }

        if (tens != 0)
        {
            if (tens == 1)
            {
                x = "X";
            }
            else if (tens == 2)
            {
                x = "XX";
            }
            else if (tens == 3)
            {
                x = "XXX";
            }
            else if (tens == 4)
            {
                xl = "XL";
            }
            else if (tens == 5)
            {
                l = "L";
            }
            else if (tens == 6)
            {
                l = "LX";
            }
            else if (tens == 7)
            {
                l = "LXX";
            }
            else if (tens == 8)
            {
                l = "LXXX";
            }
            else if (tens == 9)
            {
                xc = "XC";
            }
        }

        if (ones != 0)
        {
            if (ones == 1)
            {
                i = "I";
            }
            else if (ones == 2)
            {
                i = "II";
            }
            else if (ones == 3)
            {
                i = "III";
            }
            else if (ones == 4)
            {
                iv = "IV";
            }
            else if (ones == 5)
            {
                v = "V";
            }
            else if (ones == 6)
            {
                v = "VI";
            }
            else if (ones == 7)
            {
                v = "VII";
            }
            else if (ones == 8)
            {
                v = "VIII";
            }
            else if (ones == 9)
            {
                ix = "IX";
            }
        }
        String roman_numeral = m + cm + d + cd + c + xc + l + xl + x + ix + v + iv + i;
        System.out.println(roman_numeral);
    }
}
