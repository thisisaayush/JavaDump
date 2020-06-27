package Pattern;

public class Pattern29 {
    public static void main(String[] args) {
        for(int i = 10 ; i >= 1 ; i--){
            for(int j = 10 ; j >= i  ; j--)//Try to understand this loop. j >= i
            {
                System.out.printf("%3d",i);
            }
            System.out.println();
        }
    }
}
/*
Output:
  10
  9  9
  8  8  8
  7  7  7  7
  6  6  6  6  6
  5  5  5  5  5  5
  4  4  4  4  4  4  4
  3  3  3  3  3  3  3  3
  2  2  2  2  2  2  2  2  2
  1  1  1  1  1  1  1  1  1  1
 */