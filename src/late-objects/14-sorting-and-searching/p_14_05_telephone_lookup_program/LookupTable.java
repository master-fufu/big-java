package p_14_05_telephone_lookup_program;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * A {@code LookupTable} for a phone list.
 */
public class LookupTable
{
    private Item[] items;
    private int itemCount;

    /**
     * Constructs a LookupTable object.
     *
     * @param n the maximum number of entries
     */
    public LookupTable(int n)
    {
        items = new Item[n];
        itemCount = 0;
    }

    /**
     * Reads a file.
     *
     * @param in the file to read
     * @throws IOException
     */
    public void read(BufferedReader in) throws IOException
    {
        boolean more = true;

        while (more && itemCount < items.length)
        {
            String k = in.readLine();
            String v = null;

            if (k != null)
            {
                v = in.readLine();
            }
            if (v != null)
            {
                items[itemCount] = new Item(k, v);
                itemCount++;
            }
            else
            {
                more = false;
            }
        }
        MergeSorter m = new MergeSorter(items);
        m.sort();
    }

    /**
     * Reverse the lookup by reading phone numbers.
     *
     * @param b the LookupTable
     */
    public void reverse(LookupTable b)
    {
        itemCount = Math.min(b.itemCount, items.length);
        for (int i = 0; i < itemCount; i++)
        {
            items[i] = new Item(b.items[i].getValue(), b.items[i].getKey());
        }
        MergeSorter m = new MergeSorter(items);
        m.sort();
    }

    /**
     * Looks up an entries in the list.
     *
     * @param k the key to find
     * @return the item
     */
    public String lookup(String k)
    {
        BinarySearcher b = new BinarySearcher(items);
        int pos = b.binarySearch(0, itemCount - 1, k);
        if (pos < 0)
        {
            return "Not found";
        }
        else
        {
            return items[pos].getValue();
        }
    }
}
