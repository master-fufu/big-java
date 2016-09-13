package p_06_15_random_permutations_of_numbers;

/**
 * Write a program that produces ten random permutations of the numbers 1 to 10.
 * To generate a random permutation, you need to fill an array with the numbers
 * 1 to 10 so that no two entries of the array have the same contents. You could
 * do it by brute force, by generating random values until you have a value that
 * is not yet in the array. But that is inefficient. Instead, follow this algorithm.
 * <p><pre>
 *      Make a second array and fill it with the numbers 1 to 10.
 *      Repeat 10 times
 *          Pick a random element from the second array
 *          Remove it and append it to the permutation array</pre>
 */
public class RandomPermutationsOfNumbers
{
    public static void main(String[] args)
    {
        int[] random = new int[10];
        int[] ordered = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int orderedCurrentSize = ordered.length;

        for (int i = 0; i < 10; i++)
        {
            // Generate random position to pull from ordered array
            int position = (int) (Math.random() * orderedCurrentSize);

            // assign value from ordered array at random position to the random array
            random[i] = ordered[position];

            // remove value at random position from ordered array and decrease its size
            for (int k = position + 1; k < orderedCurrentSize; k++)
            {
                ordered[k - 1] = ordered[k];
            }
            orderedCurrentSize--;
        }

        System.out.print("Random array: ");
        for (int el : random)
        {
            System.out.print(el + " ");
        }
    }
}
