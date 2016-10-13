package p_09_01_to_07_QuestionHierarchy;

/**
 * Add a class {@code FillInQuestion} to the question hierarchy of Section 9.1.
 * Such a question is constructed with a string that contains the answer,
 * surrounded by _ _, for example, {@code "The inventor of Java was _James
 * Gosling_"}. The question should be displayed as
 * <p><pre>
 *      The inventor of Java was _____ </pre>
 */
public class FillInQuestion extends Question
{
    /**
     * Constructs a FillInObject with a string that contains the answer.
     *
     * @param anAnswer the correct answer
     */
    public FillInQuestion(String anAnswer)
    {
        super.setAnswer("_" + anAnswer + "_");
    }

    /**
     * Checks a given response for correctness.
     *
     * @param response the response to check
     * @return true if response is correct
     */
    public boolean checkAnswer(String response)
    {
        return super.checkAnswer("_" + response + "_");
    }
}
