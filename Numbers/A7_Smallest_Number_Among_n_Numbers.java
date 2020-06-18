//Prints out the smallest number from n entered number.
package Numbers;

import java.util.Scanner;

public class A7_Smallest_Number_Among_n_Numbers {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        int temp;
        int smallest = Integer.MAX_VALUE;
        System.out.println("Enter total number of input: ");
        int x = scanner.nextInt();

        for(int i = 1 ; i <= x ; i++){
            System.out.println("Enter " + i + " number: ");
            temp = scanner.nextInt();

            if(temp <= smallest){
                smallest = temp;
            }
        }
        System.out.println("Smallest number is "+smallest +".");
        scanner.close();
    }
}
