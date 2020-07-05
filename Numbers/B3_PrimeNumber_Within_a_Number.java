/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */
//This program prints out the value of prime numbers for the given range.
package Numbers;

import java.util.Scanner;

public class B3_PrimeNumber_Within_a_Number {
    private static Scanner scanner = new Scanner( System.in);
    public static void main(String[] args) {
        System.out.println("Enter the beginning number: ");
        int first = scanner.nextInt();
        System.out.println("Enter the ending number: ");
        int last = scanner.nextInt();
        System.out.println("Prime numbers within the given numbers: ");
            for(int i = first ; i <= last ; i++){
                if(isPrimeNumber( i )){
                    System.out.print(i + " ");
                }
            }
    }
    public static boolean isPrimeNumber(int num){
        for(int i = 2 ; i <= num / 2 ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
