package p_06_08_switch_halves_of_array;

/**
 * Write a method that implements the algorithm developed in Section 6.6.
 */
public class SwitchHalvesOfArray
{
    public static void main(String[] args)
    {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] arrayHalves = switchHalves(A);
        printArray(arrayHalves);
    }

    /**
     * The method swaps two halves of array if array length is even number.
     *
     * @param arr array, type of int
     * @return array with swapped halves
     */
    public static int[] switchHalves(int[] arr)
    {
        int i = 0;
        int j = arr.length / 2;
        int temp;

        while (i < arr.length / 2)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
        }
        return arr;
    }

    /**
     * Prints an array.
     *
     * @param arr array, type of int
     */
    public static void printArray(int[] arr)
    {
        for (int el : arr)
        {
            System.out.print(el + " ");
        }
    }
}
