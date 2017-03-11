package p_14_14_sort_countries_w_comparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a program that sorts an {@code ArrayList&lt;Country&gt;} in decreasing
 * order so that the most largest country is at the beginning of the array.
 * Use a {@code Comparator}.
 */
public class CountrySorterDemo
{
    public static void main(String[] args)
    {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("Canada", 35_181_704, 9_984_670));
        countries.add(new Country("China", 1_367_485_388, 9_596_960));
        countries.add(new Country("Russia", 142_423_733, 17_075_200));
        countries.add(new Country("United States", 321_368_864, 9_826_630));
        countries.add(new Country("India", 1_251_695_584, 3_287_590));

        // Before sorting

        System.out.println("Before sorting:\n");
        System.out.printf("%-20s%-15s%-18s%n", "Country", "Area", "Population");
        for (Country c : countries)
        {
            System.out.printf("%-20s%,-15d", c.getName(), c.getArea());
            System.out.printf("%,-15d%n", c.getPopulation());
        }
        System.out.println();

        // After sorting

        Collections.sort(countries,
                (first, second) -> second.getArea() - first.getArea());

        System.out.println("Sorted by area:\n");
        System.out.printf("%-20s%-15s%-18s%n", "Country", "Area", "Population");
        for (Country c : countries)
        {
            System.out.printf("%-20s%,-15d", c.getName(), c.getArea());
            System.out.printf("%,-15d%n", c.getPopulation());
        }
        System.out.println();

        Collections.sort(countries,
                (first, second) -> second.getPopulation() - first.getPopulation());

        System.out.println("Sorted by population:\n");
        System.out.printf("%-20s%-15s%-18s%n", "Country", "Area", "Population");
        for (Country c : countries)
        {
            System.out.printf("%-20s%,-15d", c.getName(), c.getArea());
            System.out.printf("%,-15d%n", c.getPopulation());
        }
    }
}
