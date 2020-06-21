package Array2D;
//Sum of Major diagonal
//Sum of Minor diagonal
public class A11N12_Sum_Of_Diagonal {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{3,4,5},{6,7,8},{2,6,8}};
        int sum = 0;
        int sum1 = 0;

        display( array );
        //For sum of major diagonal.
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                if(i == j){
                    sum = sum + array[i][j];
                }
            }
        }

        //For sum of minor diagonal.
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                if(i + j == array.length - 1){
                    sum1 = sum1 + array[i][j];
                }
            }
        }
        System.out.println("Sum of major diagonal elements: " + sum);
        System.out.println("Sum of minor diagonal elements: " + sum1);
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
