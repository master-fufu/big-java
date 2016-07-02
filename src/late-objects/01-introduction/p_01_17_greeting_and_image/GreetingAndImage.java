package p_01_17_greeting_and_image;

import javax.swing.*;
import java.net.URL;

/**
 * Type in and run the following program:
 * <p><pre>
 *      import java.net.URL;
 *      import javax.swing.ImageIcon;
 *      import javax.swing.JOptionPane;
 * <p>
 *      public class Test
 *      {
 *          public static void main(String[] args) throws Exception
 *          {
 *              URL imageLocation = new URL(
 *                  "http://horstmann.com/java4everyone/duke.gif");
 *              JOptionPane.showMessageDialog(null, "Hello", "Title",
 *                  JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
 *          }
 *      }</pre>
 * Then modify it to show a different greeting and image.
 */
public class GreetingAndImage
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
                "http://lurkmore.so/images/thumb/d/d1/Peace_duke.png/180px-Peace_duke.png");

        JOptionPane.showMessageDialog(null, "Welcome,\nPeace Duke", "Peace Duke",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}
