/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */

package Numbers;
//This programs prints out the reverse of a given number.
import java.util.Scanner;

public class C4_Reverse_a_Number {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        reverseNumber(num);
    }
    public static void reverseNumber(int num){
        int rem = 0;
        int reverse = 0;
        while (num > 0){
            rem = num % 10;
            reverse =  reverse * 10 + rem;
            num = num / 10;

        }
        System.out.println("Reversed number: " + reverse +".");
    }
}
