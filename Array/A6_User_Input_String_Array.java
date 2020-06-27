package Array;

import java.util.Scanner;

public class A6_User_Input_String_Array {
    public static void main(String[] args) {
     Scanner scanner = new Scanner( System.in );
        System.out.println("Enter the size of an array: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String array[] = new String[n];

        for(int i = 0 ; i < array.length ; i++){
            System.out.println("Enter the value of " + i + " array: ");
            array[i] = scanner.nextLine();
        }
        System.out.println("The strings arrays are: ");
        for(int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }
}
