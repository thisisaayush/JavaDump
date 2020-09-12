package Pattern;
//The program prints out character from A to Z in alphabetical order.
//Each row has max 5 columns and after at 5th column character jumps to new row.
public class Pattern19 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 26 ; i++){
            System.out.printf("%3c",(char)(i + 64));
            if(i % 5 == 0){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------");
        //Different approach to the same problem.
        char ch = 'A';
        for(int i = 1 ; i <= 26 ; i++){
            System.out.printf("%3c",ch++);
            if(i % 5 == 0){
                System.out.println();
            }
        }
    }
}
/*
Output:
  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T
  U  V  W  X  Y
  Z
----------------------------------------------
  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T
  U  V  W  X  Y
  Z
 */
