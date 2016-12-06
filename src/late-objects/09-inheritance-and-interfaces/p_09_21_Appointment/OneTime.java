package p_09_21_Appointment;

/**
 * A {@code OneTime} class to set the appointment that occurs just once.
 */
public class OneTime extends Appointment
{
    /**
     * Constructs an OneTime object with description of the appointment
     * and date of the appointment as parameters.
     *
     * @param aDescription the description
     * @param year         the year
     * @param month        the month
     * @param day          the day
     */
    public OneTime(String aDescription, int year, int month, int day)
    {
        super(aDescription, year, month, day);
    }

    @Override
    public boolean occursOn(int year, int month, int day)
    {
        return super.occursOn(year, month, day);
    }
}
