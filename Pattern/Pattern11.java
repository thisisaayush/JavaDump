package Pattern;
//The program has 10 rows and 10 columns.
//It prints out character from J to A in each row.
public class Pattern11 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 10 ; j >= 1 ; j--){
                System.out.printf("%3c",(char)(j + 64 ));
            }
            System.out.println();
        }
    }
}
/*
Output:
  J  I  H  G  F  E  D  C  B  A
  J  I  H  G  F  E  D  C  B  A
  J  I  H  G  F  E  D  C  B  A
  J  I  H  G  F  E  D  C  B  A
  J  I  H  G  F  E  D  C  B  A
  J  I  H  G  F  E  D  C  B  A
  J  I  H  G  F  E  D  C  B  A
  J  I  H  G  F  E  D  C  B  A
  J  I  H  G  F  E  D  C  B  A
  J  I  H  G  F  E  D  C  B  A



  If you want to print the below pattern just replace 64 by 96.
  i.e; System.out.printf("%3c",(char)(j + 96 ));

  j  i  h  g  f  e  d  c  b  a
  j  i  h  g  f  e  d  c  b  a
  j  i  h  g  f  e  d  c  b  a
  j  i  h  g  f  e  d  c  b  a
  j  i  h  g  f  e  d  c  b  a
  j  i  h  g  f  e  d  c  b  a
  j  i  h  g  f  e  d  c  b  a
  j  i  h  g  f  e  d  c  b  a
  j  i  h  g  f  e  d  c  b  a
  j  i  h  g  f  e  d  c  b  a
 */
