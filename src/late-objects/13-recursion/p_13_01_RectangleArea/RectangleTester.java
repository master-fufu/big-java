package p_13_01_RectangleArea;

/**
 * Given a class {@code Rectangle} with instance variables length and width,
 * provide a recursive {@code getPopulation} method. Construct a rectangle whose
 * length is one less than the original and call its {@code getPopulation} method.
 */
public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(5, 8);
        int area = r.getArea();

        System.out.println("Area: " + area);
        System.out.println("Expected: " + (r.getLength() * r.getWidth()));
    }
}
