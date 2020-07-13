package Conversion;

public class C11_Bin_To_Hexa {
    public static void main(String[] args) {
            double bin = 100001100010110d;
            int dec = binToDec( bin );
            String hex = decToHex( dec );

        System.out.println("Decimal: " + dec);
        System.out.println("Hexadecimal: " + hex);

    }
    public static int binToDec(double bin){
        int dec = 0;
        int x = 1;

        while(bin > 0){
            int rem = (int)bin % 10;
            dec = dec + rem * x;
            x = x * 2;
            bin = bin / 10;
        }
        return dec;
    }
    public static String decToHex(int dec){
        String hex = "";

        while(dec > 0){
            int rem = dec % 16;
            hex = Hex( rem ) + hex;
            dec = dec / 16;
        }
        return hex;
    }

    public static String Hex(int num) {
        String temp = "";

        if(num >= 0 && num <= 9 ){
            temp = temp + num;
    }
        else {
            temp = temp + (char) (num + 55);
        }
        return temp;
    }
}
