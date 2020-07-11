package Recursion;

//Write the recursion code for smallest digit.
public class R10_Largest_Number {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int num = 373213;
        //smallestDigit( num );
        System.out.println("Largest digit: " + smallestDigit( num ));
    }
    public static int smallestDigit(int num){
        int n = num % 10;
        if(n > max){
            max = n;
        }
       if(num == 0){
           return max;
       }
       return smallestDigit( num / 10 );
    }
}
