//The program prints out the most occurring element along with the number of occurrence.
package Array;
public class A18_Most_Occuring_Element {
    public static void main(String[] args) {
       int array[] = {1,3,2,1,2,3,5,5,6,1,5,1};
       int mostFrequency = 0;
       int element = 0;
       int max = Integer.MIN_VALUE;

       for(int i = 0 ; i < array.length ; i++){
           if(array[i] > max){
               max = array[i];
           }
       }
       int count[] = new int[max + 1];

       for(int i = 0 ; i < array.length ; i++){
           count[array[i]]++;
       }

       for(int i = 0 ; i < array.length ; i++){
           if(count[array[i]] > mostFrequency ){
               mostFrequency = count[array[i]];
               element = array[i];

           }
       }
        System.out.println(element + " occurs " + mostFrequency + " times.");
    }
}
