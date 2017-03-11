package p_14_14_sort_countries_w_comparator;

/**
 * {@code Country} class.
 */
public class Country
{
    private String name;
    private int population;
    private int area;

    /**
     * Constructs a country object.
     *
     * @param name       the name of the country
     * @param population the population
     * @param area       the area (square kilometers)
     */
    public Country(String name, int population, int area)
    {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    /**
     * @return the name of the country
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return the population of the country
     */
    public int getPopulation()
    {
        return population;
    }

    /**
     * @return the area of the country in sq.km
     */
    public int getArea()
    {
        return area;
    }

    public String toString()
    {
        return "Country[name=" + name + ",population=" + population + "," + "area=" + area + "]";
    }
}
