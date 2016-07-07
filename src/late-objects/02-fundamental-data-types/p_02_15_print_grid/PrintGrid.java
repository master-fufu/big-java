package p_02_15_print_grid;

/**
 * Printing a grid. Write a program that prints the following grid
 * to play tic-tac-toe.
 * <p><pre>
 *      +--+--+--+
 *      |  |  |  |
 *      +--+--+--+
 *      |  |  |  |
 *      +--+--+--+
 *      |  |  |  |
 *      +--+--+--+</pre>
 * Of course, you could simply write seven statements of the form
 * <p><pre>
 *      System.out.println("+--+--+--+");</pre>
 * You should do it the smart way, though. Declare string variables to hold
 * two kinds of patterns: a comb-shaped pattern and the bottom line. Print the
 * comb three times and the bottom line once.
 */
public class PrintGrid
{
    public static void main(String[] args)
    {
        String comb = "+--+--+--+\n|  |  |  |\n";
        String bottom = "+--+--+--+\n";

        System.out.print(comb + comb + comb + bottom);
    }
}
