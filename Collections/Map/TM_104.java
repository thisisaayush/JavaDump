package Collections.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//This program demonstrate the use of TreeMap class.
public class TM_104 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>(  );
        treeMap.put( 3, "Shiva" );
        treeMap.put( 2, "Vishnu" );
        treeMap.put( 1, "Brahma" );

        Set set = treeMap.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
