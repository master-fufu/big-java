package p_04_30_ticket_seller;

import java.util.Scanner;

/**
 * Write an application to pre-sell a limited number of cinema tickets. Each
 * buyer can buy as many as 4 tickets. No more than 100 tickets can be sold.
 * Implement a program called TicketSeller that prompts the user for the desired
 * number of tickets and then displays the number of remaining tickets. Repeat
 * until all tickets have been sold, and then display the total number of buyers.
 */
public class TicketSeller
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int tickets_remaining = 100;
        int tickets_to_buy;
        int buyers = 0;

        while (tickets_remaining > 0)
        {
            System.out.print("Enter number of tickets you want to buy: ");
            tickets_to_buy = in.nextInt();

            if (tickets_to_buy >= 1 && tickets_to_buy <= 4)
            {
                if (tickets_to_buy > tickets_remaining)
                {
                    System.out.printf("Only %d ticket%s left!%n",
                            tickets_remaining, (tickets_remaining > 1 ? "s" : ""));
                }
                else
                {
                    tickets_remaining = tickets_remaining - tickets_to_buy;
                    buyers++;
                    System.out.printf("Number of buyers: %d%nTickets left: %d%n",
                            buyers, tickets_remaining);
                }
            }
            else if (tickets_to_buy == 0)
            {
                break;
            }
            else
            {
                System.out.println("1 to 4 tickets per buyer.");
            }
        }
    }
}
