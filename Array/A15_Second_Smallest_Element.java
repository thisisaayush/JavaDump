//Find out the second smallest element in a given array.
package Array;

import java.util.Scanner;

public class A15_Second_Smallest_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter the size of an array: ");
        int n = scanner.nextInt();

        int array[] = new int[n];

        for(int i = 0 ; i < array.length ; i++){
            System.out.println("Enter element " + i + ": ");
            array[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for(int i = 0 ; i < array.length ; i++){
            if(min >= array[i]){
                secMin = min;
                min = array[i];
            }
            else if(secMin >= array[i]){
                secMin = array[i];
            }
        }
        System.out.println("Second smallest element: " + secMin);
    }
}
