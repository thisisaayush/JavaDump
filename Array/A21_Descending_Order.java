package Array;

public class A21_Descending_Order {
    public static void main(String[] args) {
        int[] array = {3,1,4,6,9,5,15,11,19,18};

        for(int i = 0 ; i < array.length ; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
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
