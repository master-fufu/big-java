package p_08_20_CountryAreapopulation;

/**
 * Design and implement a class {@code Country} that stores the name of the
 * country, its population, and its area. Then write a program that reads in
 * a set of countries and prints
 * <p><ul>
 * <li>{@code The country with the largest area}.
 * <li>{@code The country with the largest population}.
 * <li>{@code The country with the largest population density
 * (people per square kilometer (or mile))}.
 * </ul>
 */
public class Country
{
    private String countryName;
    private int population;
    private int area;

    /**
     * Constructs a country object with country name, population,
     * and area parameters.
     *
     * @param aCountryName the country name
     * @param aPopulation  the population number
     * @param anArea       the area of the country
     */
    public Country(String aCountryName, int aPopulation, int anArea)
    {
        countryName = aCountryName;
        population = aPopulation;
        area = anArea;
    }

    /**
     * Gets the area of the country.
     *
     * @return the area, type of double
     */
    public int getArea()
    {
        return area;
    }

    /**
     * Gets the population number.
     *
     * @return the population of the country
     */
    public int getPopulation()
    {
        return population;
    }

    /**
     * Gets the country name.
     *
     * @return the country name
     */
    public String getCountryName()
    {
        return countryName;
    }

    /**
     * Gets population density (people per square kilometer).
     *
     * @return the population density
     */
    public double getPopulationDensity()
    {
        return population / area;
    }
}
