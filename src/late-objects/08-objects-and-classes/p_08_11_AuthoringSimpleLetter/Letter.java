package p_08_11_AuthoringSimpleLetter;

/**
 * Provide a class for authoring a simple letter. In the constructor, supply
 * the file of the sender and the recipient:
 * <p><pre>
 *      public Letter(String from, String to)</pre>
 * Supply a method
 * <p><pre>
 *      public void addLine(String line)</pre>
 * to add a line of text to the body of the letter. Supply a method
 * <p><pre>
 *      public String getText()</pre>
 * that returns the entire text of the letter. The text has the form:
 * <p><pre>
 *      Dear <em>recipient name:
 *      blank line
 *      first line of the body
 *      second line of the body
 *      . . .
 *      last line of the body
 *      blank line</em>
 *      Sincerely,
 *      <em>blank line
 *      sender name</em></pre>
 * Also supply a main method that prints this letter.
 * <p><pre>
 *      Dear John:
 *
 *      I am sorry we must part.
 *      I wish you all the best.
 *
 *      Sincerely,
 *
 *      Mary</pre>
 * Construct an object of the {@code Letter} class and call {@code addLine}
 * twice.
 */
public class Letter
{
    private String fromName;
    private String toName;
    private String line;

    /**
     * Constructs object type of {@code Letter} with file of sender and
     * recipient as parameters.
     *
     * @param from the name of sender, type of String
     * @param to   the name of recipient, type of String
     */
    public Letter(String from, String to)
    {
        fromName = from;
        toName = to;
        line = "";
    }

    /**
     * Adds a line to the body of the letter.
     *
     * @param line the line of the text
     */
    public void addLine(String line)
    {
        this.line += line + "\n";
    }

    /**
     * Gets all parts of the letter and puts them all together.
     *
     * @return returns the entire text of the letter
     */
    public String getText()
    {
        String result = "Dear " + toName + ":\n\n";
        result += line + "\n";
        result += "Sincerely,\n\n" + fromName;
        return result;
    }
}
