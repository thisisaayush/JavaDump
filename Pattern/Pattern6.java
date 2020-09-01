package Pattern;
//The program prints out number from 10 to 1 in 10 rows and 10 columns format.
//Each row has same number starting from 10 and each new row will have a number in descending order. 
public class Pattern6 {
    public static void main(String[] args) {
        for(int i = 10 ; i >= 1 ; i--){
            for(int j = 1 ; j <= 10 ; j++){
                System.out.printf("%3d",i);
            }
            System.out.println();
        }
    }
}
/*
Output:
 10 10 10 10 10 10 10 10 10 10
  9  9  9  9  9  9  9  9  9  9
  8  8  8  8  8  8  8  8  8  8
  7  7  7  7  7  7  7  7  7  7
  6  6  6  6  6  6  6  6  6  6
  5  5  5  5  5  5  5  5  5  5
  4  4  4  4  4  4  4  4  4  4
  3  3  3  3  3  3  3  3  3  3
  2  2  2  2  2  2  2  2  2  2
  1  1  1  1  1  1  1  1  1  1
 */
