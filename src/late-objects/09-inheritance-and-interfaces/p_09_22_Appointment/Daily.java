package p_09_22_Appointment;

/**
 * A {@code Daily} class to set daily appointment.
 */
public class Daily extends Appointment
{
    private boolean daily;

    /**
     * Constructs an Daily object with description of the appointment
     * and date of the appointment as parameters.
     *
     * @param aDescription the description
     * @param year         the year
     * @param month        the month
     * @param day          the day
     */
    public Daily(String aDescription, int year, int month, int day)
    {
        super(aDescription, year, month, day);
        daily = true;
    }

    @Override
    public boolean occursOn(int year, int month, int day)
    {
        return daily;
    }
}
