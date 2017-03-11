package p_14_02_sort_coins_by_value;

/**
 * A coin with monetary value.
 */
public class Coin
{
    private double value;
    private String name;

    /**
     * Constructs a coin.
     *
     * @param aValue the monetary value of the coin
     * @param aName  the name of the coin
     */
    public Coin(double aValue, String aName)
    {
        value = aValue;
        name = aName;
    }

    /**
     * Gets the coin value.
     *
     * @return the value
     */
    public double getValue()
    {
        return value;
    }

    /**
     * Gets the coin name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return name and value of coin
     */
    public String toString()
    {
        return "Coin[value=" + value + ",name=" + name + "]";
    }
}
