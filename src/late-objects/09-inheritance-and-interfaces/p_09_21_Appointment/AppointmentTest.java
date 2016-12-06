package p_09_21_Appointment;

/**
 * An {@code AppointmentTest} class demo.
 */
public class AppointmentTest
{
    public static void main(String[] args)
    {
        Appointment[] appointments = new Appointment[5];

        appointments[0] = new OneTime("Visit to dentist", 2018, 3, 22);
        appointments[1] = new Monthly("Visit to barber", 2015, 5, 9);
        appointments[2] = new Daily("Visit to psychoanalyst", 2018, 3, 22);
        appointments[3] = new Monthly("Visit to shop", 2018, 3, 22);
        appointments[4] = new OneTime("Visit to drug store", 2020, 8, 30);

        int year = 2018;
        int month = 3;
        int day = 22;

        System.out.println("Appointments on " + year + "-" + month + "-" + day);
        System.out.println();
        for (Appointment a : appointments)
        {
            if (a.occursOn(year, month, day))
            {
                System.out.println(a.toString());
            }
        }
    }
}
