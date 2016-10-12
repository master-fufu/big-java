package p_08_20_CountryAreapopulation;

/**
 * {@code Country} class demo.
 */
public class CountryDemo
{
    public static void main(String[] args)
    {
        Country[] countries = {
                new Country("USA", 316_000_000, 9_160_000),
                new Country("Russia", 142_500_000, 16_380_000),
                new Country("India", 1_220_000_000, 2_970_000),
                new Country("China", 1_350_000_000, 9_330_000)
        };

        int area = countries[0].getArea();
        String nameArea = countries[0].getCountryName();

        int population = countries[0].getPopulation();
        String namePopulation = countries[0].getCountryName();

        double density = countries[0].getPopulationDensity();
        String nameDensity = countries[0].getCountryName();

        for (Country country : countries)
        {
            if (area < country.getArea())
            {
                area = country.getArea();
                nameArea = country.getCountryName();
            }

            if (population < country.getPopulation())
            {
                population = country.getPopulation();
                namePopulation = country.getCountryName();
            }

            if (density < country.getPopulationDensity())
            {
                density = country.getPopulationDensity();
                nameDensity = country.getCountryName();
            }
        }

        String maxArea =
                String.format("Max area (sq. km): %s %,d", nameArea, area);

        String maxPop =
                String.format("Max population: %s %,d", namePopulation,
                        population);

        String maxDensity =
                String.format("Max density: %s %,.2f", nameDensity, density);

        System.out.println(maxArea);
        System.out.println(maxPop);
        System.out.println(maxDensity);
    }
}
