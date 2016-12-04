package p_09_19_Formattable;

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.round;

/**
 * Enhance the {@code formatTo} method of Exercise P9.18 by taking
 * into account the precision.
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
    public void formatTo(Formatter formatter,
            int flags,
            int width,
            int precision)
    {
        Appendable a = formatter.out();

        double rounded = round(this.balance * pow(10, precision))
                / pow(10, precision);

        String balanceString = balanceToString(rounded);

        Scanner getDigits = new Scanner(balanceString);
        getDigits.useDelimiter("\\.");
        String integerPart = getDigits.next();
        String fractionalPart = getDigits.next();
        getDigits.close();

        if (precision == 0)
        {
            balanceString = integerPart;
        }
        else
        {
            int extraZeros = fractionalPart.length();
            while (extraZeros < precision)
            {
                balanceString = balanceString + "0";
                extraZeros++;
            }
        }

        while (width > balanceString.length())
        {
            balanceString = " " + balanceString;
        }

        try
        {
            a.append(balanceString);
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
    public String balanceToString(double aBalance)
    {
        return Double.toString(aBalance);
    }
}
