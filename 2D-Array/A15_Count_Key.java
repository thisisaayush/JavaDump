package Array2D;

import java.util.Scanner;

public class A15_Count_Key {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{-2,3,7},{11,44,53}};
        display( array );
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter key:");
        int key = scanner.nextInt();
        int count = 0;
        for(int i = 0 ; i < array.length ; i ++){
            for(int j = 0 ; j < array[0].length ; j++){
                if(array[i][j] == key){
                   count++;
                }
            }
        }
        System.out.println(key + " is repeated " + count + " times.");
    }
    public static void display(int[][] array){
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
