package e_16_04_size_method;

/**
 * Add a method {@code size} to our implementation of the {@code LinkedList}
 * class that computes the number of elements in the list by following links
 * and counting the elements until the end of the list is reached.
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

        System.out.printf("%-17s %d%n", "Staff list size: ", staff.size());
        System.out.printf("%-17s %d%n", "Expected: ", 4);
        System.out.println();

        ListIterator iterator = staff.listIterator();

        while (staff.size() > 0)
        {
            System.out.println("Staff size: " + staff.size());
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println(staff.size());
    }
}
