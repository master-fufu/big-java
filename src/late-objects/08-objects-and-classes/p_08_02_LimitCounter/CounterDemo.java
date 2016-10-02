package p_08_02_LimitCounter;

/**
 * Simulate a tally counter that can be used to admit a limited number of
 * people. First, the limit is set with a call
 * <p><pre>
 * public void setLimit(int maximum)</pre>
 * If the count button was clicked more often than the limit, simulate an
 * alarm by printing out a message "Limit exceeded".
 */
public class CounterDemo
{
    public static void main(String[] args)
    {
        Counter tally = new Counter();
        tally.setLimit(5);

        tally.count();
        tally.count();

        int result = tally.getValue();
        System.out.println("Value: " + result);

        tally.count();
        tally.count();

        result = tally.getValue();
        System.out.println("Value: " + result);

        tally.count();
        tally.count();
        tally.count();
        tally.count();
        result = tally.getValue();
        System.out.println("Value: " + result);
    }
}
