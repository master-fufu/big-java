package p_04_02b_count_even_and_odd;

import java.util.Scanner;

/**
 * Write programs that read a sequence of integer inputs and print: a) The
 * smallest and largest of the inputs. b) The number of even and odd inputs.
 * c) Cumulative totals. For example, if the input is 1729, the program should
 * print 1 8 10 19. d) All adjacent duplicates. For example, if the input is
 * 1 3 3 4 5 5 6 6 6 2, the program should print 3 5 6.
 */
public class CountEvenAndOdd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sequence of numbers: ");
        int countEven = 0;
        int countOdd = 0;

        while (in.hasNextDouble())
        {
            double input = in.nextDouble();
            if (input % 2 == 0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
    }
}
