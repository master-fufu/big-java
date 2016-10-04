package p_08_08_StudentGradepointAverage;

/**
 * Modify the {@code Student} class of Exercise P8.7 to compute grade point
 * averages. Methods are needed to add a grade and get the current GPA. Specify
 * grades as elements of a class {@code Grade}. Supply a constructor that
 * constructs a grade from a string, such as "B+". You will also need a method
 * that translates grades into their numeric values (for example,
 * "B+" becomes 3.3).
 */
public class Grade
{
    private String grade;
    private double point;

    /**
     * Constructs a new grade from a string.
     *
     * @param grade grade, type of String
     */
    public Grade(String grade)
    {
        this.grade = grade;
    }

    /**
     * Converts grade into grade point.
     */
    public void convertToGradePoint()
    {
        if (grade.equalsIgnoreCase("A+") || grade.equalsIgnoreCase("A"))
        {
            point = 4.0;
        }
        else if (grade.equalsIgnoreCase("A-"))
        {
            point = 3.7;
        }
        else if (grade.equalsIgnoreCase("B+"))
        {
            point = 3.3;
        }
        else if (grade.equalsIgnoreCase("B"))
        {
            point = 3.0;
        }
        else if (grade.equalsIgnoreCase("B-"))
        {
            point = 2.7;
        }
        else if (grade.equalsIgnoreCase("C+"))
        {
            point = 2.3;
        }
        else if (grade.equalsIgnoreCase("C"))
        {
            point = 2.0;
        }
        else if (grade.equalsIgnoreCase("C-"))
        {
            point = 1.7;
        }
        else if (grade.equalsIgnoreCase("D+"))
        {
            point = 1.3;
        }
        else if (grade.equalsIgnoreCase("D"))
        {
            point = 1.0;
        }
        else if (grade.equalsIgnoreCase("E") || grade.equalsIgnoreCase("F"))
        {
            point = 0;
        }
    }

    /**
     * Gets grade point.
     *
     * @return grade point
     */
    public double getPoint()
    {
        return point;
    }
}
