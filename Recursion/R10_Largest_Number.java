package Recursion;
//Write the recursion code for smallest digit.
//This program prints out the largest digit in a given number.
public class R10_Largest_Number {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int num = 373213;
        //smallestDigit( num );
        System.out.println("Largest digit: " + largestDigit( num ));
    }
    public static int largestDigit(int num){
        int n = num % 10;
        if(n > max){
            max = n;
        }
       if(num == 0){
           return max;
       }
       return largestDigit( num / 10 );
    }
}
