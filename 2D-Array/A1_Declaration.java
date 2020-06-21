package Array2D;
//This codes just demonstrates how 2D Array works.
//It gives the idea how to input elements in 2D Array.
public class A1_Declaration {
    public static void main(String[] args) {
            int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
            display( array );
    }
    public static void display(int[][] array){
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
