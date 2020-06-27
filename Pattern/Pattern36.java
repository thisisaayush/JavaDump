package Pattern;

//This code is important.
public class Pattern36 {
    public static void main(String[] args) {
        for(int i = 10 ; i >= 1 ; i--)//Try to understand the loop.
        {
            for(int j = 1 ; j <= i ; j++)//Try to understand the loop.
                 {
                System.out.printf("%3d",j);
            }
            System.out.println();
        }
    }
}
/*
Output:
  1  2  3  4  5  6  7  8  9 10
  1  2  3  4  5  6  7  8  9
  1  2  3  4  5  6  7  8
  1  2  3  4  5  6  7
  1  2  3  4  5  6
  1  2  3  4  5
  1  2  3  4
  1  2  3
  1  2
  1

 */