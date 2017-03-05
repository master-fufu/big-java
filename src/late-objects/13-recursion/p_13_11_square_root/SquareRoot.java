package p_13_11_square_root;

/**
 * The following method was known to the ancient Greeks for computing square
 * roots. Given a value <em>x &gt; 0</em> and a guess <em>g</em> for the square
 * root, a better guess is <em>(g + x / g) / 2</em>. Write a recursive helper
 * method {@code public static squareRootGuess (double x, double g)}.
 * If <em>g^2</em> is approximately equal to <em>x</em>, return <em>g</em>,
 * otherwise, return {@code squareRootGuess} with the better guess. Then write
 * a method {@code public static squareRoot(double x)} that uses the helper
 * method.
 */
public class SquareRoot
{
    public static void main(String[] args)
    {
        double x = 25;

        double result = squareRoot(x);
        System.out.printf("%-12s%s%n", "Result: ", Double.toString(result));

        double expectedResult = Math.sqrt(x);
        System.out.printf("%-12s%s%n", "Expected: ", Double.toString(expectedResult));
    }

    /**
     * Computes square root of the given number.
     *
     * @param x the number to compute square root
     * @return the square root for the number x
     */
    public static double squareRoot(double x)
    {
        return squareRootGuess(x, 1);
    }

    /**
     * Helper method to recursively compute square root for the given number.
     *
     * @param x the number for which square root is being computed
     * @param g the current guess for the square root
     * @return the closest guess to the square root of number x
     */
    public static double squareRootGuess(double x, double g)
    {
        // sets the precision for the guess of the square root
        double epsilon = Math.pow(x, -12);

        if (Math.abs(g * g - x) < epsilon)
        {
            return g;
        }
        else
        {
            g = (g + x / g) / 2;
            return squareRootGuess(x, g);
        }
    }
}
