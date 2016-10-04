package p_08_06_Car;

/**
 * Implement a class {@code Car} with the following properties. A car has a
 * certain fuel efficiency (measured in miles/gallon) and a certain amount of
 * fuel in the gas tank. The efficiency is specified in the constructor, and the
 * initial fuel level is 0. Supply a method {@code drive} that simulates driving
 * the car for a certain distance, reducing the fuel level in the gas tank, and
 * methods {@code getGasLevel}, to return the current fuel level, and
 * {@code addGas}, to tank up. Sample usage:
 * <p><pre>
 *      Car myHybrid = new Car(50); // 50 miles per gallon
 *      myHybrid.addGas(20); // Tank 20 gallons
 *      myHybrid.drive(100); // Drive 100 miles
 *      System.out.println(myHybrid.getGasLevel()); // Print fuel remaining
 * </pre>
 */
public class Car
{
    private int fuelLevel;
    private int milesPerGallon;
    private int milesLeft;

    /**
     * Constructs object of {@code Car} class.
     *
     * @param mpg miles per gallon value
     */
    public Car(int mpg)
    {
        fuelLevel = 0;
        milesLeft = 0;
        milesPerGallon = mpg;
    }

    /**
     * Adds gas to the tank.
     *
     * @param gas some amount of gas
     */
    public void addGas(int gas)
    {
        fuelLevel = gas;
    }

    /**
     * Drives the car for a certain distance, reducing the fuel level in the
     * gas tank.
     *
     * @param miles miles to drive
     */
    public void drive(int miles)
    {
        milesLeft = (milesPerGallon * fuelLevel) - miles;
    }

    /**
     * Gets fuel level in the gas tank.
     *
     * @return the fuel level
     */
    public double getGasLevel()
    {
        return milesLeft / milesPerGallon;
    }
}
