package Recursion;
//The program returns the power of a number.
public class R5_Power {
    public static void main(String[] args) {
        System.out.println(Power( 10,4 ));
    }
    public static int Power(int n, int pow){
        if(pow == 0){
            return 1;
        }
        return n * Power( n, pow - 1 );
    }
}
