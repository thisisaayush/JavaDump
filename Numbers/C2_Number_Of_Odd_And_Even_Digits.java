/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */
package Numbers;

import java.util.Scanner;

public class C2_Number_Of_Odd_And_Even_Digits {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        oddEvenDigits(num);
    }
    public static void oddEvenDigits(int num){
        int rem = 0;
        int even = 0;
        int odd = 0;
        while(num > 0){
            rem = num % 10;

            if(rem % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
            num = num / 10;
        }
        System.out.println("Number of even digits: " + even + ".");
        System.out.println("Number of odd digits: " + odd + ".");
    }
}
