package p_06_02_tasks_for_an_array_of_integers;

import java.util.Arrays;

/**
 * Write array methods that carry out the following tasks for an array of
 * integers. For each method, provide a test program
 * <p>
 * a) Swap the first and the last elements in the array
 * <p>
 * b) Shift all elements by one to the right and move the last element into
 * the first position. For example, 1 4 9 16 25 would be transformed
 * into 25 1 4 9 16
 * <p>
 * c) Replace all even elements with 0
 * <p>
 * d) Replace each element except the first and last by the larger of its
 * two neighbours
 * <p>
 * e) Remove the middle element if the array length is odd, or the middle two
 * elements if the length is even
 * <p>
 * f) Move all even elements to the front, otherwise preserving the order
 * of the elements
 * <p>
 * g) Return the second-largest element in the array
 * <p>
 * h) Return true if the array is currently sorted in increasing order
 * <p>
 * i) Return true if the array contains two adjacent duplicate elements
 * <p>
 * j) Return true if the array contains duplicate elements (which need not
 * be adjacent)
 */
public class TasksForAnArrayOfIntegers
{
    public static void main(String[] args)
    {
        int[] arr = {0, 5, 15, 3, -9, 23, 7, 12, -2, 6};
        int[] random = randomArray();

        // Print initial array
        System.out.printf("%-35s", "Initial array");
        printArray(arr);

        // A) Print array with swapped first and last elements
        System.out.printf("%-35s", "a) The first and last swapped");
        printArray(swapFirstAndLast(arr));

        // B) Shift elements and move last element into the first position
        System.out.printf("%-35s", "b) Shift elements");
        printArray(shiftElements(arr));

        // C) Replace all even elements with 0
        System.out.printf("%-35s", "c) Replace even elements");
        printArray(replaceEven(arr));

        // D) Replace each element except the first and last by the larger of its
        // two neighbours
        System.out.printf("%-35s", "d) Replace by larger neighbour");
        printArray(replaceByNeighbour(arr));

        // E) Remove middle element
        System.out.printf("%-35s", "e) Remove middle element");
        printArray(removeMiddleElement(new int[]{0, 5, 15, 3, -9, 23, 7, 12, -2, 6}));

        // F) Move all even elements to the front, otherwise preserving the order
        // of the elements
        System.out.printf("%-35s", "f) Even elements to the front");
        printArray(moveEvenFront(new int[]{0, 5, 4, 3, -9, 23, 2, 12, -3, 6}));

        // G) Return the second-largest element in the array
        System.out.printf("%-35s", "g) Second largest element: ");
        System.out.println((secondLargest(new int[]{0, 5, 4, 3, -9, 23, 2, 12, -3, 6})));

        // H) Return true if the array is currently sorted in increasing order
        System.out.printf("%-35s", "h) Array is in increasing order: ");
        System.out.println((isIncreasing(new int[]{0, 5, 4, 3, -9, 23, 2, 12, -3, 6})));
        System.out.printf("%-35s", "h) Array is in increasing order: ");
        System.out.println((isIncreasing(new int[]{-9, -3, 0, 2, 3, 4, 5, 6, 12, 23})));

        // I) Return true if the array contains two adjacent duplicate elements
        System.out.printf("%-35s", "i) Has two adjacent duplicates: ");
        System.out.println((hasAdjacentDuplicates(new int[]{0, 5, 4, 3, -9, 23, 2, 12, -3, 6})));

        // J) Return true if the array contains duplicate elements (which need
        // not be adjacent)
        System.out.printf("%-35s", "j) Contains duplicates: ");
        System.out.println((containsDuplicates(new int[]{0, 5, 4, 3, -9, 23, 2, 12, -3, 6})));
    }

