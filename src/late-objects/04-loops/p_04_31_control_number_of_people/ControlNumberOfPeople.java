package p_04_31_control_number_of_people;

import java.util.Scanner;

/**
 * You need to control the number of people who can be in an oyster bar at the
 * same time. Groups of people can always leave the bar, but a group cannot
 * enter the bar if they would make the number of people in the bar exceed the
 * maximum of 100 occupants. Write a program that reads the sizes of the groups
 * that arrive or depart. Use negative numbers for departures. After each input,
 * display the current number of occupants. As soon as the bar holds the
 * maximum number of people, report that the bar is full and exit the program.
 */
public class ControlNumberOfPeople
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int maxPeople = 100;
        int currentPeople = 0;
        int input;

        while (currentPeople != maxPeople)
        {
            System.out.print("Enter number of people that arrive or depart" +
                    " (use negative numbers for departures): ");

            input = in.nextInt();
            currentPeople += input;

            if (currentPeople < 0)
            {
                System.err.println("Error. Negative number of people in the bar.");
            }
            else if (currentPeople > maxPeople)
            {
                System.err.println("Error. Maximum number of occupants is 100.");
            }
            else
            {
                System.out.printf("Number of people in the bar now is %d%n", currentPeople);
            }
        }
        System.out.print("Bar is full.");
    }
}
