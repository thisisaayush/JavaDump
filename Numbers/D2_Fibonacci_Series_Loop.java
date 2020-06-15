package Numbers;

import java.util.Scanner;

public class D2_Fibonacci_Series_Loop {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        System.out.println("Enter the limit: ");
        int num = scanner.nextInt();
        fibonacciSeries( num );
    }
    public static void fibonacciSeries(int num){
        int x = 0 ;
        int y = 1 ;

        for(int i = 0 ; i <= num ; i++){
            System.out.print(x + " ");
            int temp = x;
            x = y;
            y = temp + x;
        }
    }
}
