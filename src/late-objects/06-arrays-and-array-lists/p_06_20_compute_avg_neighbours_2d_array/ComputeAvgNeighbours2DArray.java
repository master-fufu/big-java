package bigJava_06_ArraysAndArrayLists;

/**
 * Write a method that computes the average of the neighbours of a two-dimensional
 * array element in the eight directions shown if Figure 14.
 * <p><pre>
 *      public static double neighbourAverage(int[][] values, int row, int column)</pre>
 * However, if the element is located at the boundary of the array, only include
 * the neighbours that are in the array. For example, if row and column are both
 * 0, there are only three neighbours.
 */
public class ComputeAvgNeighbours2DArray
{
    public static void main(String[] args)
    {
        int len = 5;
        int i = 3;
        int j = 3;

        double result = neighbourAverage(arr(len), i, j);

        System.out.println(result);
    }

    /**
     * Compute the average of the neighbours of a two-dimensional array element.
     *
     * @param values 2D-array
     * @param row    index of the element in the row of 2D-array
     * @param column index of the element in the column of 2D-array
     * @return average of the neighbour values, type of double
     */
    public static double neighbourAverage(int[][] values, int row, int column)
    {
        double total = 0;
        int count = 0;

        for (int x = Math.max(0, row - 1); x <= Math.min(row + 1, values.length - 1); x++)
        {
            for (int y = Math.max(0, column - 1); y <= Math.min(column + 1, values[0].length - 1); y++)
            {
                if (x != row || y != column)
                {
                    total += values[x][y];
                    count++;
                }
            }
        }
        return total / count;
    }

    /**
     * Prints 2D-array.
     *
     * @param A 2D-array
     */
    public static void printArray(int[][] A)
    {
        for (int[] subArray : A)
        {
            for (int el : subArray)
            {
                System.out.printf("%2d ", el);
            }
            System.out.println();
        }
    }

    /**
     * Creates 2D-array.
     *
     * @param size size of the rows and columns
     * @return 2D-array
     */
    public static int[][] arr(int size)
    {
        final int SIZE = size;
        int[][] A = new int[SIZE][SIZE];
        int f = 1;

        for (int i = 0; i < A.length; i++)
        {
            for (int j = 0; j < A.length; j++)
            {
                A[i][j] = f;
                f++;
            }
        }
        return A;
    }
}
