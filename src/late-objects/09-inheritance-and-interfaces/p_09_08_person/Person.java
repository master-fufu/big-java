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
public class Person
{
    private String name;
    private LocalDate dateOfBirth;

    /**
     * Constructs a Person object with name and date of birth as parameters.
     *
     * @param aName the name
     * @param date  the date of birth
     */
    public Person(String aName, LocalDate date)
    {
        name = aName;
        dateOfBirth = date;
    }

    /**
     * @return the state of {@code Person} class
     */
    public String toString()
    {
        return "Person[name=" + name + ", date of birth=" + dateOfBirth + "]";
    }
}
