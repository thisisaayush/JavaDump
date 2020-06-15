package Numbers;

import java.util.Scanner;

public class D6_Last_Fibonacci_Number___Not_Done {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        lastFibonacciNumber(num);
    }

    public static void lastFibonacciNumber(int num){
        int x = 0 ;
        int y = 1 ;
        int last = 0;
        while(x <= num){

            last = x;
            int temp = x;
            x = y;
            y = x;

        }
        System.out.println("The last fibonacci number is " + last + ".");
    }
}
