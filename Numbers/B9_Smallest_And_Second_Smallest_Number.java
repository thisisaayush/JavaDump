/*
 * author: aayush thakuri
 * date: 5-28-2020
 *
 * */
package Numbers;
//This program prints out the smallest and second smallest digits from the given number.
import java.util.Scanner;

public class B9_Smallest_And_Second_Smallest_Number {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        smallestSecondSmallestDigit( num );
    }
    public static void smallestSecondSmallestDigit(int num){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int temp = 0;

        while(num > 0){
            temp = num % 10;
            if(temp < min) {
                secondMin = min;
                min = temp;
            }
            else if(temp < secondMin){
                secondMin = temp;
            }
            num = num / 10;
        }
        System.out.println("Smallest digit: " + min + ".");
        System.out.println("Second smallest digit: " + secondMin + ".");
    }
}
