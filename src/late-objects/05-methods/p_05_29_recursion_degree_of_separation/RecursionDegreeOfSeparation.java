package p_05_29_recursion_degree_of_separation;

import java.util.Scanner;

/**
 * In a social networking service, a user has friends, the friends have other
 * friends, and so on. We are interested in knowing how many people can be
 * reached from a person by following a given number of friendship relations.
 * This number is called the "degree of separation": one for friends, two for
 * friends of friends, and so on. Because we do not have the data from an actual
 * social network, we simply use an average of the number of friends per user.
 * Write a recursive method:
 * <p><pre>
 *      public static double reachablePeople(int degree, double averageFriendsPerUser)</pre>
 * Use that method in a program that prompts the user for the desired degree
 * and average, and then prints the number of reachable people. This number
 * should include the original user.
 */
public class RecursionDegreeOfSeparation
{
    public static void main(String[] args)
    {
        int average = input("Enter average of the number of friends per user: ");
        int degree = input("Enter value for degree of separation: ");

        System.out.printf("%.0f is the number of reachable people: ", reachablePeople(degree, average));
    }

    /**
     * The method calculates recursively the number of reachable people
     * following given degree of separation. The formula for calculation is
     * n^0 + n^1 + n^2 + n^3 + ... + n^k, where n is number of links (friends)
     * for one person and k is the degree of separation (friends, friends of
     * friends, friends of friends of friends and so on). For example,
     * if n = 3 and k = 3 the result is 3^0 + 3^1 + 3^2 + 3^3 = 40. If original
     * user does not need to be included, than return 0 if degree == 0.
     *
     * @param degree                degree of separation, type of int
     * @param averageFriendsPerUser average number of friends per user, type of int
     * @return number of reachable people including original user, type of int
     */
    public static double reachablePeople(int degree, int averageFriendsPerUser)
    {
        if (degree == 0)
        {
            return 1;
        }
        return ((Math.pow(averageFriendsPerUser, degree)) + reachablePeople(degree - 1, averageFriendsPerUser));
    }

    /**
     * The method prompts user for input and returns integer to the calling method.
     *
     * @param prompt String
     * @return integer
     */
    public static int input(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextInt();
    }
}
