package p_08_01_UndoCounter;

/**
 * We want to add a button to the tally counter in Section 8.2 that allows an
 * operator to undo an accidental button click. Provide a method
 * <p><pre>
 * public void undo()</pre>
 * that simulates such a button. As an added precaution, make sure that the
 * operator cannot click the undo button more often than the count button.
 */
public class CounterDemo
{
    public static void main(String[] args)
    {
        Counter tally = new Counter();
        tally.count();
        tally.count();
        int result = tally.getValue();
        System.out.println("Value: " + result);

        tally.count();
        tally.count();
        result = tally.getValue();
        System.out.println("Value: " + result);

        tally.undo();
        result = tally.getValue();
        System.out.println("Value: " + result);
    }
}
