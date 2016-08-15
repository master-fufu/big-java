package p_04_32_credit_card_number_check;

import java.util.Scanner;

/**
 * <em>Credit Card Number Check</em>. The last digit of a credit card number is
 * the check digit, which protects against transcrption errors such as an error
 * in a single digit or switching two digits. The following method is used to
 * verify actual credit card numbers but, for simplicity, wi will describe it
 * for numbers with 8 digits instead of 16:
 * <p><ul>
 * <li>Starting from the rightmost digit, form the sum of every other digit.
 * For example, if the credit card number is 4358 9795, then you form the sum
 * 5 + 7 + 8 + 3
 * <li>Double each of the digits that were not included in the preceding step.
 * Add all digits of the resulting numbers. For example, with the number given
 * above, doubling the digits, starting with the next-to-last one, yields 18 18
 * 10 8. Adding all digits in these values yields 1 + 8 + 1 + 8 + 1 + 0 + 8 = 27.
 * <li>Add the sums of the two preceding steps. If the last digit of the result
 * is 0, the number is valid. In our case, 23 + 27 = 50, so the number is valid.</ul>
 * <p>
 * Write a program that implements this algorithm. The user should supply an
 * 8-digit number, and you should print out whether the number is valid or not.
 * If it is not valid, you should print the value of the check digit that would
 * make it valid.
 */
public class CreditCardNumberCheck
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 8-digit number: ");
        int cc = in.nextInt(); // valid number 43589795

        int rightmost_sum = 0;
        int leftmost_digit;
        int leftmost_sum = 0;
        int count = 0;
        int cc_checksum;

        if (cc < 100000000)
        {
            while (cc > 0)
            {
                int single_digit = cc % 10;
                count++;

                if (count % 2 != 0)
                {
                    rightmost_sum = rightmost_sum + single_digit;
                }
                else
                {
                    leftmost_digit = (single_digit * 2) % 10;

                    if (single_digit >= 5)
                    {
                        leftmost_digit += 1;
                    }
                    leftmost_sum += leftmost_digit;
                }
                cc /= 10;
            }

            cc_checksum = leftmost_sum + rightmost_sum;

            if (cc_checksum % 10 == 0)
            {
                cc_checksum = cc_checksum % 10;
                System.out.printf("The last digit of CC checksum is %d. The card is valid.", cc_checksum);
            }
            else
            {
                cc_checksum = cc_checksum % 10;
                System.out.printf("CC is not valid. The check digit value is %d", cc_checksum);
            }
        }
        else
        {
            System.out.print("Error. Enter number strictly less than 100,000,000");
        }
    }
}
