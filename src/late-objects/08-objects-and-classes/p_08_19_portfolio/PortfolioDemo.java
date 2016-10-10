package p_08_19_portfolio;

/**
 * {@code Portfolio} class demo.
 */
public class PortfolioDemo
{
    public static void main(String[] args)
    {
        double checking = 100;
        double savings = 50;

        Portfolio portfolio1 = new Portfolio(checking, savings);

        portfolio1.deposit(100, "C");
        portfolio1.withdraw(300, "C");
        portfolio1.transfer(20, "S");

        System.out.println("Savings: " + portfolio1.getBalance("S"));
        System.out.println("Checking: " + portfolio1.getBalance("C"));
    }
}
