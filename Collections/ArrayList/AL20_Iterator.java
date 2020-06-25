package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AL20_Iterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>( Arrays.asList("Ram","Shyam","Tom","Harry","Shiva","Krishna") );

        Iterator itr = arrayList.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
