package Pattern;
//The program prints out the character Z to A in reverse format.
//Each row has 5 columns. 
public class Pattern21 {
    public static void main(String[] args) {
        char ch = 'Z';
        for(int i = 1 ; i <= 26 ; i++){
            System.out.printf("%3c",ch--);
            if(i % 5 == 0){
                System.out.println();
            }
        }
    }
}
/*
Output:
  Z  Y  X  W  V
  U  T  S  R  Q
  P  O  N  M  L
  K  J  I  H  G
  F  E  D  C  B
  A
 */
