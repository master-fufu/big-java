package p_13_15_permutation_of_numbers;

/**
 * {@code PermutationGenerator} class.
 */
public class PermutationGenerator
{
    private String word;
    private NumberPermutationGenerator indexPermutationGenerator;

    public PermutationGenerator(String aWord)
    {
        word = aWord;
        indexPermutationGenerator = new NumberPermutationGenerator(word.length());
    }

    public boolean hasMorePermutations()
    {
        return indexPermutationGenerator.hasMorePermutations();
    }

    public String nextPermutation()
    {
        int[] a = indexPermutationGenerator.nextPermutation();

        String r = "";
        for (int i = 0; i < a.length; i++)
        {
            r = r + word.charAt(a[i]);
        }
        return r;
    }
}
