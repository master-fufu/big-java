package p_08_08_StudentGradepointAverage;

/**
 * Implement a class {@code Student}. For the purpose of this exercise, a
 * student has a name and a total quiz score. Supply an appropriate constructor
 * and methods {@code getName()}, {@code addQuiz(int score)},
 * {@code getTotalScore()}, and {@code getAverageScore()}. To compute the
 * latter, you also need to store the number of quizzes that the student took.
 */
public class Student
{
    private String name;
    private double totalScore;
    private int totalQuizzes;

    /**
     * Constructs {@code Student} object with {@code name} parameter.
     *
     * @param name the student's name
     */
    public Student(String name)
    {
        this.name = name;
        totalScore = 0;
        totalQuizzes = 0;
    }

    /**
     * Adds quiz score to the total score and increments number quizzes by one.
     *
     * @param grade the quiz score
     */
    public void addQuiz(Grade grade)
    {
        totalScore += grade.getPoint();
        totalQuizzes++;
    }

    /**
     * Gets student's name.
     *
     * @return the student's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets average score.
     *
     * @return the average score
     */
    public double getAverageScore()
    {
        return totalScore / totalQuizzes;
    }
}
