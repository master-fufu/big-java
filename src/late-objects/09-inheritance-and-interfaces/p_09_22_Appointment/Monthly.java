package p_09_22_Appointment;

/**
 * A {@code Monthly} class to set monthly appointment.
 */
public class Monthly extends Appointment
{
    /**
     * Constructs a Monthly object with description of the appointment
     * and date of the appointment as parameters.
     *
     * @param aDescription the description
     * @param year         the year
     * @param month        the month
     * @param day          the day
     */
    public Monthly(String aDescription, int year, int month, int day)
    {
        super(aDescription, year, month, day);
    }

    @Override
    public boolean occursOn(int year, int month, int day)
    {
        return super.getDay() == day;
    }
}
