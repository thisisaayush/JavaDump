package Collections.Map;

import java.util.TreeMap;

public class TM102_Simple_TreeMap {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(  );
        treeMap.put( 4, "Plank" );
        treeMap.put( 2, "Hawking" );
        treeMap.put( 1, "Einstein" );
        treeMap.put( 3, "Tesla" );
        treeMap.put( 5, "Bohr" );

        System.out.println(treeMap);
    }
}
