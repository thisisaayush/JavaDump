/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */
package Numbers;

import java.util.Scanner;

public class B6_Largest_Digit_Of_a_Number {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        largestDigit( num );
    }
    public static void largestDigit(int num){
        int max = Integer.MIN_VALUE;

       while (num > 0) {
           int temp = num % 10;
           num = num / 10;
           if (temp >= max) {
               max = temp;
           }
       }
        System.out.println("The largest digit of a given number is "+max+".");
    }
}
