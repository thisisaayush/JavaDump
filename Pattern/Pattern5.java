package Pattern;
//The program has 10 rows and 10 columns.
//It prints out number from 10 to 1 in reverse order in each row.
public class Pattern5 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 10 ; j >= 1 ; j--){
                System.out.printf("%3d",j);
            }
            System.out.println();
        }
    }
}
/*
Output:
 10  9  8  7  6  5  4  3  2  1
 10  9  8  7  6  5  4  3  2  1
 10  9  8  7  6  5  4  3  2  1
 10  9  8  7  6  5  4  3  2  1
 10  9  8  7  6  5  4  3  2  1
 10  9  8  7  6  5  4  3  2  1
 10  9  8  7  6  5  4  3  2  1
 10  9  8  7  6  5  4  3  2  1
 10  9  8  7  6  5  4  3  2  1
 10  9  8  7  6  5  4  3  2  1
 */
