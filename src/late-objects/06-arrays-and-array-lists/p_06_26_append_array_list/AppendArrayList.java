package p_06_26_append_array_list;

import java.util.ArrayList;

/**
 * Write a method
 * <p><pre>
 *      public static ArrayList&lt;Integer&gt; append(ArrayList&lt; Integer&gt; a, ArrayList&lt;Integer&gt; b)</pre>
 * that appends one array list after another. For example, if a is
 * <p><pre>
 *      1 4 9 16</pre>
 * and b is
 * <p><pre>
 *      9 7 4 9 11</pre>
 * then append returns the array list
 * <p><pre>
 *      1 4 9 16 9 7 4 9 11</pre>
 */
public class AppendArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = arr1();
        ArrayList<Integer> b = arr2();

        ArrayList<Integer> c = append(a, b);
        System.out.println(c);
    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        for (int i = 0; i < b.size(); i++)
        {
            a.add(b.get(i));
        }
        return a;
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
