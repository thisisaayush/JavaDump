package Recursion;
//The programs returns the sum of all digit of a given number.
public class R8_Sum_Of_Digits {
    static int sum = 0;
    public static void main(String[] args) {
        System.out.println("Sum: " + sumDigit( 123 ));
    }
    public static int sumDigit(int num){
        if(num == 0){
            return sum;
        }
        sum = sum + (num % 10);
        return sumDigit( num/10 );
    }
}
