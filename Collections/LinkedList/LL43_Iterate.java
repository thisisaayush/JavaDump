package Collections.LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
//Demonstration on how to use LinkedList and iterator.
public class LL43_Iterate {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Tony","Hulk","Peter","Captain") );
        Iterator itr = linkedList.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
