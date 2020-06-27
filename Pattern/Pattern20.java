package Pattern;

public class Pattern20 {
    public static void main(String[] args) {
        char ch = 'z';
        for(int i = 1 ; i <= 26 ; i++){
            System.out.printf("%3c",ch--);
            if(i % 5 == 0){
                System.out.println();
            }
        }
    }
}
/*
Output:
  z  y  x  w  v
  u  t  s  r  q
  p  o  n  m  l
  k  j  i  h  g
  f  e  d  c  b
  a
 */