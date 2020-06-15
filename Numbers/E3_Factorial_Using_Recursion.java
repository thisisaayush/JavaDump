package Numbers;

import java.util.Scanner;

public class E3_Factorial_Using_Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("The factorial of " + num + " is " + factorial(num) + ".");
    }
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        return num * factorial( num - 1 );
    }
}
