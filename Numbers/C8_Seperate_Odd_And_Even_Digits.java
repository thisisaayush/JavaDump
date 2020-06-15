/*
 * author: aayush thakuri
 * date: 5-30-2020
 *
 * */
package Numbers;

import java.util.Scanner;

public class C8_Seperate_Odd_And_Even_Digits {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        evenOddDigits( num );
    }
    public static void evenOddDigits(int num){
        int even = 0 ;
        int odd = 0 ;
        int rem = 0 ;

        while (num > 0){
            rem = num % 10;

            if(rem % 2 == 0){
                even = even * 10 + rem;
            }
            else{
                odd = odd * 10 + rem;
            }
            num = num / 10;
        }
        System.out.println("Even digits: " + even +".");
        System.out.println("Odd digits: " + odd +".");
    }
}
