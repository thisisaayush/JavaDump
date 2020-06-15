/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */
package Numbers;

import java.util.Scanner;

public class C5_PalindromeNumber {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        palindromeNumber(num);
    }

    public static void palindromeNumber(int num){
        int rem = 0;
        int reverse = 0;
        int temp = num;

        while(num > 0){
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        if(temp == reverse){
            System.out.println(temp + " is a palindrome.");
        }
        else {
            System.out.println( temp + " is not a palindrome." );
        }
    }
}
