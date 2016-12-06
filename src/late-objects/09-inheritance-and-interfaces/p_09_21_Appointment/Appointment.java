package p_09_21_Appointment;

import java.time.LocalDate;

/**
 * Implement a superclass {@code Appointment} and subclasses {@code Onetime},
 * {@code Daily}, and {@code Monthly}. An appointment has a description (for
 * example, “see the dentist”) and a date. Write a method {@code occursOn
 * (int year, int month, int day)} that checks whether the appointment occurs
 * on that date. For example, for a monthly appointment, you must check whether
 * the day of the month matches. Then fill an array of {@code Appointment}
 * objects with a mixture of appointments. Have the user enter a date and
 * print out all appointments that occur on that date.
 */
public class Appointment
{
    private String description;
    private LocalDate date;

    /**
     * Constructs an Appointment object with description of the appointment
     * and date of the appointment as parameters.
     *
     * @param aDescription the description
     * @param year         the year
     * @param month        the month
     * @param day          the day
     */
    public Appointment(String aDescription, int year, int month, int day)
    {
        description = aDescription;
        date = LocalDate.of(year, month, day);
    }

    /**
     * Gets the year of the appointment date.
     *
     * @return the year
     */
    public int getYear()
    {
        return date.getYear();
    }

    /**
     * Gets the month of the appointment date.
     *
     * @return the month
     */
    public int getMonth()
    {
        return date.getMonthValue();
    }

    /**
     * Gets the day of the month of the appointment date.
     *
     * @return the day of month
     */
    public int getDay()
    {
        return date.getDayOfMonth();
    }

    /**
     * Checks whether the appointment is set for the particular date.
     *
     * @param year  the year of the appointment
     * @param month the month of the appointment
     * @param day   the day of the appointment
     * @return true if the date of the appointment matches the given date
     */
    public boolean occursOn(int year, int month, int day)
    {
        return getYear() == year && getMonth() == month && getDay() == day;
    }

    /**
     * Gets the string representation of this class.
     *
     * @return the string representation of the class
     */
    public String toString()
    {
        return String.format("%-13s%s%n%-13s%s%n", "Appointment:", description,
                "Date:", date);
    }
}
