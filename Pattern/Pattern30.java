package Pattern;

public class Pattern30 {
    public static void main(String[] args) {
        for(char ch1 = 'a' ; ch1 <= 'j' ; ch1++){
            for(char ch2 = 'a' ; ch2 <= ch1 ; ch2++){
                System.out.printf("%3c",ch1);
            }
            System.out.println();
        }
    }
}
/*
Output:
  a
  b  b
  c  c  c
  d  d  d  d
  e  e  e  e  e
  f  f  f  f  f  f
  g  g  g  g  g  g  g
  h  h  h  h  h  h  h  h
  i  i  i  i  i  i  i  i  i
  j  j  j  j  j  j  j  j  j  j
 */
