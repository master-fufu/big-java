package p_01_04_balance_in_three_years;

/**
 * Write a program that prints the balance of an account after the first,
 * second and third year. The account has an initial balance of $1,000 and
 * earns 5 percent of interest each year.
 */
public class BalanceAfterThreeYears
{
    public static void main(String[] args)
    {
        int year = 1000;
        System.out
                .println(year + (year * 0.05) + (year * 0.05) + (year * 0.05));
    }
}
