package Pattern;

public class Pattern26 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.printf("%3d",j);
            }
            System.out.println();
        }
    }
}
/*
Output:
  1
  1  2
  1  2  3
  1  2  3  4
  1  2  3  4  5
  1  2  3  4  5  6
  1  2  3  4  5  6  7
  1  2  3  4  5  6  7  8
  1  2  3  4  5  6  7  8  9
  1  2  3  4  5  6  7  8  9 10
 */
