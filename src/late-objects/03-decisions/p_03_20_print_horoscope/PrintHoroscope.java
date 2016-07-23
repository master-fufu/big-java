package p_03_20_print_horoscope;

import java.util.Scanner;

/**
 * Write a program that prompts for the day and month of the user's birthday
 * and then prints a horoscope. Make up fortunes for programmers, each
 * fortune should contain the name of the astrological sign.
 */
public class PrintHoroscope
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your birthday month and day: ");
        int m = in.nextInt();
        int d = in.nextInt();

        boolean correctDayValue = !(d > 31 || d <= 0);

        boolean aries = ((m == 3 && d >= 21) || (m == 4 && d <= 19)) && correctDayValue;
        boolean taurus = ((m == 4 && d >= 20) || (m == 5 && d <= 20)) && correctDayValue;
        boolean gemini = ((m == 5 && d >= 21) || (m == 6 && d <= 21)) && correctDayValue;
        boolean cancer = ((m == 6 && d >= 22) || (m == 7 && d <= 22)) && correctDayValue;
        boolean leo = ((m == 7 && d >= 23) || (m == 8 && d <= 22)) && correctDayValue;
        boolean virgo = ((m == 8 && d >= 23) || (m == 9 && d <= 22)) && correctDayValue;
        boolean libra = ((m == 9 && d >= 23) || (m == 10 && d <= 23)) && correctDayValue;
        boolean scorpio = ((m == 10 && d >= 24) || (m == 11 && d <= 21)) && correctDayValue;
        boolean sagittarius = ((m == 11 && d >= 22) || (m == 12 && d <= 21)) && correctDayValue;
        boolean capricorn = ((m == 12 && d >= 22) || (m == 1 && d <= 19)) && correctDayValue;
        boolean aquarius = ((m == 1 && d >= 20) || (m == 2 && d <= 18)) && correctDayValue;
        boolean pisces = ((m == 2 && d >= 19) || (m == 3 && d <= 20)) && correctDayValue;

        if (aries)
        {
            System.out.println("Aries. It'll be another lonely Sunday night over" +
                    " at your Daikatanaholic's Anonymous meeting.");
        }
        else if (taurus)
        {
            System.out.println("Taurus. Scratching out \"Computer Programmer\" " +
                    "on your business card and replacing it with \"Master of" +
                    " the Universe\" does not make it official. Try again.");
        }
        else if (gemini)
        {
            System.out.println("Gemini. You've unknowingly graduated to" +
                    " supergeek after creating a cron-job to e-mail you" +
                    " reminders of the new Farscape episodes.");
        }
        else if (cancer)
        {
            System.out.println("Cancer. While your painstaking research study" +
                    " on traffic patterns fails to earn you a Nobel prize, " +
                    "it does reveal the optimal time to leave for work.");
        }
        else if (leo)
        {
            System.out.println("Leo. You will emerge from the subbasement at " +
                    "your company after a two year long programming binge," +
                    " only to realize they went out of business in October 2001.");
        }
        else if (virgo)
        {
            System.out.println("Virgo. The 120 MB download size was the first" +
                    " clue that something else might be bundled with the " +
                    "simple text editor, but the 300 page license agreement " +
                    "and the 17 hour install time finally convinces you. ");
        }
        else if (libra)
        {
            System.out.println("Libra. Sure it's clever, but your roommate " +
                    "will become very annoyed with the loud beeping sound " +
                    "your computer makes every time it backs up in the middle " +
                    "of the night. ");
        }
        else if (scorpio)
        {
            System.out.println("Scorpio. You'll spend Saturday hung over " +
                    "and searching for a new keyboard after your reckless " +
                    "experimentation with keyboard piercing.");
        }
        else if (sagittarius)
        {
            System.out.println("Sagittarius. This week you will have a " +
                    "three-day trip. Unfortunately, it's a trip to the bathroom.");
        }
        else if (capricorn)
        {
            System.out.println("Capricorn. Even if you think it should be" +
                    " called the Two Towers Preview instead of the Two Towers" +
                    " Trailer, your coworkers don't care. Give up, already.");
        }
        else if (aquarius)
        {
            System.out.println("Aquarius. The stars recommend you discard the" +
                    " idea of writing a musical called \"Hacker!\"");
        }
        else if (pisces)
        {
            System.out.println("Pisces. Your plan to see your buxom cubicle" +
                    " mate nude faces a major setback when your employer " +
                    "denies your request to change the company motto to,\"The" +
                    " only good programmer is a naked programmer.\"");
        }
        else
        {
            System.out.println("Enter correct month and day. Try again.");
        }
    }
}
