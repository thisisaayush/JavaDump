//The program find the sum and average of all elements in a given array.
package Array;

import java.util.Scanner;

public class A10_Sum_And_Average_Of_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter the size of an array: ");
        int n = scanner.nextInt();

        int array[] = new int[n];

        for(int i = 0 ; i < array.length ; i++){
            System.out.println("Enter element " + i + ": ");
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i = 0 ; i < array.length ; i++){
            sum = sum + array[i];
        }
        int average = sum / n;
        System.out.println();
        System.out.println("Sum: " + sum + "\nAverage: " + average);
    }
}
