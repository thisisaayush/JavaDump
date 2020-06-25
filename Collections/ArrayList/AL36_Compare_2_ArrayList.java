package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AL36_Compare_2_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>( Arrays.asList("Tony", "Thor", "SuperMan", "BatMan","Hulk") );
        ArrayList<String> arrayList2 = new ArrayList<>( Arrays.asList( "Tony", "SuperMan","Thor","BatMan","Hulk" ) );
        ArrayList<String> arrayList3 = new ArrayList<>(  );//To compare to arrayList, we will need third arrayList,
        //which will add the the result of the two arrayLists comparison.
        for(int i = 0 ; i < arrayList1.size() ; i++){
            arrayList3.add(arrayList1.get( i ).contains(arrayList2.get( i )  ) ? "yes" : "no");
        }
        System.out.println(arrayList3);
    }
}
