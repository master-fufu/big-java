package p_05_30_validate_password;

import java.util.Scanner;

/**
 * Having a secure password is a very important practice, when much of our
 * information is stored online. Write a program that validates a new password,
 * following these rules:
 * <p><pre>
 *      The password must be at least 8 characters long
 *      The password must have at least one uppercase and one lowercase letter
 *      The password must have at least one digit</pre>
 * Write a program that asks for a password, then asks again to confirm it. If
 * the passwords don't match or the rules are not fulfilled, prompt again. Your
 * program should include a method that checks whether a password is valid.
 */
public class ValidatePassword
{
    public static void main(String[] args)
    {
        // Initial input
        String passwordInput = readPassword("Enter password: ");
        String repeatPasswordInput = readPassword("Repeat password: ");

        // Check if passwords match
        while (!passwordInput.equals(repeatPasswordInput))
        {
            System.out.println("Passwords do not match, please try again.");
            passwordInput = readPassword("Enter password: ");
            repeatPasswordInput = readPassword("Repeat password: ");
        }

        // Check if password valid and print the result
        String validOrNot = checkIfValid(passwordInput);
        System.out.println(validOrNot);
    }

    /**
     * The method checks the validity of the password by passing the argument
     * string to the three separate boolean methods upperCase(), lowerCase(),
     * digit() and if any of them return false, then password is not valid and
     * method returns appropriate message. Otherwise, if all of the boolean
     * methods return true, the checkIfValid() method returns string
     * "Password is valid."
     *
     * @param p password
     * @return password validation result
     */
    public static String checkIfValid(String p)
    {
        String result = "Password is valid.";

        if (!(upperCase(p) && lowerCase(p) && digit(p)))
        {
            result = "Password is not valid.\nIt must have at least one " +
                    "lowercase and uppercase letter and a digit.\nPlease try again.";
        }
        return result;
    }

    /**
     * The method checks if the string contains at least one digit from 0 to 9.
     *
     * @param p String
     * @return true if string contains at least one digit, false otherwise
     */
    public static boolean digit(String p)
    {
        for (int i = 0; i < p.length(); i++)
        {
            char n = p.charAt(i);
            if (n >= 48 && n <= 57)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * The method checks the if string contains lowercase unicode letters
     * (in the range from 97 to 122).
     *
     * @param p password, type of String
     * @return true if string contains at least one lowercase letter
     */
    public static boolean lowerCase(String p)
    {
        for (int i = 0; i < p.length(); i++)
        {
            char charCase = p.charAt(i);
            if (charCase >= 97 && charCase <= 122)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * The method checks if the password contains unicode uppercase letters.
     *
     * @param p password, type of String
     * @return true if string contains at least one uppercase letter and false otherwise
     */
    public static boolean upperCase(String p)
    {
        for (int i = 0; i < p.length(); i++)
        {
            char charCase = p.charAt(i);
            if (charCase >= 65 && charCase <= 90)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * The method checks the length of the password, which should be >= 8.
     *
     * @param p password, type of String
     * @return true if p >= 8 and false otherwise
     */
    public static boolean checkLength(String p)
    {
        return p.length() >= 8;
    }

    /**
     * The method prompts user for input and returns it to the calling method.
     *
     * @param prompt String
     * @return String
     */
    public static String readPassword(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.next();
    }
}
