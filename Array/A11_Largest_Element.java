//The program finds the largest element in a given int array.
package Array;

import java.util.Scanner;

public class A11_Largest_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter the size of an array: ");
        int n = scanner.nextInt();

        int array[] = new int[n];

        for(int i = 0 ; i < array.length ; i++){
            int x = i + 1;
            System.out.println("Enter element " + x + ": ");
            array[i] = scanner.nextInt();
        }

        int max =  Integer.MIN_VALUE;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] >= max){
                max = array[i];
            }
        }
        System.out.println("The largest element is " + max + ".");
    }
}
