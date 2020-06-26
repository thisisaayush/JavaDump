package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Note: HashMap doesn't maintain order. TreeMap maintains order.
public class HM90_Iterate_Map {
    public static void main(String[] args) {
        HashMap<Integer,String > hashMap = new HashMap<>(  );
        hashMap.put( 1, "Ram" );
        hashMap.put( 2, "Krishna" );
        hashMap.put( 3, "Ganesha" );
        hashMap.put( 4, "Hanuman");

        Set set = hashMap.entrySet();//Converting map to set.
        Iterator itr = set.iterator();//Iterating set.

        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        System.out.println(hashMap.get( 3 ));//Getting value of map using key.
    }
}
