package p_08_03_Menu;

import java.util.Scanner;

/**
 * Reimplement the {@code Menu} class so that it stores all menu items in one
 * long string. Hint: Keep a separate counter for the number of options.
 * When a new option is added, append the option count, the option, and
 * a newline character.
 */
public class Menu
{
    private String options;
    private Scanner in;
    private int optionCount;

    /**
     * Constructs a menu with no options.
     */
    public Menu()
    {
        options = "";
        in = new Scanner(System.in);
        optionCount = 0;
    }


    /**
     * Adds an option to the end of this menu.
     *
     * @param option the option to add
     */
    public void addOption(String option)
    {
        optionCount++;
        options += optionCount + ") " + option + "\n";
    }

    /**
     * Displays the menu, with options numbered starting with 1,
     * and prompts the user for input. Repeats until a valid input
     * is supplied.
     *
     * @return the number that the user supplied
     */
    public int getInput()
    {
        int input;
        do
        {
            for (int i = 0; i < 1; i++)
            {
                System.out.println(options);
            }
            input = in.nextInt();
        }
        while (input < 1 || input > optionCount);
        return input;
    }
}
