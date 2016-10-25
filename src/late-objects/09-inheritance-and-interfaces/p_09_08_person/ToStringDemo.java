package p_09_08_person;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * The demo of {@code toString} method overriding.
 */
public class ToStringDemo
{
    public static void main(String[] args)
    {
        Person[] persons = new Person[3];

        createPersons(persons);

        printPersons(persons);
    }

    /**
     * Prints the array of persons using {@code toString} method.
     *
     * @param persons array of persons, type of Person
     */
    public static void printPersons(Person[] persons)
    {
        for (Person p : persons)
        {
            String person = p.toString();
            System.out.println(person);
        }
    }

    /**
     * Fills the array of Persons.
     *
     * @param persons array of persons, type of Person
     */
    public static void createPersons(Person[] persons)
    {
        for (int i = 0; i < persons.length; i++)
        {
            if (i % 2 == 0)
            {
                makeStudent(persons, i);
            }
            else
            {
                makeInstructor(persons, i);
            }
        }
    }

    /**
     * Prompts user to input information for {@code Instructor} class.
     *
     * @param persons array of persons, type of Person
     * @param i       the number of this class in the array
     */
    public static void makeInstructor(Person[] persons, int i)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter instructor's name: ");
        String name = in.nextLine();
        System.out.print("Enter instructor's birth date: ");
        String date = in.nextLine();
        System.out.print("Enter instructor's salary: ");
        double wage = in.nextDouble();
        persons[i] = new Instructor(name, LocalDate.parse(date), wage);
    }

    /**
     * Prompts user to input information for {@code Student} class.
     *
     * @param persons array of persons, type of Person
     * @param i       the number of this class in the array
     */
    public static void makeStudent(Person[] persons, int i)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = in.nextLine();
        System.out.print("Enter student's birth date: ");
        String date = in.nextLine();
        System.out.print("Enter student's major: ");
        String major = in.nextLine();
        persons[i] = new Student(name, LocalDate.parse(date), major);
    }
}
