package p_08_10_VotingMachine;

/**
 * {@code VotingMachine} demo.
 * <p>
 * Implement a {@code VotingMachine} class that can be used for a simple
 * election. Have methods to clear the machine state, to vote for a Democrat,
 * to vote for a Republican, and to get the tallies for both parties.
 */
public class VotingMachineDemo
{
    public static void main(String[] args)
    {
        VotingMachine votingMachine = new VotingMachine();

        votingMachine.voteDemocrat();
        votingMachine.voteDemocrat();
        votingMachine.voteDemocrat();
        votingMachine.voteDemocrat();

        votingMachine.voteRepublican();
        votingMachine.voteRepublican();
        votingMachine.voteRepublican();
        votingMachine.voteRepublican();
        votingMachine.voteRepublican();

        System.out.println("Democrats votes: " + votingMachine.getDemocratsVotes());

        System.out.println("Republicans votes: " + votingMachine.getRepublicansVotes());
    }
}
