package p_08_08_StudentGradepointAverage;

import java.util.Scanner;

/**
 * {@code Student} class demo.
 */
public class StudentDemo
{
    public static void main(String[] args)
    {
        Student student = new Student("Harry Cooper");

        student.addQuiz(makeGrade("Enter grade: "));
        student.addQuiz(makeGrade("Enter grade: "));
        student.addQuiz(makeGrade("Enter grade: "));
        student.addQuiz(makeGrade("Enter grade: "));
        student.addQuiz(makeGrade("Enter grade: "));

        System.out.println(student.getName() + " Grade point average: "
                + student.getAverageScore());
    }

    /**
     * Prompts user for input and constructs grade object
     * with user input as argument.
     *
     * @param prompt String
     * @return grade object
     */
    public static Grade makeGrade(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        Grade grade = new Grade(in.next());
        grade.convertToGradePoint();
        return grade;
    }
}
