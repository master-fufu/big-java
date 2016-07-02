package p_01_18_two_columns_list;

/**
 * Write a program that prints a two-column list of your friends' birthdays.
 * In the first column, print the file of your best friends; in the second
 * column, print their birthdays.
 */
public class TwoColumnsList
{
    public static void main(String[] args)
    {
        String name1 = "Joseph";
        String date1 = "December 18, 1878";
        String name2 = "Winston";
        String date2 = "November 30, 1874";

        System.out.format("%-10s%20s", "Name", "Birth Date" + "\n");
        System.out.format("%-10s%27s", "----------", "-----------------" + "\n");
        System.out.format("%-10s%27s", name1, date1 + "\n");
        System.out.format("%-10s%27s", name2, date2 + "\n");
    }
}
