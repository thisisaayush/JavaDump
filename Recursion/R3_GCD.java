package Recursion;
//The program returns the greatest common divisor of two input numbers.
public class R3_GCD {
    public static void main(String[] args) {
        System.out.println(GCD( 10,5 ));
    }
    public static int GCD(int a, int b){
        if(b == 0){
            return a;
        }
        return GCD( b, a % b );
    }
}
