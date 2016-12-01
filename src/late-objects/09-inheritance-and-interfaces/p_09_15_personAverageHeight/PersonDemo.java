package p_09_15_personAverageHeight;

/**
 * {@code Person} class and {@code Measurable} interface demo.
 * <p>
 * A person has a name and a height in centimeters. Use the {@code average}
 * method in Section 9.6 to process a collection of {@code Person} objects.
 */
public class PersonDemo
{
    public static void main(String[] args)
    {
        Person[] persons = new Person[3];
        persons[0] = new Person("Carl Cracker", 180);
        persons[1] = new Person("Harry Hacker", 160);
        persons[2] = new Person("Tony Tester", 185);

        System.out.println("Average height of the given persons: " + Measurable.averageHeight(persons) + "cm");
    }
}
