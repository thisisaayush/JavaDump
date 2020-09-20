package Pattern;
//The program has 10 rows and 10 columns.
//Prints number from 2 to 200 in ascending order.
public class Pattern23 {
    public static void main(String[] args) {
        int num = 0;
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 1 ; j <= 10 ; j++){
                System.out.printf("%4d",num += 2);
            }
            System.out.println();
        }
    }
}
/*
Note: There are number of ways to do this problem.
Output:
   2   4   6   8  10  12  14  16  18  20
  22  24  26  28  30  32  34  36  38  40
  42  44  46  48  50  52  54  56  58  60
  62  64  66  68  70  72  74  76  78  80
  82  84  86  88  90  92  94  96  98 100
 102 104 106 108 110 112 114 116 118 120
 122 124 126 128 130 132 134 136 138 140
 142 144 146 148 150 152 154 156 158 160
 162 164 166 168 170 172 174 176 178 180
 182 184 186 188 190 192 194 196 198 200
 */
