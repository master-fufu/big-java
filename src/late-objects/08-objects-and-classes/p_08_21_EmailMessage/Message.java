package p_08_21_EmailMessage;

/**
 * Design a class {@code Message} that models an e-mail message. A message has a
 * recipient, a sender, and a message text. Support the following methods:
 * <ul>
 * <li>A constructor that takes the sender and recipient</li>
 * <li>A method {@code append} that appends a line of text to the message body</li>
 * <li>A method {@code toString} that makes the message into one long string
 * like this: {@code "From: Harry Morgan\nTo: Rudolf Reindeer\n . . ."}</li>
 * </ul>
 * Write a program that uses this class to make a message and print it.
 */
public class Message
{
    private String sender;
    private String recipient;
    private String body;

    /**
     * Constructs object {@code Message} with sender and recipient parameters.
     *
     * @param sender    sender name
     * @param recipient recipient name
     */
    public Message(String sender, String recipient)
    {
        this.sender = sender;
        this.recipient = recipient;
        body = "";
    }

    /**
     * Appends line of text to the message body.
     *
     * @param line line of text
     */
    public void append(String line)
    {
        body += line + "\n";
    }

    /**
     * Makes the message into one long line.
     *
     * @return whole email message
     */
    public String toString()
    {
        return "From: " + sender + "\nTo: " + recipient + "\n\n" + body;
    }
}
