package Collections.Map;

import java.util.HashMap;

public class HM94_Remove {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>(  );
        hashMap.put( 2,"Hare" );
        hashMap.put( 4,"Shyam" );
        hashMap.put( 6, "Krishna" );
        hashMap.put( 7, "Ganesha" );

        hashMap.remove( 4 );
        System.out.println(hashMap);
        hashMap.remove( 2,"Hare" );
        System.out.println(hashMap);

    }
}
