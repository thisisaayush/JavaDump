package Recursion;
//The prgram returns the sum of n natural number.
public class R1_Sum {
    public static void main(String[] args) {
        System.out.println(sum( 5 ));
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum( n -1 );
    }
}
