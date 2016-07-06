package p_02_08_rectangle_perimeter_and_diagonal;

import java.util.Scanner;

/**
 * Write a program that asks the user for the lengths of the sides of a
 * rectangle. Then print:
 * <p><ul>
 * <li> The area and perimeter of the rectangle
 * <li> The length of the diagonal (use Pythagorean theorem).
 * </ul>
 */
public class RectanglePerimeterAndDiagonal
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Length of the a side: ");
        double a = in.nextDouble();
        System.out.print("Length of the b side: ");
        double b = in.nextDouble();

        double rectArea = a * b;
        System.out.printf("The area of rectangle with a = %.2f and b = %.2f is %.2f\n", a, b, rectArea);

        double rectPerimeter = (a + b) * 2;
        System.out.printf("The perimeter of rectangle with a = %.2f and b = %.2f is %.2f\n", a, b, rectPerimeter);

        double rectDiagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("The length of the diagonal with a = %.2f and b = %.2f is %.2f\n", a, b, rectDiagonal);
    }
}
