package p_02_12_file_names_and_extensions;

import java.util.Scanner;

/**
 * Write a program that prompts the user for the drive letter ({@code C}), the
 * path ({@code \Windows\System}), the file name ({@code Readme}), and the
 * extension ({@code txt}). Then print the complete file name
 * {@code C:\Windows\System\Readme.txt}. If you have UNIX or a Macintosh, skip
 * the drive name and use / instead of \ to separate directories.
 */
public class FileNamesAndExtensions
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the path: ");
        String path = in.next();
        System.out.print("Enter the file name: ");
        String fileName = in.next();
        System.out.print("Enter the extension: ");
        String ext = in.next();

        System.out.print(path + "/" + fileName + "." + ext + "\n");
    }
}
