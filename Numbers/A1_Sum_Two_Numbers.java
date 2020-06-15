
package Numbers;

import java.util.Scanner;

public class A1_Sum_Two_Numbers {
    public static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        double x = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double y = scanner.nextDouble();

        double sum = x + y;
        System.out.println("Sum of " + x + " and "+ y +" is "+ sum +".");
        scanner.close();
    }
}
