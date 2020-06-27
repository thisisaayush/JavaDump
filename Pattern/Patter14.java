package Pattern;

public class Patter14 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 10 ; i++){
            for(char ch = 'j' ; ch >= 'a' ; ch--){
                System.out.printf("%3c",ch);
            }
            System.out.println();
        }
    }
}
/*
Output: The output of this program is same to the output of Pattern11 program.
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
