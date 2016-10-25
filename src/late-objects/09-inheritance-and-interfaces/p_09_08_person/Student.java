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
public class Student extends Person
{
    private String major;

    /**
     * Creates a Student object with name,
     * date of birth and major as parameters
     *
     * @param name   the name
     * @param date   the date of birth
     * @param aMajor the student's major
     */
    public Student(String name, LocalDate date, String aMajor)
    {
        super(name, date);
        major = aMajor;
    }

    /**
     * @return the state of {@code Student} class
     */
    public String toString()
    {
        return super.toString() + "Student[major=" + major + "]";
    }
}
