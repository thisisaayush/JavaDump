package Array;
//The program revere the given int array.
public class A19_Reverse_Array {
    public static void main(String[] args) {
        int array[] = {1,3,5,7,8,11,14};

        for(int i = array.length - 1; i >= 0 ; i--){
            System.out.print(array[i] + " ");
        }
        int len = array.length;
        int index = len - 1;

        for(int i = 0 ; i < len / 2 ; i++){
            int temp = array[i];
            array[i] = array[index - i];
            array[index - i] = temp;
        }
        System.out.println();
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }
}
