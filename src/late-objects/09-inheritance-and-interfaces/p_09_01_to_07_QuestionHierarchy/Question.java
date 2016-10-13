package p_09_01_to_07_QuestionHierarchy;

/**
 * A question with a text and an answer.
 */
public class Question
{
    private String text;
    private String answer;

    /**
     * Constructs a question with empty question and answer.
     */
    public Question()
    {
        text = "";
        answer = "";
    }

    /**
     * Sets the question text.
     *
     * @param questionText the text of this question
     */
    public void setText(String questionText)
    {
        text = questionText;
    }

    /**
     * Sets the answer for this question.
     *
     * @param correctResponse the answer
     */
    public void setAnswer(String correctResponse)
    {
        answer = correctResponse;
    }

    /*
     * Exercise P9.3
     * Modify the checkAnswer method of the Question class so that it does not
     * take into account different spaces or upper/lowercase characters.
     * For example, the response "JAMES gosling" should match an answer
     * of "James Gosling".
     */

    /**
     * Checks a given response for correctness.
     *
     * @param response the response to check
     * @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response)
    {
        return response.equalsIgnoreCase(answer);
    }

    /**
     * Displays this question.
     */
    public void display()
    {
        System.out.println(text);
    }

    /**
     * Adds some text to the question text.
     *
     * @param aText additional text
     */
    public void addText(String aText)
    {
        text += aText;
    }

    /*
    Exercise P9.7
    Provide toString methods for the Question and ChoiceQuestion classes.
     */

    /**
     * Overrides the {@code toString} method from {@code Object} cosmic class.
     *
     * @return the object's state
     */
    public String toString()
    {
        return String.format("%s[text=%s, answer=%s]",
                "Question", text, answer);
    }
}
