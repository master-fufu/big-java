package p_14_05_telephone_lookup_program;

/**
 * An item in a phone book.
 */
public class Item
{
    private String key;
    private String value;

    /**
     * Constructs an {@code Item} object.
     *
     * @param k the key string
     * @param v the value string
     */
    public Item(String k, String v)
    {
        key = k;
        value = v;
    }

    /**
     * Gets the key.
     *
     * @return the key
     */
    public String getKey()
    {
        return key;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public String getValue()
    {
        return value;
    }
}
