package Pattern;
//The program prints character from a to z. 
public class Pattern18 {
    public static void main(String[] args) {
        char ch = 'a';
        for(int i = 1 ; i <= 26 ; i++){
            System.out.printf("%3c",ch++);
            if(i % 5 == 0){
                System.out.println();
            }
        }
    }
}
/*
Output:
  a  b  c  d  e
  f  g  h  i  j
  k  l  m  n  o
  p  q  r  s  t
  u  v  w  x  y
  z
 */
