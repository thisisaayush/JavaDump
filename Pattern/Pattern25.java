package Pattern;
//This code is important.
public class Pattern25 {
    public static void main(String[] args) {
       int i = 2;
       int count = 0;

       while (count < 100){
           if(isPrime( i )) {
               count++;
               System.out.printf( "%5d", i );
               if (count % 10 == 0) {
                   System.out.println();
               }
           }
           i++;
           }
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
