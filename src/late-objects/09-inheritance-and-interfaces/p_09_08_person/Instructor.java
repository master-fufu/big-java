package p_09_08_person;

import java.time.LocalDate;

/**
 * Implement a superclass {@code Person}. Make two classes, {@code Student} and
 * {@code Instructor}, that inherit from {@code Person}. A person has a name
 * and a year of birth. A student has a major, and an instructor has a salary.
 * Write the class declarations, the constructors, and the methods
 * {@code toString} for all classes. Supply a test program that tests these
 * classes and methods.
 */
public class Instructor extends Person
{
    private double salary;

    /**
     * Constructs an Instructor object with name,
     * date of birth, salary as parameters
     *
     * @param name    the name
     * @param date    the date of birth
     * @param aSalary the salary
     */
    public Instructor(String name, LocalDate date, double aSalary)
    {
        super(name, date);
        salary = aSalary;
    }

    /**
     * @return the state of {@code Instructor} class
     */
    public String toString()
    {
        return super.toString() + "Instructor[salary=" + salary + "]";
    }
}
