package p_09_01_to_07_QuestionHierarchy;

import java.util.Scanner;

/**
 * Question hierarchy demo.
 */
public class QuestionHierarchyDemo
{
    public static void main(String[] args)
    {
        // Question
        presentQuestion(question());

        // ChoiceQuestion
        presentQuestion(choiceQuestion());

        // AnyCorrectChoiceQuestion
        presentQuestion(anyCorrectChoiceQuestion());

        // MultiChoiceQuestion
        presentQuestion(multiChoiceQuestion());

        // Numeric question
        presentQuestion(numericQuestion());

        // FillInQuestion
        presentQuestion(fillInQuestion());

        // Test toString methods

        System.out.println(question().toString());
        System.out.println(choiceQuestion().toString());
    }

    /**
     * Generates {@code Question} to the question hierarchy.
     *
     * @return Question, type of Question
     */
    public static Question question()
    {
        Question question = new Question();
        question.setText("Who was the inventor of Java?");
        question.setAnswer("James Gosling");
        return question;
    }

    /**
     * Generates {@code ChoiceQuestion} to the question hierarchy.
     *
     * @return ChoiceQuestion, type of Question
     */
    public static Question choiceQuestion()
    {
        ChoiceQuestion choice = new ChoiceQuestion();
        choice.setText("In which country was the inventor of Java born?");
        choice.addChoice("Australia", false);
        choice.addChoice("Canada", true);
        choice.addChoice("Denmark", false);
        choice.addChoice("United States", false);
        return choice;
    }

    /**
     * Generates {@code MultiChoiceQuestion} to the question hierarchy.
     *
     * @return MultiChoiceQuestion, type of Question
     */
    public static Question multiChoiceQuestion()
    {
        MultiChoiceQuestion multiChoice = new MultiChoiceQuestion();
        multiChoice.setText("British monarchs file in 20th century: ");
        multiChoice.setAnswer("George Edward Elizabeth");
        return multiChoice;
    }

    /**
     * Generates {@code AnyCorrectChoiceQuestion} to the question hierarchy.
     *
     * @return AnyCorrectChoiceQuestion, type of Question
     */
    public static Question anyCorrectChoiceQuestion()
    {
        AnyCorrectChoiceQuestion anyCorrect = new AnyCorrectChoiceQuestion();
        anyCorrect.setText("British monarchs file in 20th century: ");
        anyCorrect.addText("\nGeorge\nTamara\nEdward\nBob\nElizabeth");
        anyCorrect.setAnswer("George Edward Elizabeth");
        return anyCorrect;
    }

    /**
     * Generates {@code FillInQuestion} to the question hierarchy.
     *
     * @return fillInQuestion, type of Question
     */
    public static Question fillInQuestion()
    {
        FillInQuestion fillInQuestion = new FillInQuestion("James Gosling");
        fillInQuestion.setText("The inventor of Java was _____");
        return fillInQuestion;
    }

    /**
     * Generates NumericQuestion to the question hierarchy.
     *
     * @return numeric question, type of Question
     */
    public static Question numericQuestion()
    {
        NumericQuestion numeric = new NumericQuestion();
        numeric.setText("Enter 4/3 in decimal notation: ");
        numeric.setAnswer(4.0 / 3);
        return numeric;
    }

    /**
     * Presents a question to the user and checks the response.
     *
     * @param q the question, type of Question
     */
    public static void presentQuestion(Question q)
    {
        q.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
