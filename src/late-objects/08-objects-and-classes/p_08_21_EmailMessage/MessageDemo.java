package p_08_21_EmailMessage;

/**
 * {@code Message} class demo.
 */
public class MessageDemo
{
    public static void main(String[] args)
    {
        Message message = new Message("Harry Potter", "Mr. Freeman");

        message.append("Dear Mr. Freeman,");
        message.append("nice to meet you.");
        message.append("Goodbye!");

        System.out.println(message.toString());
    }
}
