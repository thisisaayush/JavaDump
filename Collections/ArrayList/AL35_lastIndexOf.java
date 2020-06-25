package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

//This code returns the last index of a given element.
public class AL35_lastIndexOf {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>( Arrays.asList(2,2,3,4,5,5,7,1,2,3) );
        System.out.println("Given arrayList: " + arrayList);
        System.out.println("Last index of element 2: " + arrayList.lastIndexOf( 2 ));
    }
}
