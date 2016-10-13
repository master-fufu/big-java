package p_09_01_to_07_QuestionHierarchy;

/**
 * Exercise P9.1
 * <p>
 * Add a class {@code NumericQuestion} to the question hierarchy of Section 9.1.
 * If the response and the expected answer differ by no more than 0.01, then
 * accept the response as correct.
 */
public class NumericQuestion extends Question
{
    private double answer;

    /**
     * Sets the answer for this question.
     *
     * @param correctResponse the answer
     */
    public void setAnswer(double correctResponse)
    {
        answer = correctResponse;
    }

    /**
     * Checks a given response for correctness.
     *
     * @param response the response to check
     * @return true if the response is correct, false otherwise
     */
    public boolean checkAnswer(String response)
    {
        double parseDouble = Double.parseDouble(response);
        return Math.abs(answer - parseDouble) <= 0.01;
    }
}
