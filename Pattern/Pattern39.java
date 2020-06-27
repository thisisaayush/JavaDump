package Pattern;

public class Pattern39 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 10 ; j >= i ; j--){
                System.out.printf("%3d",j);
            }
            System.out.println();
        }
    }
}
/*
Output:
 10  9  8  7  6  5  4  3  2  1
 10  9  8  7  6  5  4  3  2
 10  9  8  7  6  5  4  3
 10  9  8  7  6  5  4
 10  9  8  7  6  5
 10  9  8  7  6
 10  9  8  7
 10  9  8
 10  9
 10

 */
