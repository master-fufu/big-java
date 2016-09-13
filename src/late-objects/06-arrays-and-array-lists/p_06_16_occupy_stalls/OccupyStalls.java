package p_06_16_occupy_stalls;

/**
 * It is a well-researched fact that men in a restroom generally prefer to
 * maximize their distance from already occupied stalls, by occupying the
 * middle of the longest sequence of unoccupied places. For example, consider
 * the situation where ten stalls are empty.
 * <p><pre>
 *      – – – – – – – – – –</pre>
 * The first visitor will occupy a middle position:
 * <p><pre>
 *      – – – – – X – – – –</pre>
 * The next visitor will be in the middle of the empty area at the left.
 * <p><pre>
 *      – – X – – X – – – –</pre>
 * Write a program that reads the number of stalls and then prints out
 * diagrams in the format given above when stalls become filled, one at the
 * time. Hint: Use an array of boolean values to indicate whether a stall is
 * occupied.
 */
public class OccupyStalls
{
    public static void main(String[] args)
    {
        final int N = 10;
        boolean[] stalls = new boolean[N];

        for (int i = 0; i < stalls.length; i++)
        {
            stalls[nextStall(stalls)] = true;
            printStalls(stalls);
        }
    }

    public static int nextStall(boolean[] A)
    {
        int longestIndex = -1;
        int longestRun = 0;
        int currentIndex = -1;
        int currentRun = 0;

        boolean inRun = false;

        for (int i = 0; i < A.length; i++)
        {
            if (inRun && A[i])
            {
                inRun = false;
                if (currentRun >= longestRun)
                {
                    longestRun = currentRun;
                    longestIndex = currentIndex;
                }

            }
            else if (!inRun && !A[i])
            {
                inRun = true;
                currentIndex = i;
                currentRun = 1;
            }
            else if (inRun && !A[i])
            {
                currentRun += 1;
            }
        }

        if (inRun)
        {
            if (currentRun >= longestRun)
            {
                longestRun = currentRun;
                longestIndex = currentIndex;
            }
        }
        return (longestRun - 1) / 2 + longestIndex;
    }

    /**
     * Prints an array.
     *
     * @param A array, type of boolean
     */
    public static void printStalls(boolean[] A)
    {
        for (boolean el : A)
        {
            if (el)
            {
                System.out.print("X ");
            }
            else
            {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

}
