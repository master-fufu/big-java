package p_14_19_comparable_person;

import java.util.Random;

/**
 * Supply a class {@code Person} that implements the {@code Comparable}
 * interface. Compare persons by their names. Ask the user to input ten names
 * and generate ten {@code Person} objects. Using the {@code compareTo} method,
 * determine and the first and last person among them and print them.
 */
public class Person implements Comparable<Person>
{
    private String firstName;
    private String secondName;
    private int age;

    public Person(String firstName, String secondName)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        age = new Random().nextInt(33) + 18;
    }

    /**
     * @return the first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @return the second name
     */
    public String getSecondName()
    {
        return secondName;
    }

    /**
     * @return the age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Compares two persons based on their first name. If the first names are
     * the same, use the last name.
     *
     * @param other another person to compare with this person
     * @return the difference, type of int
     */
    @Override
    public int compareTo(Person other)
    {
        int diff = this.firstName.compareTo(other.firstName);
        if (diff == 0)
        {
            diff = this.secondName.compareTo(other.secondName);
        }
        return diff;
    }
}
