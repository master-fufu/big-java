package p_01_14_dialog_viewer;

import javax.swing.*;

/**
 * Type in and run the following program:
 * <p><pre>
 *      import javax.swing.JOptionPane;
 * <p>
 *      public class DialogViewer
 *      {
 *          public static void main(String[] args)
 *          {
 *              JOptionPane.showMessageDialog(null, "Hello, World!");
 *          }
 *      }</pre>
 * Then modify the program to show the message "Hello, your name!".
 */
public class DialogViewer
{
    public static void main(String[] args)
    {
        JOptionPane.showInputDialog(null, "Hello, the name!");
    }
}
