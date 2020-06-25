package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AL27_Addall {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(  );
        arrayList1.add( 1 );
        arrayList1.add( 2 );
        arrayList1.add( 3 );
        arrayList1.add( 4 );
        arrayList1.add( 5 );

        ArrayList<Integer> arrayList2 = new ArrayList<>(  );
        arrayList2.add( 9 );
        arrayList2.add( 8 );
        arrayList2.add( 7 );
        arrayList2.add( 6 );
        arrayList2.add( 5 );

        System.out.println("ArrayList 1: " + arrayList1);
        System.out.println("ArrayList 2: " + arrayList2);
        arrayList1.addAll( arrayList2 );//All element of arrayList2 is moved to arrayList1.
        System.out.println("New ArrayList: " + arrayList1);
        Collections.sort( arrayList1 );
        System.out.println("In ascending order, arrayList1: " + arrayList1);
        Collections.sort(arrayList2);
        System.out.println("In ascending order, arrayList2: " + arrayList2);
    }
}
