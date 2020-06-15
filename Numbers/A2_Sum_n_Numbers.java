package Numbers;

import java.util.Scanner;

public class A2_Sum_n_Numbers {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        System.out.println("Enter total number of input: ");
        int x = scanner.nextInt();

        double sum = 0;
        double temp;

        for(int i = 1 ; i <= x ; i++){
            System.out.println("Enter " + i +" input: ");
            temp = scanner.nextDouble();
            sum += temp;
        }
        System.out.println("Total sum is " + sum + ".");
        scanner.close();
    }
}
