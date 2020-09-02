package Pattern;
//The program has 10 rows and 10 columns. 
//It prints out characters from a to j in each row.
public class Pattern10 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 1 ; j <= 10 ; j++){
                System.out.printf("%3c",(char)(j + 96));
            }
            System.out.println();
        }
    }
}
/*
Output:
  a  b  c  d  e  f  g  h  i  j
  a  b  c  d  e  f  g  h  i  j
  a  b  c  d  e  f  g  h  i  j
  a  b  c  d  e  f  g  h  i  j
  a  b  c  d  e  f  g  h  i  j
  a  b  c  d  e  f  g  h  i  j
  a  b  c  d  e  f  g  h  i  j
  a  b  c  d  e  f  g  h  i  j
  a  b  c  d  e  f  g  h  i  j
  a  b  c  d  e  f  g  h  i  j
 */
