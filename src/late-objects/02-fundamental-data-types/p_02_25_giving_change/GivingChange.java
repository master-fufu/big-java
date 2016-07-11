package p_02_25_giving_change;

/**
 * Giving change. Implement a program that directs a cashier how to give change.
 * The program has two inputs: the amount due and the amount received from the
 * customer. Display the dollars, quarters, dimes, nickels, and pennies that
 * the customer should receive in return. In order to avoid roundoff errors,
 * the program user should supply both amounts in pennies, for example 274
 * instead of 2.74.
 */
public class GivingChange
{
    public static void main(String[] args)
    {
        int changeToGive = 52536;
        int dollars = changeToGive / 100; // sets dollars
        int pennies = changeToGive % 100; // sets pennies

        System.out.println("Total change to give: $" + dollars + "." + pennies);

        int hundred = dollars / 100;
        dollars = dollars % 100;
        int fifty = dollars / 50;
        dollars = dollars % 50;
        int twenty = dollars / 20;
        dollars = dollars % 20;
        int ten = dollars / 10;
        dollars = dollars % 10;
        int five = dollars / 5;
        dollars = dollars % 5;
        int two = dollars / 2;
        dollars = dollars % 2;
        int one = dollars / 1;

        int quarters = pennies / 25; // sets quarters
        pennies = pennies % 25; // sets remainder. 4 in this case
        int dimes = pennies / 10; // sets dimes
        pennies = pennies % 10; // remainder for variable pennies is 0
        int nickels = pennies / 5; // sets nickels
        pennies = pennies % 5; // remainder for variable pennies is 0
        int cents = pennies / 1; // sets cents

        System.out.println("Hundreds: " + hundred);
        System.out.println("Fifty: " + fifty);
        System.out.println("Twenty: " + twenty);
        System.out.println("Ten: " + ten);
        System.out.println("Five: " + five);
        System.out.println("Two: " + two);
        System.out.println("One: " + one);

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Cents: " + cents);
    }
}
