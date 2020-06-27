package Pattern;
public class Pattern1 {
    public static void main(String[] args) {
        /*Note: In nested for loop- for 2  for loops- the second loop completes its cycle first every time for each
        increment of the first loop and then the first loop gets incremented and when the first loop completes its
        cycle, the loop ends.*/
        for(int i = 1 ; i <= 10 ; i++)//i loop is the reason behind the vertical print. i represents column.
            {
            for(int j = 1 ; j <= 10 ; j++)//j loop is the reason behind the horizontal print. j represents row.
            {
                System.out.printf("%3d",i);//Prints horizontally.
            }
            System.out.println();
        }
    }
}
/*
Output:
1     1     1     1     1     1     1     1     1     1  //Here i = 1 and j is incrementing from 1 to 10. Unless j reaches 10, i will not increase to 2.
2     2     2     2     2     2     2     2     2     2  // for i = 2;
3     3     3     3     3     3     3     3     3     3  // for i = 3; and so on.
4     4     4     4     4     4     4     4     4     4
5     5     5     5     5     5     5     5     5     5
6     6     6     6     6     6     6     6     6     6
7     7     7     7     7     7     7     7     7     7
8     8     8     8     8     8     8     8     8     8
9     9     9     9     9     9     9     9     9     9
10    10    10    10    10    10    10    10    10    10

 */
