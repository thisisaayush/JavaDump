/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */
package Numbers;

import java.util.Scanner;

public class B7_Smallest_Digit_Of_a_Number {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        smallestDigit( num );
    }
    public static void smallestDigit(int num){
        int min = Integer.MAX_VALUE;

        while(num > 0) {
            int temp = num % 10;
            num = num / 10;
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println("The smallest digit of a given number is "+min+".");
    }
}
