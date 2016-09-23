package bigJava_06_ArraysAndArrayLists;

import java.util.Scanner;

/**
 * A theater seating chart is implemented as a two-dimensional array of
 * ticket prices, like this:
 * <p><pre>
 *      10 10 10 10 10 10 10 10 10 10
 *      10 10 10 10 10 10 10 10 10 10
 *      10 10 10 10 10 10 10 10 10 10
 *      10 10 20 20 20 20 20 20 10 10
 *      10 10 20 20 20 20 20 20 10 10
 *      10 10 20 20 20 20 20 20 10 10
 *      20 20 30 30 40 40 30 30 20 20
 *      20 30 30 40 50 50 40 30 30 20
 *      30 40 50 50 50 50 50 50 40 30</pre>
 * Write a program that prompts users to pick either a seat or a price. Mark
 * sold seats by changing the price to 0. When a user specifies a seat, make
 * sure it is available. When a user specifies a price, find any seat with
 * that price.
 */
public class SellTicketBySeatOrPrice
{
    public static void main(String[] args)
    {
        int[][] seatChart = seatingChartByPrice();

        String userChoice = userChoice("Please type 'seat' or 'price' " +
                "to buy ticket: ");

        if (isSeat(userChoice))
        {
            seatChart = bookSeat(seatChart, seatIsCorrect(inputNumber("Enter" +
                    " seat number (1 to 90): ")));

            printArray(seatChart);
        }
        else if (isPrice(userChoice))
        {
            seatChart = bookPrice(seatChart, priceIsCorrect(inputNumber("Enter" +
                    "price (10, 20, 30, 40, 50): ")));

            printArray(seatChart);
        }
        else
        {
            System.out.println("Error. Please type 'seat' or 'price'.");
        }
    }

    /**
     * Book tickets by price. The method traverses 2D array and if any of the
     * pre-arranged price tags (10, 20, 30, 40, 50) is found, then the value
     * of the array element with the price is set to zero. Then user is
     * prompted to book another ticket or quit, if user chooses to book
     * another ticket, then i and j indexes are set to zero, so 2D-array can
     * be traversed again starting from the A[0][0].
     *
     * @param A seating chart, 2D-array
     * @param n user input, seat price, type of int
     * @return seating chart with seats booked, 2D-array
     */
    public static int[][] bookPrice(int[][] A, int n)
    {
        for (int i = 0; i < A.length; i++)
        {
            for (int j = 0; j < A[0].length; j++)
            {
                if (A[i][j] == n)
                {
                    A[i][j] = 0;

                    if (nextTicket("Next ticket? (y/n): "))
                    {
                        n = seatIsCorrect(inputNumber("Enter price: "));
                        i = 0;
                        j = 0;
                    }
                    else
                    {
                        return A;
                    }
                }
            }
        }
        return A;
    }

    /**
     * Book tickets by a seat number. The method takes 2D-array and an
     * integer representing seat number as an input. Seat number is then
     * divided by 10 to get the row number and modulo operation to find
     * a column number. When row and column are found, A[row][col] value is
     * assigned to zero, to represent that the seat is booked.
     *
     * @param A seats chart, 2D-array
     * @param n seat number, type of int
     * @return seating chart, 2D-array
     */
    public static int[][] bookSeat(int[][] A, int n)
    {
        int row = (n - 1) / 10;
        int col = (n - 1) % 10;
        A[row][col] = 0;
        printArray(A);

        for (int i = 1; i < A.length * A[0].length; i++)
        {
            if (nextTicket("Next ticket? (y/n): "))
            {
                n = seatIsAvailable(A, seatIsCorrect(inputNumber(
                        "Enter another seat number: ")));

                row = (n - 1) / 10;
                col = (n - 1) % 10;

                A[row][col] = 0;

                printArray(A);
            }
            else
            {
                return A;
            }
        }
        return A;
    }

    /**
     * This method checks if seat is available for booking, e.g. its value
     * not equal to zero, which would mean that the seat is already booked.
     *
     * @param A 2D-array of seats
     * @param n seat number
     * @return TRUE if seat is not equal to zero
     */
    public static int seatIsAvailable(int[][] A, int n)
    {
        int row = (n - 1) / 10;
        int col = (n - 1) % 10;

        while (A[row][col] == 0)
        {
            n = seatIsCorrect(inputNumber("Sorry, this seat has been " +
                    "booked! Try another one: "));
            row = (n - 1) / 10;
            col = (n - 1) % 10;
        }
        return n;
    }

    /**
     * The method prompts user to buy one more ticket.
     *
     * @param prompt String
     * @return TRUE if user's input equals "y"
     */
    public static boolean nextTicket(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.next().equalsIgnoreCase("y");
    }

    /**
     * The method checks if user's choice equals to "price".
     *
     * @param s user's input, type of String
     * @return TRUE if argument equals "price"
     */
    public static boolean isPrice(String s)
    {
        return s.equalsIgnoreCase("price");
    }

    /**
     * The method checks if user's choice equals to "seat".
     *
     * @param s user's input, type of String
     * @return TRUE if argument equals "seat"
     */
    public static boolean isSeat(String s)
    {
        return s.equalsIgnoreCase("seat");
    }

    /**
     * The method checks if the number falls into range from 1 to 90.
     *
     * @param n seat number, int
     * @return user input, any number from 1 to 90 inclusive
     */
    public static int seatIsCorrect(int n)
    {
        while (n < 1 || n > 90)
        {
            n = inputNumber("Re-enter seat number (1 to 90): ");
        }
        return n;
    }

    /**
     * The method checks if user entered price corresponds to the price
     * provided in seating chart.
     *
     * @param n user input, type of int
     * @return correct price
     */
    public static int priceIsCorrect(int n)
    {
        while (n != 10 && n != 20 && n != 30 && n != 40 && n != 50)
        {
            n = inputNumber("Re-enter price: ");
        }
        return n;
    }

    /**
     * This method prompts user for integer input and returns an integer to
     * the calling method.
     *
     * @param prompt String
     * @return integer
     */
    public static int inputNumber(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextInt();
    }

    /**
     * The method prompts user to choose to buy a ticket by a price or seat
     * number. When user made a choice, it will call appropriate method to
     * complete purchase.
     *
     * @param prompt String
     */
    public static String userChoice(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.next().toLowerCase();
    }

    /**
     * Initialise seating chart.
     *
     * @return 2D-array, type of int
     */
    public static int[][] seatingChartByPrice()
    {
        int[][] seats = {
                {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
                {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
                {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
                {20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
                {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
                {30, 40, 50, 50, 50, 50, 50, 50, 40, 30},
        };
        return seats;
    }

    /**
     * Prints a 2D-array.
     *
     * @param A 2D-array, type of int
     */
    public static void printArray(int[][] A)
    {
        for (int[] subA : A)
        {
            for (int el : subA)
            {
                System.out.printf("%2d ", el);
            }
            System.out.println();
        }
    }
}
