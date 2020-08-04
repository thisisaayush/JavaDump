package Collections.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
//Demonstration on using LinkedList class and related methods.
public class LL50_Mix_Methods {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>( Arrays.asList("Ram", "Shyam", "Hari", "Krishna", "Shiva", "Hunuman", "Vishnu", "Brahma") );

        System.out.println("Before any changes: " + linkedList);
        linkedList.addFirst( "Mahadev" );
        System.out.println("addFirst(): \t\t" + linkedList);
        linkedList.addLast( "Narayan" );
        System.out.println("addLast(): \t\t" + linkedList);
        linkedList.removeFirst();
        System.out.println("removeFirst(): \t\t" + linkedList);
        linkedList.removeLast();
        System.out.println("removeLast(): \t\t" + linkedList);

        System.out.println(linkedList.contains( "Ram" ));
        System.out.println(linkedList.contains( "Albert Einstein" ));

        System.out.println("Integer linkedList:");
        LinkedList<Integer> linkedList1 = new LinkedList<>( Arrays.asList( 2,3,4,4,5,4,29 ) );
        System.out.println(linkedList1.contains( 2 ));
        System.out.println(linkedList1.contains( 33 ));
    }
}
