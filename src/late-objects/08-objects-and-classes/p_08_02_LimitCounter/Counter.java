package p_08_02_LimitCounter;

/**
 * This class models a tally counter.
 */
public class Counter
{
    private int value;
    private int maximum;

    /**
     * Gets the current value of this counter.
     *
     * @return the current value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Advances the value of this counter by 1.
     */
    public void count()
    {
        if (value + 1 > maximum)
        {
            System.out.println("Limit exceeded.");
        }
        else
        {
            value += 1;
        }
    }

    /**
     * Resets the value of this counter to 0.
     */
    public void reset()
    {
        value = 0;
    }

    /**
     * Undo accidental button click.
     */
    public void undo()
    {
        if (value > 0)
        {
            value -= 1;
        }
    }

    /**
     * Sets the maximum limit.
     *
     * @param maximum max value
     */
    public void setLimit(int maximum)
    {
        this.maximum = maximum;
    }
}
