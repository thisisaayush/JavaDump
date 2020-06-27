package Pattern;

public class Pattern41 {
    public static void main(String[] args) {
        for(char i = 'J' ; i >= 'A' ; i--){
            for(char j = 'A' ; j <= i ; j++){
                System.out.printf("%3c",i);
            }
            System.out.println();
        }
    }
}
/*
Output:
  J  J  J  J  J  J  J  J  J  J
  I  I  I  I  I  I  I  I  I
  H  H  H  H  H  H  H  H
  G  G  G  G  G  G  G
  F  F  F  F  F  F
  E  E  E  E  E
  D  D  D  D
  C  C  C
  B  B
  A
 */
