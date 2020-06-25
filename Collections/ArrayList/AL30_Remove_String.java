package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AL30_Remove_String {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>( Arrays.asList("Hello, ","Universe. ","How are you doing? ","Huh") );
        arrayList.remove( 3 );

        for(String str : arrayList){
            System.out.print(str);
        }
    }
}
