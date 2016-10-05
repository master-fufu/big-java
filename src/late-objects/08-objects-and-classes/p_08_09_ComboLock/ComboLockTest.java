package p_08_09_ComboLock;

/**
 * {@code ComboLock} class test.
 */
public class ComboLockTest
{
    public static void main(String[] args)
    {
        ComboLock lock = new ComboLock(20, 30, 0);

        boolean isOpen = lock.open();

        System.out.println("Is the lock open? " + isOpen);

        lock.reset();
    }
}
