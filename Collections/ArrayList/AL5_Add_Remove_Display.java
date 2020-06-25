package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AL5_Add_Remove_Display {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(  );
        int element = 0;
        selectionList();
      do{
            System.out.println("Enter the choices: ");
            element = scanner.nextInt();
            if(element == 1){
                addElement( arrayList );
            }
            else if(element == 1){
                removeElement( arrayList );
            }
            else if(element == 3){
                System.out.println(arrayList);
            }
            else if(element == 4){
                selectionList();
            }
            else if(element == -1){
                break;
            }
            else{
                System.out.println("Invalid choice.");
            }
        }
      while(element != -1);
        scanner.close();


    }

    public static void addElement(ArrayList<Integer> arrayList){
        int element = 0;

        while( element != -1) {
            System.out.println( "Enter element(-1 to quit):" );
            element = scanner.nextInt();
            arrayList.add( element );
        }
        System.out.println(arrayList);
    }

    public static void removeElement(ArrayList<Integer> arrayList){
        ArrayList<Integer> temp = new ArrayList<>(  );
        temp = arrayList;
        System.out.println("Enter the index to remove the element: ");
        int element = scanner.nextInt();
        arrayList.remove( element );
        System.out.println("Removed element is " + temp.get(element));
        System.out.println("Collections.ArrayList after removing element: " + arrayList);

    }

    public static void selectionList(){
        System.out.println("1.Add\n2.Remove\n3.Display\n4.See Option\n5.Quit: Press -1");
    }
}
