package p_03_33_calculate_tip;

import java.util.Scanner;

/**
 * Calculating the tip when you go to a restaurant is not difficult, but your restaurant
 * wants to suggest a tip according to the dinner's satisfaction as follows: 1) Ask for
 * the dinner's satisfaction level using these ratings: 1 = Totally satisfied, 2 =
 * Satisfied, 3 = Dissatisfied. 2) if the dinner is totally satisfied, calculate 20
 * percent tip. 3) If the dinner is satisfied, calculate a 15 percent tip. 4) If the
 * dinner is dissatisfied, calculate 10 percent tip. 5) Report the satisfaction level and
 * tip in dollars and cents.
 */
public class CalculateTip
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter bill summary: ");
        double dinnerBill = in.nextDouble();

        double tip = 0;

        System.out.println("1 = Totally satisfied\n2 = Satisfied\n3 = Dissatisfied");
        System.out.print("Rate the dinner: ");
        int rating = in.nextInt();

        if (rating == 1)
        {
            tip = dinnerBill * 1.2 - dinnerBill;
            System.out.printf("Rating: %d%nTip: $%.2f%n", rating, tip);
        }
        else if (rating == 2)
        {
            tip = dinnerBill * 1.15 - dinnerBill;
            System.out.printf("Rating: %d%nTip: $%.2f%n", rating, tip);
        }
        else if (rating == 3)
        {
            tip = dinnerBill * 1.1 - dinnerBill;
            System.out.printf("Rating: %d%nTip: $%.2f%n", rating, tip);
        }
        else
        {
            System.out.println("Error. Rate the dinner from 1 to 3");
        }
    }
}
