package p_04_02d_adjacent_duplicates;

import java.util.Scanner;

/**
 * Write programs that read a sequence of integer inputs and print: a) The
 * smallest and largest of the inputs. b) The number of even and odd inputs.
 * c) Cumulative totals. For example, if the input is 1729, the program should
 * print 1 8 10 19. d) All adjacent duplicates. For example, if the input is
 * 1 3 3 4 5 5 6 6 6 2, the program should print 3 5 6.
 */
public class AdjacentDuplicates
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner("1 3 3 4 5 5 6 6 6 2");

        int input = in.nextInt();

        while (in.hasNextInt())
        {
            int previous = input;
            input = in.nextInt();

            if (input == previous)
            {
                System.out.print(input + " ");

                if (in.hasNextInt())
                {
                    input = in.nextInt();
                }
            }
        }
    }
}
