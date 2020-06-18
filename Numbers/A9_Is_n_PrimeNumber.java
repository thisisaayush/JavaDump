/*
 * author: aayush thakuri
 * date: 5-28-2020
 * Checks whether the entered number is prime number or not.
 * */
package Numbers;

import javax.print.attribute.standard.NumberUp;
import java.util.Scanner;

public class A9_Is_n_PrimeNumber {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        boolean result = true;
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        for(int i = 2 ; i <= num / 2 ; i++){
            if(num % i == 0) {
                result = false;
            }
        }
        if(result){
            System.out.println( num + " is a prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
        }
    }
}
