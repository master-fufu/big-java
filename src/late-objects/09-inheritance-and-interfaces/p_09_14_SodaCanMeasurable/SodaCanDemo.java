package p_09_14_SodaCanMeasurable;

/**
 * {@code SodaCan} class demo.
 * <p>
 * Modify the {@code SodaCan} class of Exercise P8.5 to implement the {@code
 * Measurable} interface. The measure of a soda can should be its surface area.
 * Write a program that computes the average surface area of an array of soda
 * cans.
 */
public class SodaCanDemo
{
    public static void main(String[] args)
    {
        Measurable[] cans = new SodaCan[5];
        cans[0] = new SodaCan(5, 10);
        cans[1] = new SodaCan(10, 20);
        cans[2] = new SodaCan(20, 40);
        cans[3] = new SodaCan(40, 80);
        cans[4] = new SodaCan(80, 160);

        System.out.printf("%s%.2f", "Average surface of an array of soda cans: ", average(cans));
    }

    /**
     * Computes the average of the measures of the given objects.
     *
     * @param objects an array of Measurable objects
     * @return the average of the measures
     */
    public static double average(Measurable[] objects)
    {
        if (objects.length == 0)
        {
            return 0;
        }
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        return sum / objects.length;
    }
}
