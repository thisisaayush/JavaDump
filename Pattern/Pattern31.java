package Pattern;

public class Pattern31 {
    public static void main(String[] args) {
        for(char ch1 = 'a' ; ch1 <= 'j' ; ch1++){
            for(char ch2 = 'a' ; ch2 <= ch1 ; ch2++){
                System.out.printf("%3c",ch2);
            }
            System.out.println();
        }
    }
}
/*
Output:
  a
  a  b
  a  b  c
  a  b  c  d
  a  b  c  d  e
  a  b  c  d  e  f
  a  b  c  d  e  f  g
  a  b  c  d  e  f  g  h
  a  b  c  d  e  f  g  h  i
  a  b  c  d  e  f  g  h  i  j
 */