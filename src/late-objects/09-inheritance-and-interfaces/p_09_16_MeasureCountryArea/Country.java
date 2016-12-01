package p_09_16_MeasureCountryArea;

/**
 * Write a method
 * <p><pre>
 *      public static Measurable maximum(Measurable[] objects)</pre>
 * that returns the object with the largest measure. Use that method to
 * determine the country with the largest area from an array of countries.
 */
public class Country implements Measurable
{
    private String name;
    private int area;

    /**
     * Constructs a country object with name and area as parameters.
     *
     * @param aName  the name of the country
     * @param anArea the area in square kilometers
     */
    public Country(String aName, int anArea)
    {
        name = aName;
        area = anArea;
    }

    /**
     * Gets the name of the country.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the area of the country.
     *
     * @return the area
     */
    public int getArea()
    {
        return area;
    }

    /**
     * Gets the string representation of the class.
     *
     * @return string representation of the class
     */
    public String toString()
    {
        return getClass().getName() + "[name=" + name + ",area=" + area + "]";
    }

    public int measure()
    {
        return getArea();
    }
}
