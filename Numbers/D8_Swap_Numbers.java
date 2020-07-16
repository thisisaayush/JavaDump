package Numbers;

import java.util.Scanner;
//This program swaps  the number place of two given numbers.
public class D8_Swap_Numbers {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter the num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the num2: ");
        int num2 = scanner.nextInt();

        swapNumbers(num1,num2);
    }
    public static void swapNumbers(int num1, int num2){
        System.out.println("First entered number before swapping is "+num1+".");
        System.out.println("Second entered number before swapping is "+num2+".");
        int temp = 0;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println();
        System.out.println("First number after swapping is "+num1+".");
        System.out.println("Second number after swapping is "+num2+".");
    }
}
