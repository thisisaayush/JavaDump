/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */
//This program sum up all the digit of a number and returns the final sum value.
package Numbers;

import java.util.Scanner;

public class B5_Sum_Of_Digits_Of_a_Number {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();
        sum(x);
    }
    public static void sum(int num){
        int sum = 0 ;
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of the digits: \n"+sum);
    }
}
