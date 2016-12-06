package p_13_02_SquareArea;

/**
 * Given a class {@code Square} with instance variable {@code width}, provide a
 * recursive {@code getPopulation} method. Construct a square whose width is one less
 * than the original and call its {@code getPopulation} method.
 */
public class SquareTester
{
    public static void main(String[] args)
    {
        Square s = new Square(5);
        int area = s.getArea();

        System.out.println("Area: " + area);
        System.out.println("Expected: " + (s.getWidth() * s.getWidth()));
    }
}
