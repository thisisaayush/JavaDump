package Numbers;

import java.util.Scanner;

public class D5_Nth_Fibonacci_Number {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter the nth number: ");
        int nth = scanner.nextInt();

        nthFibonacciNumber(nth);
    }
    public static void nthFibonacciNumber(int nth){
        int x = 0 ;
        int y = 1 ;
        int count = 1;

        while(count  <= nth){

            int temp = x;
            x = y ;
            y = x + temp;
            count++;
            if(count  == nth){
                System.out.println("The value of " + nth + " th fibonacci series is " + y + "." );
            }
        }

    }
}
