package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AL23_Sorting_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>( Arrays.asList(2,4,1,5,7,3,0) );
        Collections.sort( arrayList );

        System.out.println("ArrayList in ascending order: " + arrayList);
        Collections.reverse( arrayList );
        System.out.println("ArrayList in descending order: " + arrayList);
    }
}
