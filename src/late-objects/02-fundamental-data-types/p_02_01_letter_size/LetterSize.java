package p_02_01_letter_size;

/**
 * Write a program that displays the dimensions of a letter-size
 * (8.5 x 11 inches) sheet of paper in millimetres. There are] 25.4
 * millimetres per inch. Use constants and comments in your program.
 */
public class LetterSize
{
    public static void main(String[] args)
    {
        double letterLength = 8.5;
        int letterHeight = 11;
        final double MM_PER_INCH = 25.4;

        System.out.print("8.5 x 11 inches letter size in millimeters is ");
        System.out.printf("%.2f", (letterLength * MM_PER_INCH));
        System.out.print(" x ");
        System.out.printf("%.2f\n", (letterHeight * MM_PER_INCH));
    }
}
