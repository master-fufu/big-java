package p_08_22_Mailbox;

import java.util.ArrayList;

/**
 * Design a class {@code Mailbox} that stores e-mail messages, using the
 * {@code Message} class of Exercise P8.21. Implement the following methods:
 * <p><ul>
 * <li>{@code public void addMessage(Message m)}
 * <li>{@code public Message getMessage(int i)}
 * <li>{@code public void removeMessage(int i)}</ul>
 */
public class Mailbox
{
    private ArrayList<Message> messages;

    /**
     * Constructs a mailbox.
     */
    public Mailbox()
    {
        messages = new ArrayList<>();
    }

    /**
     * Adds message to mailbox.
     *
     * @param m the message
     */
    public void addMessage(Message m)
    {
        messages.add(m);
    }

    /**
     * Gets message from mailbox.
     *
     * @param i message current number in the mailbox
     * @return the message
     */
    public Message getMessage(int i)
    {
        return messages.get(i);
    }

    /**
     * Removes message from the mailbox.
     *
     * @param i message current number in the mailbox
     */
    public void removeMessage(int i)
    {
        messages.remove(i);
    }

}
