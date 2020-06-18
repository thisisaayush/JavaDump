//Prints out the smallest of three entered numbers.
package Numbers;

import java.util.Scanner;

public class A4_Smallest_Number_3 {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int y = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int z = scanner.nextInt();

        if(x < y && x < z ){
            System.out.println(x + " is the smallest number.");
        } else if (y < x && y < z){
            System.out.println(y + " is the smallest number.");
        }
        else{
            System.out.println(z + " is the smallest number.");
        }
        scanner.close();
    }
}
