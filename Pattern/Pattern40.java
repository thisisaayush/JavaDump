package Pattern;

public class Pattern40 {
    public static void main(String[] args) {
        for(char i = 'J' ; i >= 'A' ; i--){
            for(char j = 'A' ; j <= i ; j++){
                System.out.printf("%3c",j);
            }
            System.out.println();
        }
    }
}
/*
Output:
  A  B  C  D  E  F  G  H  I  J
  A  B  C  D  E  F  G  H  I
  A  B  C  D  E  F  G  H
  A  B  C  D  E  F  G
  A  B  C  D  E  F
  A  B  C  D  E
  A  B  C  D
  A  B  C
  A  B
  A
 */