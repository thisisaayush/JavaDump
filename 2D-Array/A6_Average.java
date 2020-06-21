package Array2D;

public class A6_Average{
    public static void main(String[] args) {
        int[][] array = {{1,2,3} , {4,5,6} , {7,8,9}};
        int totalElements = array.length * array[0].length;
        int sum = 0;
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                sum = sum + array[i][j];
            }
        }
        System.out.println("Total elements: " + totalElements);
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + (double) (sum / totalElements));
    }
}
