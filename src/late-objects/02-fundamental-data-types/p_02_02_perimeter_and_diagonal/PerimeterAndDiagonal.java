package p_02_02_perimeter_and_diagonal;

/**
 * Write a program that computes and displays the perimeter of a letter-size
 * (8.5 x 11 inches) sheet of paper and the length of its diagonal.
 */
public class PerimeterAndDiagonal
{
    public static void main(String[] args)
    {
        double letterLength = 8.5;
        int letterHeight = 11;

        double perimeter = letterLength * 2 + letterHeight * 2;
        System.out.print("Perimeter is ");
        System.out.println(perimeter + " inches");

        double diagonal = Math.sqrt(letterLength * letterLength + letterHeight * letterHeight);
        System.out.print("Diagonal equals ");
        System.out.printf("%.2f\n", diagonal);
    }
}
