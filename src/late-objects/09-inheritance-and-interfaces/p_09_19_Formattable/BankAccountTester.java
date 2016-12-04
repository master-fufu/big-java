package p_09_19_Formattable;

/**
 * A {@code BankAccountTester} class and {@code Formattable} interface demo.
 */
public class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAccount account1 = new BankAccount(1000.34367);
        BankAccount account2 = new BankAccount(55.83147);
        BankAccount account3 = new BankAccount(345);
        BankAccount account4 = new BankAccount(99000.10924);

        System.out.print("Current:  ");
        System.out.printf("|%10.2s|%10.2s|%10.2s|%10.2s|%n", account1, account2, account3, account4);

        System.out.print("Expected: ");
        System.out.println("|   1000.34|     55.83|    345.00|  99000.10|");
    }
}
