package Pattern;
//The program has 10 rows and 10 columns.
//Prints number from 3 t0 201 in ascending order.
public class Pattern24 {
    public static void main(String[] args) {
        int num = 1;
        for(int i = 1 ; i <= 100 ; i++){
            System.out.printf("%6d", num += 2);
            if(i % 10 == 0){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("--------------------------------");
        //Different approach to the same problem.
        num  = 1;
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 1 ; j <= 10 ; j++){
                System.out.printf("%6d",num += 2);
            }
            System.out.println();
        }
    }
}
/*
Output:
     3     5     7     9    11    13    15    17    19    21
    23    25    27    29    31    33    35    37    39    41
    43    45    47    49    51    53    55    57    59    61
    63    65    67    69    71    73    75    77    79    81
    83    85    87    89    91    93    95    97    99   101
   103   105   107   109   111   113   115   117   119   121
   123   125   127   129   131   133   135   137   139   141
   143   145   147   149   151   153   155   157   159   161
   163   165   167   169   171   173   175   177   179   181
   183   185   187   189   191   193   195   197   199   201

--------------------------------
    3    5    7    9   11   13   15   17   19   21
   23   25   27   29   31   33   35   37   39   41
   43   45   47   49   51   53   55   57   59   61
   63   65   67   69   71   73   75   77   79   81
   83   85   87   89   91   93   95   97   99  101
  103  105  107  109  111  113  115  117  119  121
  123  125  127  129  131  133  135  137  139  141
  143  145  147  149  151  153  155  157  159  161
  163  165  167  169  171  173  175  177  179  181
  183  185  187  189  191  193  195  197  199  201
 */
