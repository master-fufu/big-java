package p_08_07_StudentQuizzScore;

/**
 * {@code Student} class demo.
 */
public class StudentDemo
{
    public static void main(String[] args)
    {
        Student student = new Student("Harry Cooper");

        student.addQuiz(4);
        student.addQuiz(7);
        student.addQuiz(10);
        student.addQuiz(2);
        student.addQuiz(3);

        System.out.println(student.getName() + " results: \n"
                + "Total score - " + student.getTotalScore() + "\n"
                + "Average score - " + student.getAverageScore());
    }
}
