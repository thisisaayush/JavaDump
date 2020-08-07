
package Numbers;
import java.util.Scanner;
//This program is a simple demonstration of sum of two input numbers.
public class A1_Sum_Two_Numbers {
    public static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");//Ask user for first input.
        double x = scanner.nextDouble();//Takes first input from the user.
        System.out.println("Enter the second number: ");//Ask user for second input.
        double y = scanner.nextDouble();//Takes second input from the user.

        double sum = x + y;
        System.out.println("Sum of " + x + " and "+ y +" is "+ sum +".");
        scanner.close();
    }
}
