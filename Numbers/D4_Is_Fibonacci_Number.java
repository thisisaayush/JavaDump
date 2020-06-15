package Numbers;

import java.util.Scanner;

public class D4_Is_Fibonacci_Number {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
       if (isFibonacciNumber( num )){
           System.out.println(num + " is a fibonacci number.");
       }
       else{
           System.out.println(num + " is not a fibonacci number.");
       }
    }
    public static boolean isFibonacciNumber(int num){
        int x = 0 ;
        int y = 1 ;

        while(x <= num){

            int temp = x ;
            x = y ;
            y = x + temp;

            if(x == num){
                return true;
            }

        }
        return false;
    }
}
