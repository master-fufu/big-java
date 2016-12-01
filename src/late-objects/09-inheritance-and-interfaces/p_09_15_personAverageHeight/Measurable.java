package p_09_15_personAverageHeight;

/**
 * Describes any class whose objects can be measured.
 */
public interface Measurable
{
    /**
     * Convenience static method. Computes the average height
     * of the given {@code Person} objects.
     *
     * @param persons the array of persons
     */
    static int averageHeight(Person[] persons)
    {
        if (persons.length == 0)
        {
            return 0;
        }
        int sum = 0;
        for (Person p : persons)
        {
            sum += p.getMeasure();
        }
        return sum / persons.length;
    }

    /**
     * Computes the measure of the object. For this particular
     * {@code Person} class it computes the height of the person in cm.
     *
     * @return the height in cm
     */
    int getMeasure();
}
