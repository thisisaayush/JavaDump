/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */
//This is also one way to reverse a number.
package Numbers;
import java.util.Scanner;

public class B4_Print_All_Digits_Of_a_Number {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        System.out.println("Number in digits: ");
        printDigit( n );
    }
    public static void printDigit(int num){
        while(num > 0){
            int rem = num % 10;
            System.out.print( rem +" ");
            num = num / 10;
        }
    }
}