    /**
     * This method returns true if array contains duplicate elements.
     * Elements need not be adjacent.
     *
     * @param A array, type of int
     * @return TRUE or FALSE
     */
    public static boolean containsDuplicates(int[] A)
    {
        for (int i = 0; i < A.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (A[i] == A[j])
                {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * This method returns true if array has two adjacent duplicates
     *
     * @param A array, type of int
     * @return TRUE if array has two adjacent duplicates
     */
    public static boolean hasAdjacentDuplicates(int[] A)
    {
        int i = 1;
        int j = 0;

        while (i < A.length)
        {
            if (A[i] == A[j])
            {
                return true;
            }
            i++;
            j++;
        }
        return false;
    }

    /**
     * This method checks if the array is currently sorted in increasing order
     *
     * @param A array, type of int
     * @return TRUE if array sorted in increasing order
     */
    public static boolean isIncreasing(int[] A)
    {
        for (int i = 0; i < A.length - 1; i++)
        {
            if (A[i] > A[i + 1])
            {
                return false;
            }
        }
        return true;
    }

    /**
     * This method finds second largest element in the array
     *
     * @param A array, type of int
     * @return integer
     */
    public static int secondLargest(int[] A)
    {
        int largest = A[0];
        int secondLargest = A[0];

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] > largest)
            {
                secondLargest = largest;
                largest = A[i];
            }
            else if (A[i] > secondLargest)
            {
                secondLargest = A[i];
            }
        }
        return secondLargest;
    }

    /**
     * This method moves all even elements to the front, otherwise preserving
     * the order of the elements
     *
     * @param A array, type of int
     * @return array
     */
    public static int[] moveEvenFront(int[] A)
    {
        int pos = 0;
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] % 2 == 0)
            {
                for (int j = i; j > pos; j--)
                {
                    int temp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = temp;
                }
                pos++;
            }
        }
        return A;
    }

    /**
     * This method removes the middle element if the array length is odd, or
     * the middle two elements if the length is even
     *
     * @param A array, type of int
     * @return array
     */
    public static int[] removeMiddleElement(int[] A)
    {
        int pos;
        int size = A.length;

        if (A.length % 2 == 0)
        {
            pos = size / 2 - 1;
            for (int i = pos + 2; i < size; i++)
            {
                A[i - 2] = A[i];
            }
            size -= 2;
        }
        else
        {
            pos = size / 2;
            for (int i = pos + 1; i < size; i++)
            {
                A[i - 1] = A[i];
            }
            size--;
        }
        int[] B = Arrays.copyOf(A, size);
        return B;
    }

    /**
     * This method replaces each element except the first and last by the
     * larger of its two neighbours
     *
     * @param A array, type of int
     * @return array
     */
    public static int[] replaceByNeighbour(int[] A)
    {
        for (int i = 1; i < A.length - 1; i++)
        {
            if (A[i - 1] > A[i + 1])
            {
                A[i] = A[i - 1];
            }
            else if (A[i + 1] > A[i - 1])
            {
                A[i] = A[i + 1];
            }
        }
        return A;
    }

    /**
     * This method replaces all even elements with zero
     *
     * @param A array, type of int
     * @return array
     */
    public static int[] replaceEven(int[] A)
    {
        for (int i = 0; i < A.length; i++)
        {
            if (i % 2 == 0)
            {
                A[i] = 0;
            }
        }
        return A;
    }

    /**
     * This method shifts all elements by one to the right and move the last
     * element into the first position.
     *
     * @param A array, type of int
     * @return array, type of int
     */
    public static int[] shiftElements(int[] A)
    {
        int lastIntoFirst = A[A.length - 1];

        for (int i = A.length - 1; i > 0; i--)
        {
            A[i] = A[i - 1];
        }
        A[0] = lastIntoFirst;

        return A;
    }

    /**
     * This method swaps the first and the last elements in the array
     *
     * @return array, type of int
     */
    public static int[] swapFirstAndLast(int[] A)
    {
        int temp = A[0];
        A[0] = A[A.length - 1];
        A[A.length - 1] = temp;

        return A;
    }

    /**
     * This method initializes array with random values
     *
     * @return array, type of int
     */
    public static int[] randomArray()
    {
        int[] A = new int[10];
        for (int i = 0; i < A.length; i++)
        {
            // random integers from 1 to 10
            A[i] = (int) (Math.random() * 10 + 1);
        }
        return A;
    }

    /**
     * This method prints an array
     *
     * @param A array, type of int
     */
    public static void printArray(int[] A)
    {
        for (int el : A)
        {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
