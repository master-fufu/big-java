package p_13_15_permutation_of_numbers;

/**
 * The following class generates all permutations of the numbers 0, 1, 2, . . ., n – 1,
 * without using recursion.
 * <p><pre>
 *      public class NumberPermutationIterator
 *      {
 *          private int[] a;
 *          public NumberPermutationIterator(int n)
 *          {
 *              a = new int[n];
 *              done = false;
 *              for (int i = 0; i < n; i++) { a[i] = i; }
 *          }
 *
 *          public int[] nextPermutation()
 *          {
 *              if (a.length <= 1) { return a; }
 *              for (int i = a.length - 1; i > 0; i--)
 *              {
 *                  if (a[i - 1] < a[i])
 *                  {
 *                      int j = a.length - 1;
 *                      while (a[i - 1] > a[j]) { j--; }
 *                      swap(i - 1, j);
 *                      reverse(i, a.length - 1);
 *                      return a;
 *                  }
 *              }
 *              return a;
 *          }
 *
 *          public boolean hasMorePermutations()
 *          {
 *              if (a.length <= 1) { return false; }
 *              for (int i = a.length - 1; i > 0; i--)
 *              {
 *                  if (a[i - 1] < a[i]) { return true; }
 *              }
 *              return false;
 *          }
 *
 *          public void swap(int i, int j)
 *          {
 *              int temp = a[i];
 *              a[i] = a[j];
 *              a[j] = temp;
 *          }
 *
 *          public void reverse(int i, int j)
 *          {
 *              while (i < j) { swap(i, j); i++; j--; }
 *          }
 *      }</pre>
 * The algorithm uses the fact that the set to be permuted consists of distinct
 * numbers. Thus, you cannot use the same algorithm to compute the permutations
 * of the characters in a string. You can, however, use this class to get all
 * permutations of the character positions and then compute a string whose ith
 * character is {@code word.charAt(a[i])}. Use this approach to reimplement
 * the {@code PermutationIterator} of Exercise P13.14 without recursion.
 */
public class NumberPermutationDemo
{
    public static void main(String[] args)
    {
        PermutationGenerator generator = new PermutationGenerator("rum");

        while (generator.hasMorePermutations())
        {
            System.out.println(generator.nextPermutation());
        }
    }
}
