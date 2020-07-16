package Recursion;
//The program returns the total digit in a given number.
public class R7_Count_Digit {
    static int count = 0;
    public static void main(String[] args) {
        System.out.println(countDigit( 123 ));
    }

    public static int countDigit(int num){
       if(num == 0){
          return count;
        }
        count++;
        return countDigit( num /10 );
    }
}
