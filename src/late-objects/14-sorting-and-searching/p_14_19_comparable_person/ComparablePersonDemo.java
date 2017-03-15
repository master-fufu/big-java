package p_14_19_comparable_person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Supply a class {@code Person} that implements the {@code Comparable}
 * interface. Compare persons by their names. Ask the user to input ten names
 * and generate ten {@code Person} objects. Using the {@code compareTo} method,
 * determine and the first and last person among them and print them.
 */
public class ComparablePersonDemo
{
    public static void main(String[] args)
    {
        ArrayList<Person> persons = new ArrayList<>(10);
        String names = "Clarita Commons\n" +
                "Darcy Dille\n" +
                "Tyrell Thorson\n" +
                "Briana Baumann\n" +
                "Dewayne Danos\n" +
                "Dylan Dillman\n" +
                "Jada Joiner\n" +
                "Mertie Mckamey\n" +
                "Venetta Vanhooser\n" +
                "Peg Posey";

        Scanner in = new Scanner(names);
        while (in.hasNext())
        {
            persons.add(new Person(in.next(), in.next()));
        }

        // Before sorting

        System.out.println("Before sorting:\n");
        for (Person p : persons)
        {
            System.out.printf("%-10s%-10s%d%n" , p.getFirstName(), p.getSecondName (), p.getAge());
        }
        System.out.println();

        // After sorting

        Collections.sort(persons);

        System.out.println("After sorting by first name:\n");
        for (Person p : persons)
        {
            System.out.printf("%-10s%-10s%d%n" , p.getFirstName(), p.getSecondName (), p.getAge());
        }
    }
}
