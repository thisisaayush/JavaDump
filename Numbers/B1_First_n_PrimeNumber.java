/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */
package Numbers;

import java.util.Scanner;

public class B1_First_n_PrimeNumber {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        int count = 0 ;
        System.out.println("Enter the size of prime number: ");
        int x = scanner.nextInt();

        int i = 2;
        System.out.println("First "+x +" prime numbers are: ");
        while(count < x){
            if(isPrimeNumber( i )){
                System.out.print(i+" ");
                count++;
            }
            i++;
            //else statement is here for non-prime numbers which is not essential to mention.
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
