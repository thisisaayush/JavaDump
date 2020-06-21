//This codes ask user to input element at given rows and columns.
package Array2D;
import java.util.Scanner;
public class A3_User_Input {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        int r = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int c = scanner.nextInt();

        int[][] array = new int[r][c];

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                System.out.print("Enter array [" + i +"] [" + j +"]: " );
                array[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        display( array );
        scanner.close();
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
