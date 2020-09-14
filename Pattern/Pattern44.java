package Pattern;
//The program prints the character '*'.
public class Pattern44 {
    public static void main(String[] args) {
        char ch = '*';
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 10 ; j >= i ; j--){
                System.out.printf("%3c",ch);
            }
            System.out.println();
        }
    }
}
