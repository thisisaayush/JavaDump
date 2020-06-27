package Pattern;

public class Pattern42 {
    public static void main(String[] args) {
        for(char i = 'A' ; i <= 'J' ; i++){
            for(char j = 'J' ; j >= i ; j--){
                System.out.printf("%3c",j);
            }
            System.out.println();
        }
    }
}
/*
Output:
  J  I  H  G  F  E  D  C  B  A
  J  I  H  G  F  E  D  C  B
  J  I  H  G  F  E  D  C
  J  I  H  G  F  E  D
  J  I  H  G  F  E
  J  I  H  G  F
  J  I  H  G
  J  I  H
  J  I
  J

 */