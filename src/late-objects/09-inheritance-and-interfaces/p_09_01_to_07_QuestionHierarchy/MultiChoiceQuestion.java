package p_09_01_to_07_QuestionHierarchy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Add a class {@code MultiChoiceQuestion} to the question hierarchy of
 * Section 9.1 that allows multiple correct choices. The respondent should
 * provide all correct choices, separated by spaces. Provide instructions in
 * the question text.
 */
public class MultiChoiceQuestion extends ChoiceQuestion
{
    private ArrayList<String> answers;

    /**
     * Constructs {@code MultiChoiceQuestion} object.
     */
    public MultiChoiceQuestion()
    {
        answers = new ArrayList<>();
    }

    /**
     * Sets the correct answers for {@code MultiChoiceQuestion} class.
     *
     * @param correctResponse the correct answer
     */
    public void setAnswer(String correctResponse)
    {
        Scanner in = new Scanner(correctResponse);
        while (in.hasNext())
        {
            answers.add(in.next());
        }
    }

    /**
     * Checks if the answer provided by user is correct.
     *
     * @param response the response to check
     * @return true only if all answers provided by user are correct
     */
    public boolean checkAnswer(String response)
    {
        Scanner in = new Scanner(response);
        int count = 0;
        while (in.hasNext())
        {
            String nextAnswer = in.next();
            for (String answer : answers)
            {
                if (nextAnswer.equals(answer))
                {
                    count++;
                }
            }
        }
        return count == answers.size();
    }
}
