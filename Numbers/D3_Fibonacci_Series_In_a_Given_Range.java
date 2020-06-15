package Numbers;

import java.util.Scanner;

public class D3_Fibonacci_Series_In_a_Given_Range {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        System.out.println("Enter the beginning number: ");
        int begin = scanner.nextInt();
        System.out.println("Enter the ending number:");
        int end = scanner.nextInt();
        fibonacciSeries(begin,end);
    }
    public static void fibonacciSeries(int begin, int end){
        int x = 0 ;
        int y = 1 ;

        while(x <= end){
            int temp = x;
            x = y;
            y = x + temp;

            if( x >= begin && x <= end){
                System.out.print(x + " ");
            }
        }
    }
}
