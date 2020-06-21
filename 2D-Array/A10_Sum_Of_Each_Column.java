package Array2D;

public class A10_Sum_Of_Each_Column {
    public static void main(String[] args) {
        int[][] array = {{1,3,4},{3,5,7},{6,9,8}};
        int sum = 0 ;

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
               sum = sum + array[j][i];
            }
            System.out.println("Column " + i + " sum: " + sum);
            sum = 0;
        }
    }
}
