package p_08_19_portfolio;

/**
 * Implement a class {@code Portfolio}. This class has two objects, checking
 * and savings, of the type BankAccount that was developed in Worked Example 8.1
 * ({@code ch08/worked_example_1/BankAccount.java} in your code files).
 * Implement four methods:
 * <p><ul>
 * <li>{@code public void deposit(double amount, String account)}
 * <li>{@code public void withdraw(double amount, String account)}
 * <li>{@code public void transfer(double amount, String account)}
 * <li>{@code public double getBalance(String account)}
 * </ul><p>
 * Here the account string is {@code "S"} or {@code "C"}. For the deposit
 * or withdrawal, it indicates which account is affected. For a transfer,
 * it indicates the account from which the money is taken; the money is
 * automatically transferred to the other account.
 */
public class Portfolio
{
    private BankAccount checking;
    private BankAccount savings;

    /**
     * Constructs a portfolio with checking and savings
     * accounts initial balance parameters.
     *
     * @param aChecking checking account balance
     * @param aSavings  savings account balance
     */
    public Portfolio(double aChecking, double aSavings)
    {
        checking = new BankAccount(aChecking);
        savings = new BankAccount(aSavings);
    }

    /**
     * Deposit funds to checking or savings account.
     *
     * @param amount  the amount of funds to deposit
     * @param account the account to which the money is deposited
     */
    public void deposit(double amount, String account)
    {
        if (account.equals("S"))
        {
            savings.deposit(amount);
        }
        else if (account.equals("C"))
        {
            checking.deposit(amount);
        }
    }

    /**
     * Withdraw funds from checking or savings account.
     *
     * @param amount  the amount of funds to withdraw
     * @param account the account from which the money is withdrawn
     */
    public void withdraw(double amount, String account)
    {
        if (account.equals("S"))
        {
            savings.withdraw(amount);
        }
        else if (account.equals("C"))
        {
            checking.withdraw(amount);
        }
    }

    /**
     * Transfer money from one account to another.
     *
     * @param amount  the amount of money to transfer
     * @param account the account from which the money is taken
     */
    public void transfer(double amount, String account)
    {
        if (account.equals("S"))
        {
            savings.withdraw(amount);
            checking.deposit(amount);
        }
        else if (account.equals("C"))
        {
            checking.withdraw(amount);
            savings.deposit(amount);
        }
    }

    /**
     * Gets checking or savings account balance.
     *
     * @param account String to choose account
     * @return account balance
     */
    public double getBalance(String account)
    {
        double result = -1;
        if (account.equals("S"))
        {
            result = savings.getBalance();
        }
        else if (account.equals("C"))
        {
            result = checking.getBalance();
        }
        return result;
    }
}
