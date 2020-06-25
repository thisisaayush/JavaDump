package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AL34_subList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>( Arrays.asList("Tony" , "Thor" , "Peter", "Captain","SuperMan","BatMan","SilverMan","AlmightyMan") );
        List temp = arrayList.subList( 1,5 );
        System.out.println("ArrayList: " + arrayList);
        System.out.println("SubList: " + temp);
    }
}
