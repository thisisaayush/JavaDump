package Conversion;

public class C7_Hexa_To_Dec {
    public static void main(String[] args) {
            String hex = "5BAB";
            int dec = 0;
            int x = 1;

            for(int i = hex.length() - 1; i >= 0 ; i--){
                int tem = Deci( hex.charAt( i ));
                dec = dec + (tem * 16);
                x = x * 16;
            }
        System.out.println("Decimal: " + dec);
    }
    public static int Deci(char ch){
        int num = 0;

        if(ch >= 65 && ch <= 70){
            num =  (int)ch - 50;
        }
        else{
            num = (int)ch - 48;
        }
        return num;
    }
}
