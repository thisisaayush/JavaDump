package Numbers;

import java.util.Scanner;

public class E1_Swap_Numbe_With_Operators {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2= scanner.nextInt();
        scanner.close();

        swapNumbers(num1,num2);
    }

    public static void swapNumbers(int num1, int num2){
        System.out.println("First number before swapping: "+num1+".");
        System.out.println("Second number before swapping: "+num2+".");

        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;

        System.out.println("First number after swapping: "+num1+".");
        System.out.println("Second number after swapping: "+num2+".");
    }
}
