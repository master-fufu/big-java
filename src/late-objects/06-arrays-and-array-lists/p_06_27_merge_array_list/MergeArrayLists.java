package p_06_27_merge_array_list;

import java.util.ArrayList;

/**
 * Write a method
 * <p><pre>
 *      public static ArrayList&lt;Integer&gt; merge(ArrayList&lt;Integer&gt; a, ArrayList&lt;Integer&gt; b)</pre>
 * that merges two array lists, alternating elements from both array lists.
 * If one array list is shorter than the other, then alternate as long as
 * you can and then append the remaining elements from the longer array list.
 * For example, if a is
 * <p><pre>
 *      1 4 9 16</pre>
 * and b is
 * <p><pre>
 *      9 7 4 9 11</pre>
 * then merge returns the array list
 * <p><pre>
 *      1 9 4 7 9 4 16 9 11</pre>
 */
public class MergeArrayLists
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = arr1();
        ArrayList<Integer> b = arr2();

        ArrayList<Integer> merged = merge(a, b);
        System.out.println(merged);
    }

    /**
     * This method merges two array lists alternating elements from both
     * array lists.
     *
     * @param A array list, type of int
     * @param B array list, type of int
     * @return merged A and B arrays
     */
    public static ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B)
    {
        ArrayList<Integer> c = new ArrayList<>();

        int minLen;
        int maxLen;
        if (A.size() > B.size())
        {
            minLen = B.size();
            maxLen = A.size();
        }
        else
        {
            minLen = A.size();
            maxLen = B.size();
        }

        /*
        Merge arrays
         */
        int i = 0;
        while (i < minLen)
        {
            if (i % 2 == 0)
            {
                c.add(A.get(i));
                c.add(B.get(i));
            }
            else
            {
                c.add(A.get(i));
                c.add(B.get(i));
            }
            i++;
        }

        /*
        Append remaining elements
         */
        int j = minLen;
        while (j < maxLen)
        {
            if (A.size() > B.size())
            {
                c.add(A.get(j++));
            }
            else
            {
                c.add(B.get(j++));
            }
        }
        return c;
    }

    /**
     * Initialise second array.
     *
     * @return array list
     */
    public static ArrayList<Integer> arr2()
    {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(9);
        A.add(7);
        A.add(4);
        A.add(9);
        A.add(11);

        return A;
    }

    /**
     * Initialise first array.
     *
     * @return array list
     */
    public static ArrayList<Integer> arr1()
    {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(4);
        A.add(9);
        A.add(16);

        return A;
    }
}
