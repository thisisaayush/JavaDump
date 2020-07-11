package Recursion;

public class R6_Fibonacci {
    static int x = 0;
    static int y = 1;
    static int count = 0;

    public static void main(String[] args) {
        fibonacci( 5 );
        System.out.println();
        for(int i = 0 ; i < 10 ; i++){
            System.out.print(fibonacciSeries( i ) + " ");
        }

    }

    public static void fibonacci(int num) {
        while (count <= num) {
            System.out.print( x + " " );
            int temp = x;
            x = y;
            y = x + temp;
            count++;
        }
    }

    public static int fibonacciSeries(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fibonacciSeries( num - 1 ) + fibonacciSeries( num - 2 );
    }
}
