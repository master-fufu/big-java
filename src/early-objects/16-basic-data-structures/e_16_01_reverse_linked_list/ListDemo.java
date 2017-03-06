package e_16_01_reverse_linked_list;

/**
 * Add a method {@code reverse} to our {@code LinkedList} implementation that
 * reverses the links in a list. Implement this method by directly rerouting
 * the links, not by using an iterator.
 */
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList staff = new LinkedList();
        staff.addFirst("Tom");
        staff.addFirst("Romeo");
        staff.addFirst("Harry");
        staff.addFirst("Diana");

        // print all elements

        ListIterator iterator = staff.listIterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // reverse and print

        staff.reverse();

        iterator = staff.listIterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
