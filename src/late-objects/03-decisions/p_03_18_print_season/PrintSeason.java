package p_03_18_print_season;

import java.util.Scanner;
/**
 * Write a program that prompts the user for a month and day and then prints the season,
 * as determined by this algorithm.
 */
public class PrintSeason
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter month and day: ");
        int m = in.nextInt();
        int d = in.nextInt();

        String season = "";

        if (m == 1 || m == 2 || m == 3)
        {
            season = "Winter";
        }
        else if (m == 4 || m == 5 || m == 6)
        {
            season = "Spring";
        }
        else if (m == 7 || m == 8 || m == 9)
        {
            season = "Summer";
        }
        else if (m == 10 || m == 11 || m == 12)
        {
            season = "Fall";
        }
        else
        {
            System.out.println("Enter month from 1 to 12. Try again");
        }

        if (m % 3 == 0 && d >= 21)
        {
            switch (season)
            {
                case "Winter":
                    season = "Spring";
                    break;
                case "Spring":
                    season = "Summer";
                    break;
                case "Summer":
                    season = "Fall";
                    break;
                default:
                    season = "Winter";
                    break;
            }
        }
        System.out.println("Season = " + season);
    }
}
