package p_13_02_SquareArea;

/**
 * Given a class {@code Square} with instance variable {@code width}, provide a
 * recursive {@code getPopulation} method. Construct a square whose width is one less
 * than the original and call its {@code getPopulation} method.
 */
public class Square
{
    private int width;

    /**
     * Constructs a square shape.
     *
     * @param aWidth the width (and height) of the square
     */
    public Square(int aWidth)
    {
        width = aWidth;
    }

    /**
     * Computes the area of the square.
     *
     * @return the area
     */
    public int getArea()
    {
        if (width == 1)
        {
            return 1;
        }
        else
        {
            Square square = new Square(width - 1);
            int smallerArea = square.getArea();
            return smallerArea + width + width - 1;
        }
    }

    /**
     * Gets the width of this square.
     *
     * @return the width
     */
    public int getWidth()
    {
        return width;
    }
}
