package Numbers;

import java.util.Scanner;
//The program prints out the last prime number for a given limit.
public class D7_Last_Prime_Number {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        for(int i = num ; i >= 2 ; i--){
            if(lastPrimeNumber( i )){
                System.out.println("The last prime number is " + i +".");
                break;
            }
        }
    }

    public static boolean lastPrimeNumber(int num){

        for(int i = 2 ; i <= num / 2 ; i++){
                if(num % i ==0)
                    return false;

        }
        return true;

    }
}

