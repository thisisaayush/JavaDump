/*
 * author: aayush thakuri
 * date: 5-30-2020
 *
 * */
package Numbers;

import java.util.Scanner;

public class C9_Sorting_Digits_In_Ascending_Order {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        sortingDigitsInAscendingOrder(num);
    }
    public static void sortingDigitsInAscendingOrder(int num){
        int rem = 0;
        int sort = 0;
        int temp = 0;
        temp = num;

        for(int i = 9 ; i >= 1 ; i--)
        {
            num = temp;

            while(num > 0){
                rem = num / 10;

                if(rem == i){
                    sort = sort * 10 + rem;
                }
                num = num / 10;
            }
        }

        System.out.println(sort);
    }
}
