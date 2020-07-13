package Conversion;

public class C5_Octal_To_Dec {
    public static void main(String[] args) {
        int oct = 6731;
        int dec = 0;
        int x = 1;

        while(oct > 0){
            int rem = oct % 10;
            dec = dec + (rem * x);
            x = x * 8;
            oct = oct / 10;
        }
        System.out.println("Decimal: " + dec);
    }
}
