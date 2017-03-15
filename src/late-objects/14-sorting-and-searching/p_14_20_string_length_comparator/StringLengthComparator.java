package p_14_20_string_length_comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Sort an array list of strings by increasing <em>length</em>. <em>Hint</em>:
 * Supply a {@code Comparator}.
 */
public class StringLengthComparator
{
    public static void main(String[] args)
    {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("In");
        strings.add("computer");
        strings.add("science");
        strings.add("a");
        strings.add("string");
        strings.add("is");
        strings.add("any");
        strings.add("finite");
        strings.add("sequence");
        strings.add("of");
        strings.add("characters");

        // Sort strings by increasing length using anonymous Comparator

        Collections.sort(strings, new Comparator<String>()
        {
            @Override
            public int compare(String str1, String str2)
            {
                return str1.length() - str2.length();
            }
        });

        System.out.println(strings);
    }
}
