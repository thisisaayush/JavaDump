package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AL29_Remove_int {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>( Arrays.asList(2,3,4,6,3,3,9,8) );
        ArrayList temp = arrayList;
        arrayList.remove( Integer.valueOf( 3 ) );
        System.out.println("ArrayList element excluding element 3: " + arrayList);
        removeElement( temp );
    }
    //removeElement() method here finds the index of element and remove the element from the ArrayList.
    public static void removeElement(ArrayList<Integer> arrayList){
        for(int i = 0 ; i < arrayList.size() ; i++){
            if(arrayList.get(i) == 3){
                arrayList.remove( i );
            }
        }
        System.out.println("After removing element 3: "+arrayList);
    }
}
