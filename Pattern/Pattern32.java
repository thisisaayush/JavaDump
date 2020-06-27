package Pattern;

public class Pattern32 {
    public static void main(String[] args) {
        for(char ch1 = 'j' ; ch1 >= 'a' ; ch1--){
            for(char ch2 = 'j' ; ch2 >= ch1 ; ch2--){
                System.out.printf("%3c",ch1);
            }
            System.out.println();
        }
    }
}
/*
Output:
  j
  i  i
  h  h  h
  g  g  g  g
  f  f  f  f  f
  e  e  e  e  e  e
  d  d  d  d  d  d  d
  c  c  c  c  c  c  c  c
  b  b  b  b  b  b  b  b  b
  a  a  a  a  a  a  a  a  a  a
 */