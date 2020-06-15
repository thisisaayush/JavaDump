/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */
package Numbers;

import java.util.Scanner;

public class C3_Specific_Digit {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
         searchDigit( num );
    }

    public static void searchDigit(int num){
        System.out.println("Enter a digit to be searched: ");
        int digit = scanner.nextInt();

        int rem = 0;

        while(num > 0){
            rem = num % 10;
            if(digit == rem){
                System.out.println(digit + " is found.");
                break;//May be same digit can be found more than once. So, breaking the loop in the first occurrence.
            }
            num = num / 10;
        }
        if(digit != rem){
            System.out.println("Digit "+ digit + " is not found.");
        }
    }
}
