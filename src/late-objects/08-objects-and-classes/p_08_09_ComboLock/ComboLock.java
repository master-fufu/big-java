package p_08_09_ComboLock;

import java.util.Scanner;

/**
 * Declare a class {@code ComboLock} that works like the combination lock in a
 * gym locker, as shown here. The lock is constructed with a combination &#8211;
 * three numbers between 0 and 39. The reset method resets the dial so that it
 * points to 0. The {@code turnLeft} and {@code turnRight} methods turn the dial
 * by a given number of ticks to the left or right. The {@code open} method
 * attempts to open the lock. The lock opens if the user first turned it right
 * to the first number in the combination, then left to the second, and then
 * right to the third.
 * <p><pre>
 *      public class ComboLock
 *      {
 *          . . .
 *          public ComboLock(int secret1, int secret2, int secret3) { . . . }
 *          public void reset() { . . . }
 *          public void turnLeft(int ticks) { . . . }
 *          public void turnRight(int ticks) { . . . }
 *          public boolean open() { . . . }
 *      }</pre>
 */
public class ComboLock
{
    private static final int TOTAL_DISC_NUMBERS = 40;
    private int dial;
    private Scanner in;
    private int secret1;
    private int secret2;
    private int secret3;

    /**
     * Constructs a lock object with a certain combination
     * of numbers between 0 and 39.
     *
     * @param secret1 first combination number
     * @param secret2 second combination number
     * @param secret3 third combination number
     */
    public ComboLock(int secret1, int secret2, int secret3)
    {
        dial = 0;
        in = new Scanner(System.in);
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }

    /**
     * Turns dial to the left by a given number of ticks.
     *
     * @param ticks number of ticks
     */
    public void turnLeft(int ticks)
    {
        if (dial - ticks >= 0)
        {
            dial -= ticks;
        }
        else
        {
            dial = TOTAL_DISC_NUMBERS - ticks + dial;
        }
    }

    /**
     * Turns dial to the right by a given number of ticks.
     *
     * @param ticks number of ticks
     */
    public void turnRight(int ticks)
    {
        if (dial + ticks < TOTAL_DISC_NUMBERS)
        {
            dial += ticks;
        }
        else
        {
            dial = (dial + ticks) % TOTAL_DISC_NUMBERS;
        }
    }

    /**
     * Resets dial to zero.
     */
    public void reset()
    {
        dial = 0;
    }

    /**
     * Attempts to open the lock.
     *
     * @return true if lock successfully opened
     */
    public boolean open()
    {
        boolean secret1 = false;
        boolean secret2 = false;
        boolean secret3 = false;

        turnRight(getInput("Turn dial right: "));

        if (dial == this.secret1)
        {
            secret1 = true;
        }

        turnLeft(getInput("Turn dial left: "));

        if (dial == this.secret2)
        {
            secret2 = true;
        }

        turnRight(getInput("Turn dial right again: "));

        if (dial == this.secret3)
        {
            secret3 = true;
        }

        return secret1 && secret2 && secret3;
    }

    /**
     * Prompts user for input. Repeats until a valid input is supplied.
     *
     * @param prompt String
     * @return the number that the user supplied
     */
    public int getInput(String prompt)
    {
        int input;
        do
        {
            System.out.print(prompt);
            input = in.nextInt();

            if (input < 1 || input > 40)
            {
                System.out.print("Input value must be between 1 and 40. ");
            }
        }
        while (input < 1 || input > 40);
        return input;
    }
}
