package p_04_24_monty_hall_paradox;

/**
 * The Monty Hall Paradox. Marylin vos Savant described the following problem
 * (loosely based on a game show hosted by Monty Hall) in a popular magazine:
 * "Suppose you're on a game show, and you're given the choice of three doors:
 * Behind on door is a car; behind the others, goats. You pick a door, say No.3,
 * which has a goat. He then says to you, "Do you want to pick the door No.2?"
 * Is it to your advantage to switch your choice?" Ms. vos Savant proved that
 * it is to your advantage, but many of her readers, including some mathematics
 * professors, disagreed, arguing that the probability would not change because
 * another door was opened. Your task is to simulate this game show. In each
 * iteration, randomly pick a door number between 1 and 3 placing the car.
 * Randomly have the player pick a door. Randomly have the game show host pick
 * a door having a goat (but not the door that the player picked). Increment
 * a counter for strategy 1 if the player wins by switching to the host's
 * choice, and increment a counter for strategy 2 if the player wins by sticking
 * with the original choice. Run 1,000 iterations and print both counters.
 */
public class MontyHallParadox
{
    public static void main(String[] args)
    {
        int randomCar; // randomly place a car behind one of three doors
        int randomPlayerOriginalPick; // player picks a door
        int playerToHostChoice; // player switches to host's choice
        int randomHostPick; // host picks a door with a goat
        int randomHostOffer; // host offers a player to pick another door
        int victoryPlayerToHost = 0; // Strategy 1 wins counter
        int victoryPlayerOriginal = 0; // Strategy 2 wins counter

        for (int i = 0; i < 1000; i++)
        {
            randomCar = (int) (Math.random() * 3) + 1;
            randomPlayerOriginalPick = (int) (Math.random() * 3) + 1;
            randomHostPick = (int) (Math.random() * 3) + 1;
            randomHostOffer = (int) (Math.random() * 3) + 1;

            if (!(randomHostPick == randomPlayerOriginalPick) && !(randomHostPick == randomCar) &&
                    !(randomHostOffer == randomPlayerOriginalPick) && !(randomHostOffer == randomHostPick))
            {
                playerToHostChoice = randomHostOffer;
                if (playerToHostChoice == randomCar)
                {
                    victoryPlayerToHost++;
                }
                if (randomPlayerOriginalPick == randomCar)
                {
                    victoryPlayerOriginal++;
                }
            }
        }
        System.out.printf("Strategy 1 wins: %d%n", victoryPlayerToHost);
        System.out.printf("Strategy 2 wins: %d%n", victoryPlayerOriginal);
    }
}
