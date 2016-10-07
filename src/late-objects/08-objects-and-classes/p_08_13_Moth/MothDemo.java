package p_08_13_Moth;

/**
 * {@code Moth} class demo.
 */
public class MothDemo
{
    public static void main(String[] args)
    {
        Moth moth = new Moth(10);

        moth.moveToLight(20);

        System.out.println(moth.getPosition());

        moth.moveToLight(30);

        System.out.println(moth.getPosition());
    }
}
