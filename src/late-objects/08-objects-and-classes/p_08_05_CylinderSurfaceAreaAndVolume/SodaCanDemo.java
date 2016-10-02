package p_08_05_CylinderSurfaceAreaAndVolume;

/**
 * {@code SodaCan} demo.
 * <p>
 * Implement a class {@code SodaCan} with methods {@code getSurfaceArea()}
 * and {@code getVolume()}. In the constructor, supply the height and radius
 * of the can.
 */
public class SodaCanDemo
{
    public static void main(String[] args)
    {
        SodaCan can1 = new SodaCan(5.369, 8.5);
        SodaCan can2 = new SodaCan(100.05, 56.89);

        double canVolume = can1.getVolume();
        double canArea = can1.getSurface();

        System.out.println("Can 1 volume: " + canVolume);
        System.out.println("Can 1 area: " + canArea);

        canVolume = can2.getVolume();
        canArea = can2.getSurface();

        System.out.println("Can 2 volume: " + canVolume);
        System.out.println("Can 2 area: " + canArea);
    }
}
