package Collections.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
//Demonstration on removing elements from LinkedList.
public class LL52_Remove_Specific_Element {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 = new LinkedList<>( Arrays.asList("Albert Einstein", "Stephen Hwaking", "Richard Feymann","Max Plank","Max Well","Max Bohr","Neils Bohr","Ruterford","Thomson") );
        System.out.println("Before removing element: " + linkedList1);
        linkedList1.remove(String.valueOf( "Richard Feymann" ));
        System.out.println("After removing element: " + linkedList1);



        //any_list.remove(Integer.valueOf(int value));
        //any_list.remove(String.valueOf(String value));

    }
}
