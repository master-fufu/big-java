package p_13_01_RectangleArea;

/**
 * Given a class {@code Rectangle} with instance variables length and width,
 * provide a recursive {@code getPopulation} method. Construct a rectangle whose
 * length is one less than the original and call its {@code getPopulation} method.
 */
public class Rectangle
{
    private int length;
    private int width;

    /**
     * Constructs a rectangle shape.
     *
     * @param aLength the length of the rectangle
     * @param aWidth  the width of the rectangle
     */
    public Rectangle(int aLength, int aWidth)
    {
        length = aLength;
        width = aWidth;
    }

    /**
     * Computes the area of the rectangle.
     *
     * @return the area
     */
    public int getArea()
    {
        if (length == 0)
        {
            return 0;
        }
        else
        {
            Rectangle square = new Rectangle(length - 1, width);
            int smallerArea = square.getArea();
            return smallerArea + width;
        }
    }

    /**
     * Gets the length of this rectangle.
     *
     * @return the length
     */
    public int getLength()
    {
        return length;
    }

    /**
     * Gets the width of this rectangle.
     *
     * @return the width
     */
    public int getWidth()
    {
        return width;
    }
}
