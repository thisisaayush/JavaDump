/*
 * author: aayush thakuri
 * date: 5-30-2020
 *
 * */
package Numbers;

import java.util.Scanner;

public class D1_Fibonacci_Series_Recursion {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        System.out.println("Enter the limit: ");
        int num = scanner.nextInt();
        System.out.print(0 + " ");
        for(int i = 0 ; i <= num ; i++) {
            System.out.print( fibonacciSeries( i ) + " " );
        }
    }
    public static int fibonacciSeries(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        else {
            return fibonacciSeries( num - 1 ) + fibonacciSeries( num - 2 );
        }
    }
}
