package Collections.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
//The prgram demonstrate the use of linkedlist and how to convert it into string.
public class LL70_toString {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>( Arrays.asList(2,3,4,6,7,9) );
        String str = linkedList.toString();
        System.out.println(str);
    }
}
