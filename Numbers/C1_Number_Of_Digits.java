/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */
package Numbers;
//This program prints out the total number of digits of a given number.
import java.util.Scanner;

public class C1_Number_Of_Digits {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        numberOfDigits( num );
    }
    public static void numberOfDigits(int num){

        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        System.out.println("Total number of digits: " + count + ".");
    }
}
