package p_09_17_Filter;

/**
 * Declares {@code Filter} interface.
 */
public interface Filter
{
    /**
     * Accepts the object if its length is strictly less than 5.
     *
     * @param x the object to compare its length
     * @return true if object's length is less than 5
     */
    boolean accept(Object x);
}
