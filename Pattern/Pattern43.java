package Pattern;

public class Pattern43 {
    public static void main(String[] args) {
        for(char i = 'A' ; i <= 'J' ; i++){
            for(char j = 'J' ; j >= i ; j--){
                System.out.printf("%3c",i);
            }
            System.out.println();
        }
    }
}
/*
Output:
  A  A  A  A  A  A  A  A  A  A
  B  B  B  B  B  B  B  B  B
  C  C  C  C  C  C  C  C
  D  D  D  D  D  D  D
  E  E  E  E  E  E
  F  F  F  F  F
  G  G  G  G
  H  H  H
  I  I
  J

 */