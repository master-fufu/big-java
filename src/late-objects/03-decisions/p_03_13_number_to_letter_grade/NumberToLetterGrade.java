package p_03_13_number_to_letter_grade;

import java.util.Scanner;

/**
 * Write a program that translates a number between 0 and 4 into the closest
 * letter grade. For example, the number 2.8 (which might have been the average
 * of several grades) would be converted to B-. Break ties in favour of the
 * better grade; for example 2.85 should be a B.
 */
public class NumberToLetterGrade
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number from 0 to 4: ");
        double n = in.nextDouble();

        String grade;

        boolean a = n >= 3.85; // A grade
        boolean am = n >= 3.7; // A-
        boolean bp = n > 3; // B+
        boolean b = n >= 2.85; // B
        boolean bm = n >= 2.7; // B-
        boolean cp = n > 2; // C+
        boolean c = n >= 1.85; // C
        boolean cm = n >= 1.7; // C-
        boolean dp = n > 1; // D+
        boolean d = n >= 0.85; // D
        boolean dm = n >= 0.7; // D-

        if (n > 4 || n < 0)
        {
            System.out.println("Invalid input");
        }
        else if (a)
        {
            grade = "A";
            System.out.println("Your grade is " + grade);
        }
        else if (am)
        {
            grade = "A-";
            System.out.println("Your grade is " + grade);
        }
        else if (bp)
        {
            grade = "B+";
            System.out.println("Your grade is " + grade);
        }
        else if (b)
        {
            grade = "B";
            System.out.println("Your grade is " + grade);
        }
        else if (bm)
        {
            grade = "B-";
            System.out.println("Your grade is " + grade);
        }
        else if (cp)
        {
            grade = "C+";
            System.out.println("Your grade is " + grade);
        }
        else if (c)
        {
            grade = "C";
            System.out.println("Your grade is " + grade);
        }
        else if (cm)
        {
            grade = "C-";
            System.out.println("Your grade is " + grade);
        }
        else if (dp)
        {
            grade = "D+";
            System.out.println("Your grade is " + grade);
        }
        else if (d)
        {
            grade = "D";
            System.out.println("Your grade is " + grade);
        }
        else if (dm)
        {
            grade = "D-";
            System.out.println("Your grade is " + grade);
        }
        else
        {
            grade = "F";
            System.out.println("Your grade is " + grade);
        }
    }
}
