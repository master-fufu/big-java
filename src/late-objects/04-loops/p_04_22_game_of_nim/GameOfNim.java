package p_04_22_game_of_nim;

import java.util.Scanner;

/**
 * <em>The game of Nim</em>. This is a well-known game with a number of
 * variants. The following variant has an interesting winning strategy.
 * Two players alternately take marbles from a pile. In each move, a player
 * chooses how many marbles to take. The player must take at least one but
 * at most half of the marbles. Then the other player takes a turn.
 * The player who take the last marble loses.
 * <p>
 * Write a program in which the computer plays against a human opponent.
 * Generate a random integer between 10 and 100 to denote the initial size
 * of the pile. Generate a random integer between 0 and 1 to decide whether
 * the computer or the human takes the first run. Generate a random integer
 * between 0 and 1 to decide whether the computer plays <em>smart</em> or
 * <em>stupid</em>. In stupid mode the computer simply takes a random legal
 * value (between 1 and n/2) from the pile whenever it has a turn. In smart
 * mode the computer takes off enough marbles to make the size of the pile a
 * power of two minus 1 - that is 3, 7, 15, 31, or 63. That is always a legal
 * move, except when the size of the pile is currently one less than a power
 * of two. In that case, the computer makes a random legal move.
 * <p>
 * You will note that the computer cannot be beaten in smart mode when it has
 * the first move, unless the pile size happens to be 15, 31, or 63. Of course,
 * a human player who has the first turn and knows the winning strategy can
 * win against the computer.
 */
public class GameOfNim
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int pileSize = (int) (Math.random() * 91 + 10); // 10-100
        int theRun = (int) (Math.random() * 2); // 0-1
        int smartOrStupid = (int) (Math.random() * 2); // 0-1

        while (pileSize > 0)
        {
            System.out.println("Current number of marbles to take: " + pileSize);
            int marbles = 0;

            if (theRun == 0)
            {
                System.out.println("Computer takes run...");

                if ((smartOrStupid == 1) || (pileSize == 63 || pileSize == 31
                        || pileSize == 15 || pileSize == 7 || pileSize == 3
                        || pileSize == 1))
                {
                    marbles = (int) (Math.random() * (pileSize / 2) + 1);
                }
                else
                {
                    if (pileSize > 63)
                    {
                        marbles = pileSize - 63;
                    }
                    else if (pileSize > 31)
                    {
                        marbles = pileSize - 31;
                    }
                    else if (pileSize > 15)
                    {
                        marbles = pileSize - 15;
                    }
                    else if (pileSize > 7)
                    {
                        marbles = pileSize - 7;
                    }
                    else if (pileSize > 3)
                    {
                        marbles = pileSize - 3;
                    }
                    else
                    {
                        marbles = pileSize - 1;
                    }
                }
                System.out.println("Computer removes " + marbles);
                theRun = 1;
            }
            else
            {
                System.out.println("Human takes run...");

                System.out.print("Enter number of marbles to take: ");
                marbles = in.nextInt();
                while ((marbles <= 0 || marbles > (pileSize / 2))
                        && marbles != 1)
                {
                    System.out.print("Number must be between 1 and"
                            + " half size of the pile. Try again: ");
                    marbles = in.nextInt();
                }
                theRun = 0;
            }
            pileSize -= marbles;
        }

        if (theRun == 0)
        {
            System.out.println("Computer wins!");
        }
        else
        {
            System.out.println("Human wins!");
        }
    }
}
