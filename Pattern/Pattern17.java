package Pattern;

public class Pattern17 {
    public static void main(String[] args) {
        char ch = 'a';
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= 5 ; j++){
                System.out.printf("%3c",ch++);
            }
            System.out.println();
        }
    }
}
