package p_04_09_print_word_in_reverse;

import java.util.Scanner;

/**
 * Write a program that reads a word and print the word in reverse. For example,
 * if the user provides the input "Harry", the program prints "yrraH".
 */
public class PrintWordInReverse
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = in.next();

        // While loop
        System.out.print("While loop: ");
        int i = input.length() - 1;
        while (i >= 0)
        {
            char ch = input.charAt(i);
            i--;
            System.out.print(ch);
        }
        System.out.println(); // new line

        // For loop
        System.out.print("For loop: ");
        for (int k = input.length() - 1; k >= 0; k--)
        {
            char word = input.charAt(k);
            System.out.printf("%s", word);
        }
    }
}
