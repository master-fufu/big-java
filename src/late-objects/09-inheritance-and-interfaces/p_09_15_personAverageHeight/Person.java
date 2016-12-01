package p_09_15_personAverageHeight;

/**
 * A person has a name and a height in centimeters. Use the {@code average}
 * method in Section 9.6 to process a collection of {@code Person} objects.
 */
public class Person implements Measurable
{
    private String name;
    private int height;

    /**
     * Constructs a person object with name and height as parameters.
     *
     * @param aName   person's name
     * @param aHeight person's height in centimeters
     */
    public Person(String aName, int aHeight)
    {
        name = aName;
        height = aHeight;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return the height in centimeters
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * Implements method for Measurable interface.
     *
     * @return the height in cm
     */
    public int getMeasure()
    {
        return getHeight();
    }
}
