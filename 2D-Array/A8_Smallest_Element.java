package Array2D;
//The program prints out the smallest element from a 2D int array.
public class A8_Smallest_Element {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{-2,3,7},{11,44,53}};
        int min = Integer.MAX_VALUE;

        display( array );
        for(int i = 0 ; i < array.length ; i ++){
            for(int j = 0 ; j < array[0].length ; j++){
                if(array[i][j] < min){
                    min = array[i][j];
                }
            }
        }
        System.out.println("Smallest elements: " + min);
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
