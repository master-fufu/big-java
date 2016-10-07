package p_08_13_Moth;

/**
 * Implement a class {@code Moth} that models a moth flying in a straight line.
 * The moth has a position, the distance from a fixed origin. When the moth
 * moves toward a point of light, its new position is halfway between its old
 * position and the position of the light source. Supply a constructor
 * <p><pre>
 *     public Moth(double initialPosition)</pre>
 * and methods
 * <p><ul>
 * <li>{@code public void moveToLight(double lightPosition)}
 * <li>{@code public void getPosition()}</ul>
 * <p>
 * Your {@code main} method should construct a moth, move it toward a couple of
 * light sources, and check that the moth's position is as expected.
 */
public class Moth
{
    private double mothPosition;

    /**
     * Constructs a moth object with initial position parameter.
     *
     * @param initialPosition moth's initial position
     */
    public Moth(double initialPosition)
    {
        mothPosition = initialPosition;
    }

    /**
     * Moves moth toward a point of light.
     *
     * @param lightPosition light position
     */
    public void moveToLight(double lightPosition)
    {
        mothPosition += (lightPosition - mothPosition) / 2;
    }

    /**
     * Gets current moth position.
     *
     * @return moth position, type of double
     */
    public double getPosition()
    {
        return mothPosition;
    }
}
