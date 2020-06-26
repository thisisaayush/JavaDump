package Collections.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LL71_toArray {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>( Arrays.asList(3,2,5,6,7) );
        Object array[] = new Object[linkedList.size()];
        array = linkedList.toArray();

        for(Object i : array){
            System.out.print(i + " ");
        }
    }
}
