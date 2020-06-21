package Array2D;

public class A5_Sum_Of_All_Elements {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;

        System.out.println("Given 2-D Array:");
        display( array );

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                sum = sum + array[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);
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
