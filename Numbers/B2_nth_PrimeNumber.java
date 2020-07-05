/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */
//This program prints out the value of nth prime number.
package Numbers;

import java.util.Scanner;

public class B2_nth_PrimeNumber {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        int count = 0 ;
        System.out.println("Enter the size of a prime number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the value of n: ");
        int y = scanner.nextInt();

        int i = 2;
        while(count < x){
            if(isPrimeNumber( i )){
                count++;
                if(count == y ){
                    System.out.println("The value is "+i+".");
                }
                else if (y > x){
                    System.out.println("Out of the range.");
                }
            }
            i++;
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
