package Collections.LinkedList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
//Simple way of creating LinkedList.
public class LL42_Simple_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>( Arrays.asList("Ram","Shyam","Hari","Krishna","Shiva") );
        System.out.println(linkedList);
    }
}
