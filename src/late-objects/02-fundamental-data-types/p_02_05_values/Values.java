package p_02_05_values;

/**
 * Enhance the output of Exercise P2.4 so that the numbers are properly aligned:
 * <p><pre>
 *      Sum:            45
 *      Difference:     -5
 *      Product:       500
 *      Average:        22.50
 *      Distance:        5
 *      Maximum:        25
 *      Minimum:        20</pre>
 */
public class Values
{
    public static void main(String[] args)
    {
        int firstInt = 20;
        int secondInt = 25;

        System.out.print("First integer: " + firstInt + "\n");
        System.out.print("Second integer: " + secondInt + "\n");

        System.out.println();

        System.out.printf("%-15s%5d%n", "Sum:", firstInt + secondInt);
        System.out.printf("%-15s%5d%n", "Difference:", firstInt - secondInt);
        System.out.printf("%-15s%5d%n", "Product:", firstInt * secondInt);
        System.out.printf("%-15s%8.2f%n", "Average:", (double) (firstInt + secondInt) / 2);
        System.out.printf("%-15s%5d%n", "Distance:", Math.abs(firstInt - secondInt));
        System.out.printf("%-15s%5d%n", "Max:", Math.max(firstInt, secondInt));
        System.out.printf("%-15s%5d%n", "Min:", Math.min(firstInt, secondInt));
    }
}
