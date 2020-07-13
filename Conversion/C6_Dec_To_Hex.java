package Conversion;

public class C6_Dec_To_Hex {
    public static void main(String[] args) {
            int dec = 23467;
            String hex = "";

            while(dec > 0){
                int rem = dec % 16;
                hex = (Hexa( rem )) + hex;
                dec = dec / 16;
            }
        System.out.println("Hexadecimal: " + hex);
    }
    public static String Hexa(int num){
        String temp = "";

        if(num >= 0 && num <= 9){
            temp = temp + num;
        }
        else
        {
            temp = temp + (char)(num + 55);
        }
        return temp;
    }
}
