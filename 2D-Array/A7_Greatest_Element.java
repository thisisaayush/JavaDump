package Array2D;
//This program prints out the element from a 2D int array.
public class A7_Greatest_Element {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{11,22,33},{6,7,8}};
        int max = Integer.MIN_VALUE;

        display( array );

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Greatest element: "+ max);
    }
    public static void display(int[][]array){
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
