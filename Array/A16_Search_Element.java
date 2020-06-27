//Check whether the element exists or not and if exist print out the index.
package Array;

import java.util.Scanner;

public class A16_Search_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter a search key: ");
        int key = scanner.nextInt();
        boolean flag = false;
        int[] array = {12,14,17,22,24,27,29};

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == key){
              flag = true;
                System.out.println("Key exists at index " + i + ".");
            }
        }
        if(flag == false){
            System.out.println("Key not found.");
        }
    }
}
