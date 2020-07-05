/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */
//Doesn't work in a number that has largest digits repeated.
//This program prints out the largest and second largest digits of a given number.
package Numbers;

import java.util.Scanner;

public class B8_Largest_And_Second_Largest_Number {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();
        largestSecondLargestNumber( x );
    }
    public static void largestSecondLargestNumber(int num){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int temp = 0;

        while (num > 0){
            temp = num % 10;

            if(temp > max){
                secondMax = max;
                max = temp;
            }
            else if(temp > secondMax){
                secondMax = temp;
            }
            num = num / 10;
        }
        System.out.println("Largest digit: " + max + ".");
        System.out.println("Second largest digit: " + secondMax + ".");

    }
}
