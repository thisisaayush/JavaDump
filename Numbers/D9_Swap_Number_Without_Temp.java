package Numbers;

import java.util.Scanner;
//This programs swaps the number place of two numbers.
public class D9_Swap_Number_Without_Temp {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scanner.nextInt();

        swapNumber(num1,num2);
    }

    public static void swapNumber(int num1, int num2){
        System.out.println("First number without swapping: " + num1 +".");
        System.out.println("Second number without swapping: " +num2 +".");

        num1 = num1 + num2;
        num2 = num1  - num2;
        num1 = num1 - num2;

        System.out.println("First number after swapping: " + num1 + ".");
        System.out.println("Second number after swapping: " + num2 + ".");
    }
}
