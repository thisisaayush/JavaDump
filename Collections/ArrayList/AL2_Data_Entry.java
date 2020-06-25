package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AL2_Data_Entry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        ArrayList<Integer> arrayList = new ArrayList<>(  );
        int data = 0;

        do{
            System.out.println("Enter a data(-1 to quit:)");
            data = scanner.nextInt();

            if(data != -1){
                arrayList.add( data );
            }
        }
        while (data != -1);
        System.out.println(arrayList);
        scanner.close();


    }
}
