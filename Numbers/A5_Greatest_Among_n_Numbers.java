
package Numbers;

import java.util.Scanner;

public class A5_Greatest_Among_n_Numbers {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int temp;
        System.out.println("Enter the total number of input: ");
        int x = scanner.nextInt();

        for(int i = 1 ; i <= x ; i ++){
            System.out.println("Enter " + i + " value: ");
            temp = scanner.nextInt();

            if(temp >= max){
                max = temp;
            }
        }
        System.out.println("The greatest number is " + max + ".");
        scanner.close();

    }
}
