package p_06_28_merge_sorted_array_lists;

import java.util.ArrayList;

/**
 * Write a method
 * <p><pre>
 *      public static ArrayList&lt;Integer&gt; mergeSorted(ArrayList&lt;Integer&gt; a, ArrayList&lt;Integer&gt; b)</pre>
 * that merges two sorted array lists, producing a new sorted array list. Keep
 * an index into each array list, indicating how much of it has been processed
 * already. Each time,append the smallest unprocessed element from either array
 * list, then advance the index. For example, if a is
 * <p><pre>
 *      1 4 9 16</pre>
 * and b is
 * <p><pre>
 *      4 7 9 9 11</pre>
 * then mergeSorted returns the array list
 * <p><pre>
 *      1 4 4 7 9 9 9 11 16</pre>
 */
public class MergeSortedArrayLists
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = arr2();
        ArrayList<Integer> b = arr1();

        ArrayList<Integer> c = mergeSorted(a, b);
        System.out.println(c);
    }

    /**
     * Merges two sorted arrays.
     *
     * @param A ArrayList, type of int
     * @param B ArrayList, type of int
     * @return merged ArrayList
     */
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> A,
            ArrayList<Integer> B)
    {
        ArrayList<Integer> C = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size())
        {
            if (A.get(i) > B.get(j))
            {
                C.add(B.get(j));
                j++;
            }
            else if (A.get(i) < B.get(j))
            {
                C.add(A.get(i));
                i++;
            }
            else
            {
                C.add(A.get(i));
                C.add(B.get(j));
                i++;
                j++;
            }

        }

        if (i < A.size())
        {
            while (i < A.size())
            {
                C.add(A.get(i));
                i++;
            }
        }
        else if (j < B.size())
        {
            while (j < B.size())
            {
                C.add(B.get(j));
                j++;
            }
        }

        return C;
    }

    /**
     * Initialise second array.
     *
     * @return array list
     */
    public static ArrayList<Integer> arr2()
    {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(4);
        A.add(9);
        A.add(16);

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
        A.add(4);
        A.add(7);
        A.add(9);
        A.add(9);
        A.add(11);

        return A;
    }
}
