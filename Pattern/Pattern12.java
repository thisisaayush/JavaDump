package Pattern;
//The program prints out character from j to a.
//Each row has same character. 

public class Pattern12 {
    public static void main(String[] args) {
        for(int i = 10; i >= 1 ; i--){
            for(int j = 1 ; j <= 10 ; j++){
                System.out.printf("%3c",(char)(i + 96));
            }
            System.out.println();
        }
    }
}
/*
Output:
  j  j  j  j  j  j  j  j  j  j
  i  i  i  i  i  i  i  i  i  i
  h  h  h  h  h  h  h  h  h  h
  g  g  g  g  g  g  g  g  g  g
  f  f  f  f  f  f  f  f  f  f
  e  e  e  e  e  e  e  e  e  e
  d  d  d  d  d  d  d  d  d  d
  c  c  c  c  c  c  c  c  c  c
  b  b  b  b  b  b  b  b  b  b
  a  a  a  a  a  a  a  a  a  a


If you want to print the below pattern just replace 96 by 64.
i.e; System.out.printf("%3c",(char)(i + 64 ));

  J  J  J  J  J  J  J  J  J  J
  I  I  I  I  I  I  I  I  I  I
  H  H  H  H  H  H  H  H  H  H
  G  G  G  G  G  G  G  G  G  G
  F  F  F  F  F  F  F  F  F  F
  E  E  E  E  E  E  E  E  E  E
  D  D  D  D  D  D  D  D  D  D
  C  C  C  C  C  C  C  C  C  C
  B  B  B  B  B  B  B  B  B  B
  A  A  A  A  A  A  A  A  A  A
 */
