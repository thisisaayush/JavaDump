package Conversion;

public class C9_Octal_To_Binary {
    public static void main(String[] args) {
        int oct = 3241426;
        int dec = octalToDec( oct );
        System.out.println("Decimal: " + octalToDec( oct ));
        System.out.println("Binary: " + decToBin( dec ));
    }
    public static int octalToDec(int oct){
        int dec = 0;
        int x = 1;

        while(oct > 0){
            int rem = oct % 10;
            dec = dec + rem * x;
            x = x * 8;
            oct = oct / 10;
        }
        return dec;
    }

    public static String decToBin(int dec){
        String bin = "";

        while (dec > 0){
            int rem = dec % 2;
            bin  = rem + bin;
            dec = dec / 2;
        }
        return bin;
    }


}
