package p_03_12_letter_grade_into_number;

import java.util.Scanner;

/**
 * Write a program that translates a letter grade into a number grade. Letter
 * grades are A, B, C, D, and F, possibly followed by + or -. Their numeric
 * values are 4, 3, 2, 1, and 0. There is no F+ or F-. A+ increases the
 * numeric value by 0.3, a - decreases it by 0.3. However, an A+ has value 4.0.
 * <p><pre>
 *      Enter a letter grade: B-
 *      The numeric value is 2.7.
 */
public class LetterGradeIntoNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String grade = in.next().toUpperCase();

        double num_grade;

        switch (grade)
        {
            case "A":
            case "A+":
                num_grade = 4;
                System.out.println("Grade " + grade + " equals " + num_grade);
                break;
            case "A-":
                num_grade = 4 - 0.3;
                System.out.println("Grade " + grade + " equals " + num_grade);
                break;
            case "B":
                num_grade = 3;
                System.out.println("Grade " + grade + " equals " + num_grade);
                break;
            case "B+":
                num_grade = 3 + 0.3;
                System.out.println("Grade " + grade + " equals " + num_grade);
                break;
            case "B-":
                num_grade = 3 - 0.3;
                System.out.println("Grade " + grade + " equals " + num_grade);
                break;
            case "C":
                num_grade = 2;
                System.out.println("Grade " + grade + " equals " + num_grade);
                break;
            case "C-":
                num_grade = 2 - 0.3;
                System.out.println("Grade " + grade + " equals " + num_grade);
                break;
            case "C+":
                num_grade = 2 + 0.3;
                System.out.println("Grade " + grade + " equals " + num_grade);
                break;
            case "D":
                num_grade = 1;
                System.out.println("Grade " + grade + " equals " + num_grade);
                break;
            case "D+":
                num_grade = 1 + 0.3;
                System.out.println("Grade " + grade + " equals " + num_grade);
                break;
            case "D-":
                num_grade = 1 - 0.3;
                System.out.println("Grade " + grade + " equals " + num_grade);
                break;
            case "F":
                num_grade = 0;
                System.out.println("Grade " + grade + " equals " + num_grade);
                break;
            case "F+":
            case "F-":
                System.out.println("There is no F+ or F-");
                break;
            default:
                System.out.println("Inalid input");
        }
    }
}
