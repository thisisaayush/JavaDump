package Numbers;

import java.util.Scanner;
//This program prints out the factorial of a given positive number using for loop.
public class E2_Factorial_Using_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter the limit: ");
        int n = scanner.nextInt();
        int fact = 1 ;

        for(int i = 1 ; i <= n ; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + " is " + fact+".");
        scanner.close();
    }
}
