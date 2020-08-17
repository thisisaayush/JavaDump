//The program prints out the frequency of all elements.
package Array;
public class A17_Frequency_Of_All_Elements_ND {
    public static void main(String[] args) {
        int[] array = {2,23,22,33,2,22,23,23,23,22};
        int size = array.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < size ; i++){
            if(array[i] >= max){
                max = array[i];
            }
        }

        int count[] = new int[max + 1];

        for(int i = 0 ; i < size ; i++){
            count[array[i]]++;
        }
        for (int i = 0 ; i < count.length ; i++){
            if(count[i] > 0){
                System.out.println("Element " + i + " occurs: " + count[i] + " times.");
            }
        }
    }
}
