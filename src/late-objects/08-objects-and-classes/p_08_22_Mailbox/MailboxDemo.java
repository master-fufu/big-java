package p_08_22_Mailbox;

/**
 * {@code Mailbox} class demo.
 */
public class MailboxDemo
{
    public static void main(String[] args)
    {
        Mailbox mailbox = new Mailbox();

        Message message1 = new Message("Mr. Jones", "Mr. Freeman");
        message1.append("Dear Mr. Freeman,");
        message1.append("nice to meet you.");
        message1.append("Goodbye!");
        mailbox.addMessage(message1);

        Message message2 = new Message("Mr. Freeman", "Mr. Jones");
        message2.append("Cheers mate!");
        mailbox.addMessage(message2);

        System.out.println(mailbox.getMessage(0));
        System.out.println(mailbox.getMessage(1));
    }
}
