package p_08_12_BugMove;

/**
 * Write a class {@code Bug} that models a bug moving along a horizontal line.
 * The bug moves either to the right or left. Initially, the bug moves to the
 * right, but it can turn to change its direction. In each move, its position
 * changes by one unit in the current direction. Provide a constructor
 * <p><pre>
 *      public Bug(int initialPosition)</pre>
 * and methods
 * <p><pre>
 *      public void turn()
 *      public void move()
 *      public int getPosition()</pre>
 * Sample usage:
 * <p><pre>
 *      Bug bugsy = new Bug(10);
 *      bugsy.move(); // Now the position is 11
 *      bugsy.turn();
 *      bugsy.move(); // Now the position is 10</pre>
 * Your {@code main} method should construct a bug, make it move and turn a few
 * times, and print the actual and expected positions.
 */
public class Bug
{
    private int position;
    private int turn;

    /**
     * Constructs a bug object with initial position parameter.
     *
     * @param initialPosition initial position
     */
    public Bug(int initialPosition)
    {
        position = initialPosition;
        turn = 1;
    }

    /**
     * Moves a bug along the horizontal line. If {@code turn} value equals one,
     * bug moves from the left to the right and if {@code turn} value equals
     * minus one it moves from the right to the left.
     */
    public void move()
    {
        if (turn == 1)
        {
            position++;
        }
        else
        {
            position--;
        }
    }

    /**
     * Turns a bug to the opposite direction.
     */
    public void turn()
    {
        turn = turn * -1;
    }

    /**
     * Gets the current position of the bug.
     *
     * @return position value
     */
    public int getPosition()
    {
        return position;
    }
}
