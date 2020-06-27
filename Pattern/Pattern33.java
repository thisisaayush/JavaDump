package Pattern;

public class Pattern33 {
    public static void main(String[] args) {
        for(char i = 'j' ; i >= 'a' ; i--){
            for(char j = 'j' ; j >= i ; j--){
                System.out.printf("%3c",j);
            }
            System.out.println();
        }
    }
}
/*
Output:
  j
  j  i
  j  i  h
  j  i  h  g
  j  i  h  g  f
  j  i  h  g  f  e
  j  i  h  g  f  e  d
  j  i  h  g  f  e  d  c
  j  i  h  g  f  e  d  c  b
  j  i  h  g  f  e  d  c  b  a

 */
