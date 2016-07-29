package p_03_30_bank_transaction;

import java.util.Scanner;

/**
 * Write a program to simulate a bank transaction. There are two bank accounts:
 * checking and savings. First, ask for the initial balances of the bank
 * accounts; reject negative balances. Then ask for the transactions; options
 * are checking and savings. Then ask for the amount; reject transactions that
 * overdraw an account. At the end, print the balances of both accounts.
 */
public class BankTransaction
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter initial CHECKING account balance: ");
        final double checkingInitial = in.nextDouble();
        System.out.print("Enter initial SAVINGS account balance: ");
        final double savingsInitial = in.nextDouble();

        // check if initial balance equals or greater than zero
        boolean positiveBalance = checkingInitial >= 0 && savingsInitial >= 0;

        // choose transactions, if initial balance is positive (opt. 1, 2 or 3)
        int transactionsChoice;

        // if transactionChoice is 1, deposit funds to the one of the accounts
        double deposit;

        // if transactionChoice is 2, withdraw funds from the one of the accounts
        double withdrawal;

        // if transactionChoice is 3, transfer funds from one account to another
        double transfer;

        // choose the account to operate on: CHECKING or SAVINGS (1 or 2)
        int accountChoice;

        // Choice 1, checking account to add, withdraw or transfer funds
        double checkingAccount = checkingInitial;

        // Choice 2, savings account to add, withdraw or transfer funds
        double savingsAccount = savingsInitial;

        // Check if balance is not negative
        if (!positiveBalance)
        {
            System.out.println("Error. Negative initial balance.");
        }
        else
        {
            System.out.print("1 - Deposit\n2 - Withdrawal\n3 - Transfer\nChoose from the transactions: ");
            transactionsChoice = in.nextInt();
            System.out.print("1 - Checking account\n2 - Savings account\nSelect the account: ");
            accountChoice = in.nextInt();

            boolean depositCheckingAccount = transactionsChoice == 1 && accountChoice == 1;
            boolean depositSavingsAccount = transactionsChoice == 1 && accountChoice == 2;
            boolean withdrawCheckingAcc = transactionsChoice == 2 && accountChoice == 1;
            boolean withdrawSavingsAcc = transactionsChoice == 2 && accountChoice == 2;
            boolean transferFromCheckingAcc = transactionsChoice == 3 && accountChoice == 1;
            boolean transferFromSavingsAcc = transactionsChoice == 3 && accountChoice == 2;

            // Deposit block
            if (depositCheckingAccount)
            {
                System.out.print("Enter the amount you wish to deposit: £");
                deposit = in.nextDouble();
                checkingAccount = checkingInitial + deposit;
                savingsAccount = savingsInitial;
            }
            else if (depositSavingsAccount)
            {
                System.out.print("Enter the amount you wish to deposit: £");
                deposit = in.nextDouble();
                checkingAccount = checkingInitial;
                savingsAccount = savingsInitial + deposit;

                // Withdraw block
            }
            else if (withdrawCheckingAcc)
            {
                System.out.print("Enter the amount you wish to withdraw: £");
                withdrawal = in.nextDouble();
                checkingAccount = checkingInitial - withdrawal;
                savingsAccount = savingsInitial;
                if (checkingAccount < 0)
                {
                    System.out.println("Withdraw error. Checking account cannot be overdrawn.");
                }
            }
            else if (withdrawSavingsAcc)
            {
                System.out.print("Enter the amount you wish to withdraw: £");
                withdrawal = in.nextDouble();
                checkingAccount = checkingInitial;
                savingsAccount = savingsInitial - withdrawal;
                if (savingsAccount < 0)
                {
                    System.out.println("Withdraw error. Savings account cannot be overdrawn.");
                }

                // Transfer block
            }
            else if (transferFromCheckingAcc)
            {
                System.out.print("Enter the amount you wish to transfer from checking acc: £");
                transfer = in.nextDouble();
                checkingAccount = checkingInitial - transfer;
                savingsAccount = savingsInitial + transfer;
                if (checkingAccount < 0)
                {
                    System.out.println("Transfer error. Checking account cannot be overdrawn.");
                }
            }
            else if (transferFromSavingsAcc)
            {
                System.out.print("Enter the amount you wish to transfer from savings acc: £");
                transfer = in.nextDouble();
                savingsAccount = savingsInitial - transfer;
                checkingAccount = checkingInitial + transfer;
                if (savingsAccount < 0)
                {
                    System.out.println("Transfer error. Checking account cannot be overdrawn.");
                }
            }
            else
            {
                System.out.println("Error. Choose transaction and account.");
            }

            // Print final balance if it is not negative and corresponds to one of the transactions
            if (!(savingsAccount < 0 || checkingAccount < 0) && (depositCheckingAccount
                    || depositSavingsAccount || withdrawCheckingAcc || withdrawSavingsAcc
                    || transferFromCheckingAcc || transferFromSavingsAcc))
            {
                System.out.printf("Checking account: £%.2f\n", checkingAccount);
                System.out.printf("Savings account: £%.2f\n", savingsAccount);
            }
        }
    }
}
