package p_01_19_three_columns_list;

/**
 * In the US there is no federal sales tax, so every state may impose its own
 * sales taxes. Look on the Internet for the sales tax charged in five US
 * states, then write a program that prints the tax rate for five states
 * of your choice.
 */
public class ThreeColumnsList
{
    public static void main(String[] args)
    {
        System.out.printf("%-23s %16s %29s %n", "State/Territory/District",
                "Base Sales Tax", "Total with Max Local Surtax");

        System.out.printf("%-23s %16s %29s %n", "------------------------",
                "--------------", "---------------------------");

        System.out.printf("%-23s %16s %29s %n", "Alabama", 4 + "%", 11 + "%");

        System.out.printf("%-23s %16s %29s %n", "Alaska", 0 + "%", 7 + "%");

        System.out.printf("%-23s %16s %29s %n", "Arizona", 5.6 + "%", 10.725 + "%");

        System.out.printf("%-23s %16s %29s %n", "Arkansas", 6.5 + "%", 12 + "%");
    }
}
