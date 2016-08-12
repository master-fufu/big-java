package p_04_23_the_drunkards_walk;

/**
 * The Drunkard's Walk. A drunkard in a grid of streets randomly picks one of
 * four directions and stumbles to the next intersection, then again randomly
 * picks one of four directions, and so on. You might think that on average
 * the drunkard doesn't move very far because the choices cancel each other
 * out, but that is actually not the case. Represent locations as integer
 * pairs (x, y). Implement the drunkard's walk over 100 intersections,
 * starting at (0, 0), and print the ending location.
 */
public class TheDrunkardsWalk
{
    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;
        int r; // random move

        for (int i = 1; i <= 100; i++)
        {
            r = (int) (Math.random() * 4) + 1;

            if (r == 1)
            {
                y++;
            }
            else if (r == 2)
            {
                x++;
            }
            else if (r == 3)
            {
                y--;
            }
            else if (r == 4)
            {
                x--;
            }
            System.out.printf("Random choice %d: x = %d y = %d%n", r, x, y);
        }
    }
}
