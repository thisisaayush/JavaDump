//Prints out the second greatest number of n entered number.
package Numbers;

import java.util.Scanner;

public class A6_Second_Greatest_Number_Among_n_Numbers {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        int temp;
        int greatestNumber = Integer.MIN_VALUE;
        int secondGreatestNumber  = Integer.MIN_VALUE;
        System.out.println("Enter total number of input: ");
        int x = scanner.nextInt();

        for(int i = 1 ; i <= x ; i++){
            System.out.println("Enter " + i + " number: ");
            temp = scanner.nextInt();

            if(temp >= greatestNumber){
                secondGreatestNumber = greatestNumber;
                greatestNumber = temp;
            }
            else if(temp >= secondGreatestNumber){
                secondGreatestNumber = temp;
            }
        }
        System.out.println("Second largest number is "+ secondGreatestNumber+".");
        scanner.close();
    }
}
