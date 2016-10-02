package p_08_04_AddressClassWithTwoConstructors;

import java.util.Scanner;

/**
 * {@code Address} class demo.
 * <p>
 * Implement a class {@code Address}. An address has a house number, a
 * street, an optional apartment number, a city, a state, and a postal code.
 * Supply two constructors: one with an apartment number and one without.
 * Supply a print method that prints the address with the street on one line
 * and the city, state, and zip code on the next line. Supply a method
 * {@code public boolean comesBefore(Address other)} that tests whether this
 * address comes before another when the addresses are compared by postal code.
 */
public class AddressDemo
{
    public static void main(String[] args)
    {
        System.out.println("Address with apartment");
        Address address1 = new Address(
                input("Street: "),
                inputNumber("Apartment: "),
                input("City: "),
                input("Post code: ")
        );

        System.out.println("Address without apartment");
        Address address2 = new Address(
                input("House number: "),
                input("Street: "),
                input("City: "),
                input("Post code: ")
        );

        System.out.println(address1.printAddressWithApartment());
        System.out.println(address2.printAddressWithoutApartment());
        System.out.println();

        System.out.println(
                "Does post code " + address1.getPostalCode() + " come before "
                        + address2.getPostalCode() + "? "
                        + address1.comesBefore(address2)
        );
    }

    /**
     * Prompts user for input and returns it to the calling method.
     *
     * @param prompt String
     * @return user input, type of int
     */
    public static int inputNumber(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextInt();
    }

    /**
     * Prompts user for input and returns it to the calling method.
     *
     * @param prompt String
     * @return user input, type of String
     */
    public static String input(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextLine();
    }
}
