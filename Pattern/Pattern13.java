package Pattern;
//The program prints the characters from  A to J.
public class Pattern13 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 10 ; i++ ){
            for(char ch = 'A' ; ch <= 'J' ; ch++){
                System.out.printf("%3c",ch);
            }
            System.out.println();
        }
    }
}
/*
Output: The output of this program is similar to the output of Pattern 8.
  A  B  C  D  E  F  G  H  I  J
  A  B  C  D  E  F  G  H  I  J
  A  B  C  D  E  F  G  H  I  J
  A  B  C  D  E  F  G  H  I  J
  A  B  C  D  E  F  G  H  I  J
  A  B  C  D  E  F  G  H  I  J
  A  B  C  D  E  F  G  H  I  J
  A  B  C  D  E  F  G  H  I  J
  A  B  C  D  E  F  G  H  I  J
  A  B  C  D  E  F  G  H  I  J
 */
