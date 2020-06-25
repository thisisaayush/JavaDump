package Collections.ArrayList;

import java.util.ArrayList;

public class AL2_Add_Remove {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(  );
        arrayList.add( 1 );
        arrayList.add( 2 );
        arrayList.add( 3 );
        arrayList.add( 4 );
        System.out.println("Before removing element: " + arrayList);
        arrayList.remove( 1 );
        System.out.println("After removing element: " + arrayList);
    }
}
