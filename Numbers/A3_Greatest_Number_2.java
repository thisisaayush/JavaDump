//This code prints out largest number between two entered number.
package Numbers;

import java.util.Scanner;

public class A3_Greatest_Number_2 {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter your first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int y = scanner.nextInt();

        if(x > y){
            System.out.println(x + " is greater than " + y + ".");
        }
        else if(y > x){
            System.out.println(y + " is greater than " + x + ".");
        }
        else{
            System.out.println(x + " and " + y + " are equal." );
        }
        scanner.close();
    }
}
