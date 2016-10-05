package p_08_11_AuthoringSimpleLetter;

/**
 * Construct an object of the {@code Letter} class and
 * call {@code addLine} twice.
 */
public class LetterDemo
{

    public static void main(String[] args)
    {
        Letter letter = new Letter("Mary", "John");
        letter.addLine("I am sorry we must part.");
        letter.addLine("I wish you all the best.");

        System.out.println(letter.getText());
    }
}
