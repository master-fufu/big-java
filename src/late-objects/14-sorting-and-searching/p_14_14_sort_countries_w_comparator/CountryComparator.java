package p_14_14_sort_countries_w_comparator;

import java.util.Comparator;

/**
 * A {@code CountryComparator} class to sort countries in decreasing order.
 */
public class CountryComparator implements Comparator<Country>
{
    /**
     * Compares countries by an area size.
     *
     * @param a some country
     * @param b another country
     * @return the area difference
     */
    public int compare(Country a, Country b)
    {
        return b.getArea() - a.getArea();
    }
}
