package p_02_14_number_with_comma;

import javax.swing.*;

/**
 * Write a program that reads a number between 1,000 and 999,999 from the user
 * and prints it with a comma separating the thousands. Here is a sample dialog;
 * the user input is in color:
 * <p><pre>
 *      Please enter an integer between 1000 and 999999: 23456
 *      23,456</pre>
 */
public class NumberWithComma
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Please enter an integer between 1000 and 999999: ");

        int inputLength = input.length();

        String beforeComma = input.substring(0, inputLength - 3);
        String afterComma = input.substring(inputLength - 3);

        System.out.println(beforeComma + "," + afterComma);
    }
}
