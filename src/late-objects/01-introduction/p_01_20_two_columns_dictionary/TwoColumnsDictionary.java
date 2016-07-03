package p_01_20_two_columns_dictionary;

/**
 * Write a program that prints a two-column list with the greeting phrases.
 * In the first column, print the phrase in English, in the second column,
 * print the phrase in a language of your choice.
 */
public class TwoColumnsDictionary
{

    public static void main(String[] args)
    {
        String en1 = "Good morning";
        String de1 = "Gutten morgen";
        String en2 = "It is a pleasure to meet you";
        String de2 = "Es ein Vergnügen, Sie zu treffen";
        String en3 = "Please, call me tomorrow";
        String de3 = "Bitte rufen Sie mich morgen";
        String en4 = "Have a nice day!";
        String de4 = "Haben Sie einen schönen Tag!";

        System.out.printf("%-40s %1s %-40s %n", "English Version", "|",
                          "German Translation");
        System.out.printf("%-40s %1s %-40s %n",
                          "----------------------------------------", "|",
                          "----------------------------------------");
        System.out.printf("%-40s %1s %-40s %n", en1, "|", de1);
        System.out.printf("%-40s %1s %-40s %n", en2, "|", de2);
        System.out.printf("%-40s %1s %-40s %n", en3, "|", de3);
        System.out.printf("%-40s %1s %-40s %n", en4, "|", de4);
    }
}
