package Pattern;

public class Pattern22 {
    public static void main(String[] args) {
        char ch = '*';
        for(int i = 1 ; i <= 100; i++){
            System.out.printf("%3c",ch);
            if(i % 10 == 0){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
        //Different approach to the same problem.
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 1 ; j <= 10 ; j++){
                System.out.printf("%3c",ch);
            }
            System.out.println();
        }
    }
}
