package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
//This program is simple demonstration of using while loop in an arraylist.

public class A19_While_Loop {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>( Arrays.asList(12,15,18,20,22,24,27) );
        int count = 0;
        while(count < arrayList.size()){
            System.out.print(arrayList.get(count) + " ");
            count++;
        }
    }
}
