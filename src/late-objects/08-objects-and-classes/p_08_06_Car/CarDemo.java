package p_08_06_Car;

/**
 * {@code Car} class demo.
 */
public class CarDemo
{
    public static void main(String[] args)
    {
        Car myHybrid = new Car(100);

        myHybrid.addGas(20);
        myHybrid.drive(100);

        System.out.println(myHybrid.getGasLevel());
    }
}
