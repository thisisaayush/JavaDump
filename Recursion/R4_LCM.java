package Recursion;

public class R4_LCM {
    public static int i = 1;
    public static void main(String[] args) {
        System.out.println(LCM( 5,18 ));
    }

    public static int LCM(int a, int b){
        int multiple = a * (i++);

        if(multiple % a == 0 && multiple % b == 0){
            return multiple;
        }
        return LCM( a,b );
    }
}
