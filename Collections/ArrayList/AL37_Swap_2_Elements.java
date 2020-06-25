package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AL37_Swap_2_Elements {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>( Arrays.asList("Ram","Shyam","Hari","Krishna","Shiva","Vishnu","Hunuman") );
        Collections.swap( arrayList,2,4 );
        System.out.println(arrayList);
    }
}
