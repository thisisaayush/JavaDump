package Conversion;

public class C8_Bin_To_Oct {
    public static void main(String[] args) {
        int bin = 101001;
        int dec = binToDeci( bin );
        System.out.println("Decimal: " + dec);
        System.out.println("Octal: " + decToOctal( dec ));

    }
    public static int binToDeci(int bin){
        int dec = 0;
        int x = 1;
        while (bin > 0){
            int rem = bin % 10;
            dec = dec + rem * x;
            x = x * 2;
            bin = bin / 10;
        }
        return dec;
    }
    public static String decToOctal(int dec){
        String oct = "";

        while(dec > 0){
            int rem = dec % 8;
            oct = rem + oct;
            dec = dec / 8;
        }
        return oct;
    }
}
