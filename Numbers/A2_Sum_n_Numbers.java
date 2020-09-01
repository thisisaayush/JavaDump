package Numbers;

import java.util.Scanner;
//The program prints the sum of input.
public class A2_Sum_n_Numbers {
    private static Scanner scanner = new Scanner( System.in );//Allows programer to use anywhere in the class.
    public static void main(String[] args) {
        System.out.println("Enter total number of input: ");//Ask user for the total number of input.
        int x = scanner.nextInt();//Takes the total input from the user.

        double sum = 0;//Initializing the value of sum to zero before performing the summation. 
        double temp;

        for(int i = 1 ; i <= x ; i++){
            System.out.println("Enter " + i +" input: ");//Ask user to input the value.
            temp = scanner.nextDouble();//Takes input from ther user.
            sum += temp;//Adding process for the input number is executed here.
        }
        System.out.println("Total sum is " + sum + ".");//Prints the total sum of the input number.
        scanner.close();
    }
}
