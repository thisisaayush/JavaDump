package Array2D;

public class A13_Sum_Of_Edges {
    public static void main(String[] args) {
        int[][] array = {{1,3,4,6},{4,3,2,8},{2,8,9,5},{7,1,3,5}};
        int sum = 0;

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                if(i == 0 || i == array.length - 1  || j == 0 || j == array[0].length - 1){
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.println("Sum: " + sum);
    }
}
