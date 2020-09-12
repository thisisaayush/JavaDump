package Pattern;
//The program prints out numbers from 1 to 10 in each row.
//Each row has 10 columns and there are 10 rows.
public class Pattern2 {
    public static void main(String[] args) {
        /*Note: In nested for loop- for 2  for loops- the second loop completes its cycle first every time for each
            increment of the first loop and then the first loop gets incremented and when the first loop completes its
            cycle, the loop ends.*/
        for(int i = 1 ; i <= 10 ; i++)//i loop is the reason behind the vertical print. i represents column.
        {
            for(int j = 1 ; j <= 10 ; j++)//j loop is the reason behind the horizontal print. j represents row.
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
  1  2  3  4  5  6  7  8  9 10
  1  2  3  4  5  6  7  8  9 10
  1  2  3  4  5  6  7  8  9 10
  1  2  3  4  5  6  7  8  9 10
  1  2  3  4  5  6  7  8  9 10
  1  2  3  4  5  6  7  8  9 10
  1  2  3  4  5  6  7  8  9 10
  1  2  3  4  5  6  7  8  9 10
  1  2  3  4  5  6  7  8  9 10
 */
