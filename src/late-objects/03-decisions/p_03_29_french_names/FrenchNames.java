package p_03_29_french_names;

import java.util.Scanner;

/**
 * French country file are feminine when they end with the letter e, masculine
 * otherwise, except for the following which are masculine even thought they end
 * with e: le Belize, le Cambodge, le Mexique, le Mozabique, le Zaire, le
 * Zimbabwe. Write a program that reads the French name of a country and adds
 * the article: 'le' for masculine or 'la' for feminine, such as le Canada or la
 * Belgique. However, if the country name starts with a vowel, use l'; for
 * example, l'Afganinstan. For the following plural country file, use les: les
 * Etats-Unis, les Pays-Bas.
 */
public class FrenchNames
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a country name: ");
        String input = in.next();

        boolean masculine = input.endsWith("a") || input.equals("belize")
                || input.equals("cambodge") || input.equals("mexique")
                || input.equals("mozambique") || input.equals("zaire")
                || input.equals("zimbabwe");

        boolean vowel = input.substring(0, 1).equals("a")
                || input.substring(0, 1).equals("e") || input.substring(0, 1).equals("i")
                || input.substring(0, 1).equals("o") || input.substring(0, 1).equals("u");

        boolean plural = input.equalsIgnoreCase("pays-bas")
                || input.equalsIgnoreCase("etats-unis");

        if (vowel)
        {
            input = "l'" + input.substring(0, 1).toUpperCase() + input.substring(1);
        }
        else if (plural)
        {
            input = "les " + input.substring(0, 1).toUpperCase() + input.substring(1);
        }
        else if (masculine)
        {
            input = "le " + input.substring(0, 1).toUpperCase() + input.substring(1);
        }
        else
        {
            input = "la " + input.substring(0, 1).toUpperCase() + input.substring(1);
        }
        System.out.println(input);
    }
}
