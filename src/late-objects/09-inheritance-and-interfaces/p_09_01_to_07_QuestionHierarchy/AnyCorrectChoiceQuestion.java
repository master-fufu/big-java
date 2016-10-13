package p_09_01_to_07_QuestionHierarchy;

/**
 * Add a class {@code AnyCorrectChoiceQuestion} to the question hierarchy of
 * Section 9.1 that allows multiple correct choices. The respondent should
 * provide any one of the correct choices. The answer string should contain
 * all of the correct choices, separated by spaces. Provide instructions
 * in the question text.
 */
public class AnyCorrectChoiceQuestion extends ChoiceQuestion
{
    private String allAnswers;

    /**
     * Sets the correct answer for the question in the string
     * separated by spaces.
     *
     * @param correctResponse the answer
     */
    public void setAnswer(String correctResponse)
    {
        allAnswers = correctResponse + " " + allAnswers;
    }

    /**
     * Check if the response provided by user contains
     * in the string of correct answers.
     *
     * @param response the response to check
     * @return true if response is correct
     */
    public boolean checkAnswer(String response)
    {
        return allAnswers.contains(response);
    }

    /**
     * Display the question.
     */
    public void display()
    {
        super.display();
    }
}
