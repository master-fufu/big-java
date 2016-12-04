package p_09_18_Formattable;

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;

/**
 * The {@code System.out.printf} method has predefined formats for printing
 * integers, floating-point numbers, and other data types. But it is also
 * extensible. If you use the {@code S} format, you can print any class that
 * implements the {@code Formattable} interface. That interface has a
 * single method:
 * <p><pre>
 *      void formatTo(Formatter formatter, int flags, int width, int precision)
 * </pre>
 * In this exercise, you should make the {@code BankAccount} class implement
 * the {@code Formattable} interface. Ignore the flags and precision and simply
 * format the bank balance, using the given width. In order to achieve this
 * task, you need to get an {@code Appendable} reference like this:
 * <p><pre>
 *      Appendable a = formatter.out();</pre>
 * {@code Appendable} is another interface with a method
 * <p><pre>
 *      void append(CharSequence sequence)</pre>
 * {@code CharSequence} is yet another interface that is implemented by (among
 * others) the {@code String} class. Construct a string by first converting
 * the bank balance into a string and then padding it with spaces so that it
 * has the desired width. Pass that string to the {@code append} method.
 */
public class BankAccount implements Formattable
{
    private double balance;

    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount()
    {
        balance = 0;
    }

    /**
     * Constructs a bank account with a given balance.
     *
     * @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    /**
     * Gets the current balance of the bank account.
     *
     * @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }

    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision)
    {
        String balance = balanceToString();
        Appendable a = formatter.out();

        while (width > balance.length())
        {
            balance = " " + balance;
        }

        try
        {
            a.append(balance);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Converts this balance value to the string.
     *
     * @return the balance, type of String
     */
    public String balanceToString()
    {
        return Double.toString(balance);
    }
}
