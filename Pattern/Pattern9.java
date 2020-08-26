package Pattern;
//This program prints out the alphabetical chracters from a till j in horizontal manner but changing the rows for each new character.
public class Pattern9 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 1 ; j <= 10 ; j++){
                System.out.printf("%3c",(char)(i + 96));
            }
            System.out.println();
        }
    }
}
//Also check the JavaDump Pattern9 code. It's different.
/*
Output:
  a  a  a  a  a  a  a  a  a  a
  b  b  b  b  b  b  b  b  b  b
  c  c  c  c  c  c  c  c  c  c
  d  d  d  d  d  d  d  d  d  d
  e  e  e  e  e  e  e  e  e  e
  f  f  f  f  f  f  f  f  f  f
  g  g  g  g  g  g  g  g  g  g
  h  h  h  h  h  h  h  h  h  h
  i  i  i  i  i  i  i  i  i  i
  j  j  j  j  j  j  j  j  j  j
 */
