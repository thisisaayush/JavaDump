/*
 * author: aayush thakuri
 * date: 5-30-2020
 *
 * */
package Numbers;
import java.util.Scanner;

public class C7_Frequecy_Of_Each_Digit {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        frequencyOfDigits( num );
    }
    public static void frequencyOfDigits(int num){
       int rem = 0;
        int array[] = new int[10];
            while(num > 0){
                rem = num % 10;
                array[rem]++;
                num = num / 10;
            }

            for(int i = 0 ; i <= 9 ; i++){
                if(array[i] > 0){//to remove number that is not mentioned// 3214 it won't display element 0, 5,6...9

                    System.out.println( i + " comes " + array[i] + " times." );
                }
            }

    }
}
