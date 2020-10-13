/*
 * author: aayush thakuri
 * date: 5-28-2020
 * Checks whether the entered number is prime number or not.
 * */
package Numbers;

import java.util.Scanner;

public class A9_Is_n_PrimeNumber {
    private static Scanner scanner = new Scanner( System.in);

    public static void main(String[] args) {
        boolean result = true;
        System.out.println("Enter number: ");
        int num = scanner.nextInt();//Takes input from user.

        for(int i = 2 ; i <= num / 2 ; i++){
            if(num % i == 0) //Checks if the number is divisible by i  or not.
            {
                result = false;//if the above condition is met then it returns false result- which implies not a prime number
            }
        }
        if(result)//if result is true, it prints out num as a prime number.
        {
            System.out.println( num + " is a prime number.");
        }
        else//otherwise, prints out as not a prime number.
        {
            System.out.println(num + " is not a prime number.");
        }
    }
}
