package Collections.ArrayList;

import java.util.ArrayList;

public class AL8_Enhanced_ForLoop {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(  );
        arrayList.add( 1 );
        arrayList.add( 2 );
        arrayList.add( 3 );
        arrayList.add( 4 );
        arrayList.add( 5 );
        arrayList.add( 6 );

        //ArrayList to normal one dimensional array
        for(int i : arrayList){
            System.out.print(i + " ");
        }
    }
}
