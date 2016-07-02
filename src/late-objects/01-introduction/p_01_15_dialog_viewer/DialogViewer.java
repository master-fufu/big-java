package p_01_15_dialog_viewer;

import javax.swing.*;

/**
 * Type in and run the following program:
 * <p><pre>
 *      import javax.swing.JOptionPane;
 *      public class DialogViewer
 *      {
 *          public static void main(String[] args)
 *          {
 *              String name = JOptionPane.showInputDialog("What is your name?");
 *              System.out.println(name);
 *          }
 *      }</pre>
 * Then modify the program to print "Hello, name!", displaying the name
 * that the user typed in.
 */
public class DialogViewer
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);
    }
}
