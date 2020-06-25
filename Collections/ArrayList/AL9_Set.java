package Collections.ArrayList;

import java.util.ArrayList;

public class AL9_Set {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(  );
        //Note: add() method doesn't remove the element. If index is used in add(int index, int element) then the
        //element that was at the given index will move to one index to right and so on. But for set() method, it
        //removes the element at the given index and set new element.
        arrayList.add( 11 );
        arrayList.add( 12 );
        arrayList.add( 13 );
        arrayList.add( 14 );
        arrayList.add( 15 );
        arrayList.add( 16 );

        for(int i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println();
        arrayList.set( 2,22 );
        arrayList.set( 4,25 );
        arrayList.set( 5,28 );
        arrayList.set( 1,19 );
        System.out.println(arrayList);
    }
}
