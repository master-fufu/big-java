package p_06_01_print_output_array;

/**
 * Write a program that initializes an array with ten random integers and then
 * prints four lines of output, containing
 * <p><ul>
 * <li>Every element at an even index
 * <li>Every even element
 * <li>All elements in reverse order
 * <li>Only the first and last element</ul>
 */
public class PrintOutputArray
{
    public static void main(String[] args)
    {
        // Initialize array
        int[] arr = new int[10];

        // Print element at an even index
        for (int i = 0; i < arr.length; i += 2)
        {
            arr[i] = i; // initialize array in loop
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Print every even element
        for (int i = 0; i < arr.length; i++)
        {
            // Initialize array with random numbers
            arr[i] = (int) (Math.random() * 30);
            if (arr[i] % 2 == 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        // Print all elements in reverse order
        for (int i = arr.length - 1; i >= 0; i--)
        {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Print first and last elements
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = i;
            if (i == 0 || i == arr.length - 1)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
