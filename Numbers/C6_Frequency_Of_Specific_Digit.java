/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */
package Numbers;
//This program counts the number of times the specific number is repeated and prints out the frequency. 
import java.util.Scanner;

public class C6_Frequency_Of_Specific_Digit {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        frequencyOfDigit(num);
    }

    public static void frequencyOfDigit(int num){
        int rem = 0;
        int count = 0;

        System.out.println("Enter a digit: ");
        int digit = scanner.nextInt();

        while(num > 0){
            rem = num % 10;

            if(digit == rem){
                count++;
            }
            num = num / 10;
        }
        System.out.println(digit + " digit occurs " + count + " times.");
    }
}
