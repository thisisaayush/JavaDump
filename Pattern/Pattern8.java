package Pattern;

public class Pattern8 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 1 ; j < 10 ; j++){
                System.out.printf("%3c",(char)(j + 64));
            }
            System.out.println();
        }
    }
}
/*
Output:
  A  B  C  D  E  F  G  H  I
  A  B  C  D  E  F  G  H  I
  A  B  C  D  E  F  G  H  I
  A  B  C  D  E  F  G  H  I
  A  B  C  D  E  F  G  H  I
  A  B  C  D  E  F  G  H  I
  A  B  C  D  E  F  G  H  I
  A  B  C  D  E  F  G  H  I
  A  B  C  D  E  F  G  H  I
  A  B  C  D  E  F  G  H  I
 */
