package p_09_01_to_07_QuestionHierarchy;

/**
 * Add a method {@code addText} to the {@code Question} superclass and provide a
 * different implementation of {@code ChoiceQuestion} that calls {@code addText}
 * rather than storing an array list of choices.
 */
public class ChoiceQuestion extends Question
{
    private int n; // number of choices

    /**
     * Creates a choice question object
     */
    public ChoiceQuestion()
    {
        n = 0;
    }

    /**
     * Adds one choice to the choice question
     *
     * @param choice  the choice
     * @param correct true if choice is correct
     */
    public void addChoice(String choice, boolean correct)
    {
        n++;
        super.addText("\n" + n + ": " + choice);
        if (correct)
        {
            String choiceString = "" + n;
            setAnswer(choiceString);
        }
    }

    /*
    Exercise P9.7
    Provide toString methods for the Question and ChoiceQuestion classes.
     */

    /**
     * @return the object's state
     */
    public String toString()
    {
        return super.toString() + "ChoiceQuestion[n=" + n + "]";
    }
}

