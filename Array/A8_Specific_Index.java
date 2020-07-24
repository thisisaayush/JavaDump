//Print the value stored in an array for a given index.
package Array;
//The program prints out the element of a given index.
import java.util.Scanner;

public class A8_Specific_Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter an index: ");
        int index = scanner.nextInt();
        int[] array = {1,3,6,12,16,19,23,26,29,34,38,41};

        System.out.println("Elements at index " + index + " is " + array[index]);

    }
}
