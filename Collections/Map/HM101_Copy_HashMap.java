package Collections.Map;

import java.util.HashMap;

public class HM101_Copy_HashMap {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap(  );
        hashMap.put( 1,"Tony" );
        hashMap.put( 4,"Hulk" );
        hashMap.put( 3,"Thor" );
        hashMap.put( 3,"Loki" );//Here key of 2 is same for value Thor and Loki, in such scenario, value Loki at key 3
        //will replace Thor.
        //Note: if same key is used in map, later key's value will replace previous key's value.
        hashMap.put( 2,"Peter" );

        HashMap hashMap1 = new HashMap(  );
        hashMap1.put( 5,"SuperMan" );
        hashMap1.put( 8,"AquaMan" );
        hashMap1.put( 6,"BatMan" );
        hashMap1.put( 7,"Flash" );

        hashMap.putAll( hashMap1 );

        System.out.println(hashMap);

    }
}
