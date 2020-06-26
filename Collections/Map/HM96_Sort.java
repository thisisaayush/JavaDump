package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HM96_Sort {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>(  );
        hashMap.put( 4,"Ram" );
        hashMap.put( 5, "Krishna" );
        hashMap.put( 3, "Brahma" );
        hashMap.put( 2, "Vishnu");
        hashMap.put( 1, "Shiva" );

        Map map = new TreeMap<>(hashMap);
        System.out.println(map);
    }
}
