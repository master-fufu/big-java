package p_09_22_Appointment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * An {@code AppointmentTest} class demo.
 */
public class AppointmentTest
{
    public static void main(String[] args)
    {
        ArrayList<Appointment> appointments = new ArrayList<>();
        appointments = setList(appointments);

        for (Appointment a : appointments)
        {
            System.out.println(a.toString());
        }
    }

    /**
     * Creates the ArrayList of appointments by prompting user to specify
     * the type of appointment, the description, and the date.
     *
     * @param apt the list of appointments, type of ArrayList
     * @return the list of appointments filled with various appointment types
     */
    public static ArrayList<Appointment> setList(ArrayList<Appointment> apt)
    {
        boolean done = false;

        while (!done)
        {
            int appointmentChoice = getNumber("\n1. One time\n2. Monthly"
                    + "\n3. Daily\n0 to quit\nChoose the appointment type: ");
            System.out.println();

            if (appointmentChoice != 0)
            {
                String description =
                        getDescription("Enter appointment description: ");
                int year = getNumber("Enter year: ");
                int month = getNumber("Enter month: ");
                int day = getNumber("Enter day: ");

                if (appointmentChoice == 1)
                {
                    apt.add(new OneTime(description, year, month, day));
                }
                else if (appointmentChoice == 2)
                {
                    apt.add(new Monthly(description, year, month, day));
                }
                else if (appointmentChoice == 3)
                {
                    apt.add(new Daily(description, year, month, day));
                }
                else
                {
                    System.out.println("Choose 1, 2 or 3 to book appointment."
                            + " Try again.");
                }
            }
            else
            {
                done = true;
            }
        }
        return apt;
    }

    /**
     * Prompts user for input and returns the input to the calling method.
     *
     * @param prompt the string
     * @return the string
     */
    public static String getDescription(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextLine();
    }

    /**
     * Prompts user for input and returns the input to the calling method.
     *
     * @param prompt the string
     * @return the integer
     */
    public static int getNumber(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextInt();
    }
}
