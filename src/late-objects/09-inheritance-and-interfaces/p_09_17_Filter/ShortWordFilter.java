package p_09_17_Filter;

/**
 * This class returns the string with length < 5.
 */
public class ShortWordFilter implements Filter
{
    @Override
    public boolean accept(Object x)
    {
        return x.toString().length() < 5;
    }
}
