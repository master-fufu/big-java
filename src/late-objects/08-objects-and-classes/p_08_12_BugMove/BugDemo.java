package p_08_12_BugMove;

/**
 * {@code Bug} class demo.
 */
public class BugDemo
{
    public static void main(String[] args)
    {
        Bug bugsy = new Bug(10);
        bugsy.move();
        bugsy.move();
        bugsy.move();
        System.out.println(bugsy.getPosition());

        bugsy.turn();
        bugsy.move();
        System.out.println(bugsy.getPosition());

        bugsy.turn();
        bugsy.move();
        bugsy.move();
        bugsy.move();
        bugsy.move();
        System.out.println(bugsy.getPosition());
    }
}
