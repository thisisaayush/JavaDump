package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
//This program is a simple demonstration of using for loop in an arraylist.
public class AL17_ArrayList_For_Loop {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>( Arrays.asList(1,3,4,5,6,7,8) );

        System.out.println("Size of an ArrayList: " + arrayList.size());
        for(int i = 0 ; i < arrayList.size() ; i++){
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
