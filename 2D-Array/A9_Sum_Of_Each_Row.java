package Array2D;

public class A9_Sum_Of_Each_Row {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{2,3,4},{5,6,7},{8,9,10}};
        int sum = 0;

        display( array );

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                sum = sum + array[i][j];
            }
            System.out.println("Row " + i + " sum: " + sum);
            sum = 0;
        }


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
