package p_02_17_calculate_hours_and_minutes;

import java.util.Scanner;

/**
 * Write a program that reads two times in military format (0900, 1730) and
 * prints the number of hours and minutes between the two times. Here is a
 * sample run. User input is in color.
 * <p><pre>
 *      Please enter the first time: 0900
 *      Please enter the second time: 1730
 *      8 hours 30 minutes</pre>
 * Extra credit if you can deal with the case where the first time
 * is later than the second:
 * <p><pre>
 *      Please enter the first time: 1730
 *      Please enter the second time: 0900
 *      15 hours 30 minutes</pre>
 */
public class CalculateHoursAndMinutes
{
    public static void main(String[] args)
    {
        final int MINUTES_IN_HOUR = 60;
        final int MINUTES_IN_DAY = 24 * 60;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first time: ");
        int firstTime = in.nextInt();

        int firstTimeInMinutes = firstTime / 100 * MINUTES_IN_HOUR + firstTime % 100;
        System.out.println("firstTimeInMinutes: " + firstTimeInMinutes);

        System.out.print("Please enter the second time: ");
        int secondTime = in.nextInt();

        int secondTimeInMinutes = secondTime / 100 * MINUTES_IN_HOUR + secondTime % 100;
        System.out.println("secondTimeInMinutes: " + secondTimeInMinutes);

        int minutes = secondTimeInMinutes - firstTimeInMinutes;
        System.out.println("int minutes: " + minutes);

        minutes = (MINUTES_IN_DAY + minutes) % MINUTES_IN_DAY;
        System.out.println(minutes);
        int hours = minutes / 60;
        minutes = minutes % 60;

        System.out.printf("%d hours %d minutes\n", hours, minutes);
    }
}
