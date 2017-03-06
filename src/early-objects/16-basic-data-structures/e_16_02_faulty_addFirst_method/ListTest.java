package e_16_02_faulty_addFirst_method;

/**
 * Consider a version of the {@code LinkedList} class of Section 16.1 in
 * which the {@code addFirst} method has been replaced with the following
 * faulty version:
 * <p><pre>
 *      public void addFirst(Object element)
 *      {
 *          Node newNode = new Node();
 *          first = newNode;
 *          newNode.data = element;
 *          newNode.next = first;
 *      }</pre>
 * Develop a program {@code ListTest} with a test case that shows the error.
 * That is, the program should print a failure message with this implementation
 * but not with the correct implementation.
 */
public class ListTest
{
    public static void main(String[] args)
    {
        LinkedList staff = new LinkedList();
        staff.addFirst("Tom");
        staff.addFirst("Romeo");
        staff.addFirst("Harry");
        staff.addFirst("Diana");

        // Remove first element and check for equality
        // with first element in the list. If first element
        // is not removed, than addFirst() is faulty

        Object firstElement = staff.removeFirst();

        if (staff.getFirst().equals(firstElement))
        {
            throw new UnsupportedOperationException("addFirst() is faulty");
        }
    }
}
