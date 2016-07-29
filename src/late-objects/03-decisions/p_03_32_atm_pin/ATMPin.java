package p_03_32_atm_pin;

import java.util.Scanner;

/**
 * When you use an automated teller machine (ATM) with your bank card, you need to use a
 * personal identification number (PIN) to access your account. If a user fails more than
 * three times when entering the PIN, the machine will block the card. Assume that the
 * user's PIN is "1234" and write a program that asks the user for the PIN no more than
 * three times, and does the following: 1) If the user enters the right number, print a
 * message saying, "Your PIN is correct", and end the program. 2) If the user enters a
 * wrong number, print a message saying, "Your PIN is incorrect" and, if you have asked
 * for the PIN less than three times, ask for it again. 3) If the user enters a wrong
 * number three times, print a message saying "Your bank card is blocked" and end the
 * program.
 */
public class ATMPin
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        final int PIN = 1234;

        System.out.print("Enter the PIN: ");
        int userPIN = in.nextInt();

        // First try
        if (userPIN != PIN)
        {
            System.out.println("Your PIN is incorrect");

            System.out.print("Enter the PIN: ");
            userPIN = in.nextInt();

            // Second try
            if (userPIN != PIN)
            {
                System.out.println("Your PIN is incorrect");

                System.out.print("Enter the PIN: ");
                userPIN = in.nextInt();

                // Third try
                if (userPIN != PIN)
                {
                    System.out.println("Your bank card is blocked");
                }
                else
                {
                    System.out.println("Your PIN is correct");
                }
            }
            else
            {
                System.out.println("Your PIN is correct");
            }
        }
        else
        {
            System.out.println("Your PIN is correct");
        }
    }
}
