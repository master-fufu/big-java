package p_02_16_integer_into_sequence;

import java.util.Scanner;

/**
 * Write a program that reads in an integer and breaks it into a sequence of
 * individual digits. For example, the input 16384 is displayed as
 * <p><pre>
 *      1 6 3 8 4</pre>
 * You may assume that the input has no more than five digits and is not negative.
 */
public class IntegerIntoSequence
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input five non-negative digits: ");
        int input = in.nextInt();

        int d1 = input / 10000 % 10;
        int d2 = input / 1000 % 10;
        int d3 = input / 100 % 10;
        int d4 = input / 10 % 10;
        int d5 = input % 10;
        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);

        // Alternative
        String digits = "12345";
        String i1 = digits.substring(0, 1);
        String i2 = digits.substring(1, 2);
        String i3 = digits.substring(2, 3);
        String i4 = digits.substring(3, 4);
        String i5 = digits.substring(4);
        String gap = " ";

        System.out.println(i1 + gap + i2 + gap + i3 + gap + i4 + gap + i5);
    }
}
