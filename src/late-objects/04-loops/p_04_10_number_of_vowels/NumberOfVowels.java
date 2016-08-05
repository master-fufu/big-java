package p_04_10_number_of_vowels;

import java.util.Scanner;

/**
 * Write a program that reads a word and prints the number of vowels in the
 * word. For this exercise, assume that 'a e i o u y' are vowels. For example,
 * if the user provides the input 'Harry', the program prints '2 vowels'.
 */
public class NumberOfVowels
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String input = in.next().toLowerCase();

        char vowels;
        int count_vowels = 0;

        for (int i = 0; i < input.length(); i++)
        {
            vowels = input.charAt(i);

            if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o'
                    || vowels == 'u' || vowels == 'y')
            {
                count_vowels++;
            }
        }
        System.out.printf("%d vowels", count_vowels);
    }
}
