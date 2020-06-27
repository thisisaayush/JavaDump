package Pattern;

public class Pattern7 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 1 ; j <= 10 ; j++){
                System.out.printf("%4c",(char)(i + 64));//Prints horizontally. j loop is the reason behind the horizontally printout.
            }
            System.out.println();
        }
    }
}
/*
Output:
  A  A  A  A  A  A  A  A  A  A // Here i = 1 and j is incrementing from 1 to 10; Unless, j reaches 10, i will be 1.
  B  B  B  B  B  B  B  B  B  B // Here i = 2 and j is incrementing for 1 to 10.
  C  C  C  C  C  C  C  C  C  C
  D  D  D  D  D  D  D  D  D  D
  E  E  E  E  E  E  E  E  E  E
  F  F  F  F  F  F  F  F  F  F
  G  G  G  G  G  G  G  G  G  G
  H  H  H  H  H  H  H  H  H  H
  I  I  I  I  I  I  I  I  I  I
  J  J  J  J  J  J  J  J  J  J // for i = 10;
 */