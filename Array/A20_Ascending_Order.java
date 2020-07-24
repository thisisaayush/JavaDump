package Array;
//The program prints out the array in ascending order.
public class A20_Ascending_Order {
    public static void main(String[] args) {
        int[] array = {1,4,6,8,3,7,11,24,12,21};

        //Bubble sort algorithm.
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array.length - 1 ; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }
}
