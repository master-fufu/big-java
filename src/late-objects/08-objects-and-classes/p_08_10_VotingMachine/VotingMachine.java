package p_08_10_VotingMachine;

/**
 * Implement a {@code VotingMachine} class that can be used for a simple
 * election. Have methods to clear the machine state, to vote for a Democrat,
 * to vote for a Republican, and to get the tallies for both parties.
 */
public class VotingMachine
{
    private int democratsVotes;
    private int republicansVotes;

    /**
     * Constructs {@code VotingMachine} object with votes values equal to zero.
     */
    public VotingMachine()
    {
        democratsVotes = 0;
        republicansVotes = 0;
    }

    /**
     * Adds 1 vote for Democrats.
     */
    public void voteDemocrat()
    {
        democratsVotes++;
    }

    /**
     * Adds 1 vote for Republicans.
     */
    public void voteRepublican()
    {
        republicansVotes++;
    }

    /**
     * Gets the number of votes for Democrats.
     *
     * @return number of votes, type of int
     */
    public int getDemocratsVotes()
    {
        return democratsVotes;
    }

    /**
     * Gets the number of votes for Republicans.
     *
     * @return number of votes, type of int
     */
    public int getRepublicansVotes()
    {
        return republicansVotes;
    }
}
