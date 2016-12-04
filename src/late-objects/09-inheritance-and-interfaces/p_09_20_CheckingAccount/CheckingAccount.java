package p_09_20_CheckingAccount;

/**
 * Change the {@code CheckingAccount} class in How To 9.1 so that a $1 fee is
 * levied for deposits or withdrawals in excess of three free monthly
 * transactions. Place the code for computing the fee into a separate
 * method that you call from the {@code deposit} and {@code withdraw} methods.
 */
public class CheckingAccount extends BankAccount
{
    private int withdrawals;
    private int deposits;

    /**
     * Constructs a checking account with a zero balance.
     */
    public CheckingAccount()
    {
        withdrawals = 0;
        deposits = 0;
    }

    public void withdraw(double amount)
    {
        super.withdraw(amount);
        withdrawals++;
        fee(withdrawals);
    }

    public void deposit(double amount)
    {
        super.deposit(amount);
        deposits++;
        fee(deposits);
    }

    private void fee(int transactionType)
    {
        final int FREE_TRANSACTIONS = 3;
        final int TRANSACTION_FEE = 1;
        if (transactionType > FREE_TRANSACTIONS)
        {
            super.withdraw(TRANSACTION_FEE);
        }
    }

    public void monthEnd()
    {
        withdrawals = 0;
        deposits = 0;
    }
}

