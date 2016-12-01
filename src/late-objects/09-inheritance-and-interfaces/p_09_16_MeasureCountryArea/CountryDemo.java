package p_09_16_MeasureCountryArea;

/**
 * Measurable interface demo.
 */
public class CountryDemo
{
    public static void main(String[] args)
    {
        Measurable[] countries = new Measurable[4];
        countries[0] = new Country("USA", 9_826_630);
        countries[1] = new Country("Russia", 17_098_242);
        countries[2] = new Country("China", 9_596_960);
        countries[3] = new Country("USSR", 22_402_200);

        System.out.println(maximum(countries));
    }

    /**
     * Determines the country with the largest area.
     *
     * @param objects measurable countries
     * @return the country with the largest area, type of Measurable
     */
    public static Measurable maximum(Measurable[] objects)
    {
        if (objects.length == 0)
        {
            return null;
        }
        Measurable largest = objects[0];
        for (Measurable object : objects)
        {
            if (object.measure() > largest.measure())
            {
                largest = object;
            }
        }
        return largest;
    }
}
