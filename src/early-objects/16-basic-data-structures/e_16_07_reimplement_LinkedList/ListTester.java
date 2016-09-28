package e_16_07_reimplement_LinkedList;

/**
 * Reimplement the {@code LinkedList} class of Section 16.1 so that the
 * {@code Node} and {@code LinkedListIterator} classes are not inner classes.
 */
public class ListTester
{
    public static void main(String[] args)
    {
        LinkedList staff = new LinkedList();
        staff.addFirst("Tom");
        staff.addFirst("Romeo");
        staff.addFirst("Harry");
        staff.addFirst("Dick");

        // | in the comments indicates the iterator position

        ListIterator iterator = staff.listIterator(); // |DHRT
        iterator.next(); // D|HRT
        iterator.next(); // DH|RT

        // Add more elements after second element

        iterator.add("Juliet"); // DHJ|RT
        iterator.add("Nina"); // DHJN|RT

        iterator.next(); // DHJNR|T

        // Remove last traversed element

        iterator.remove(); // DHJN|T

        // Print all elements

        iterator = staff.listIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
