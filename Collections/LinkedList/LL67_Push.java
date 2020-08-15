package Collections.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
//This program demonstrates the simple use of linkedlist and way to convert it into string.
public class LL67_Push {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>( Arrays.asList("Tony","Peter","SuperMan") );
        linkedList.push( "Hulk" );
        linkedList.push( "Thor" );
        linkedList.push( "Loki" );
        System.out.println("Linked list, push(): " + linkedList);
        System.out.println("pop():" + linkedList.pop());

        String str = linkedList.toString();
        System.out.println("String: " + str);
        System.out.println(linkedList.toString());
    }
}
