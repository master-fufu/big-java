package p_04_02a_smallest_and_largest;

import java.util.Scanner;

/**
 * Write programs that read a sequence of integer inputs and print: a) The
 * smallest and largest of the inputs. b) The number of even and odd inputs.
 * c) Cumulative totals. For example, if the input is 1729, the program should
 * print 1 8 10 19. d) All adjacent duplicates. For example, if the input is
 * 1 3 3 4 5 5 6 6 6 2, the program should print 3 5 6.
 */
public class SmallestAndLargest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sequence of integers: ");

        double input = in.nextDouble();
        double largest = input;
        double smallest = input;

        while (in.hasNextDouble())
        {
            input = in.nextDouble();
            if (input < smallest)
            {
                smallest = input;
            }
            if (input > largest)
            {
                largest = input;
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
