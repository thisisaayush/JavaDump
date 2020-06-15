package Numbers;

import java.util.Scanner;

public class E4_Armstrong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        armstrongNumber(num);
    }
    public static void armstrongNumber(int num){
        System.out.println(power( num ));
        System.out.println(length( num ));
            if(power( num  ) == num){
                System.out.println(num+ " is an armstrong number.");
            }
            else{
                System.out.println(num + " is not an armstrong number.");
            }
    }
    public static int length(int num) {
        int len = 0;
        while (num > 0) {
            len++;
            num = num / 10;
        }
        return len;
    }
    public static int power(int num){
        int temp = num;
        int rem = 0;
        int result = 0;


        while(num > 0){
            rem = num % 10;
            result = result + (int) Math.pow( rem,length( num ));
            num = num / 10;
        }
        return result;
    }
}
