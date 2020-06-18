/*
 * author: aayush thakuri
 * date: 5-28-2020
 *Prints out the second smallest number from n entered number.
 * */
package Numbers;

import java.util.Scanner;

public class A8_Second_Smallest_Number_Among_n_Numbers {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        int temp;
        int smallestNumber = Integer.MAX_VALUE;
        int secondSmallesNumber = Integer.MAX_VALUE;

        System.out.println("Enter total number of input: ");
        int x = scanner.nextInt();

        for(int i = 1 ; i <= x ; i++){
            System.out.println("Enter " + i + " number: ");
            temp = scanner.nextInt();

            if(temp <= smallestNumber){
                secondSmallesNumber = smallestNumber;
                smallestNumber = temp;
            }
            else if(temp <= secondSmallesNumber){
                secondSmallesNumber = temp;
            }
        }
        System.out.println("Second smallest number: "+secondSmallesNumber +".");
        scanner.close();
    }
}
