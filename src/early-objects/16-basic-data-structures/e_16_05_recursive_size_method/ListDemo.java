package e_16_05_recursive_size_method;

/**
 * Solve Exercise E16.4 recursively by calling a recursive helper method
 * <p><pre>
 *      private static int size(Node start)</pre>
 * <em>Hint:</em> If start is {@code null}, then the size is 0. Otherwise,
 * it is one larger than the size of {@code start.next}.
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
