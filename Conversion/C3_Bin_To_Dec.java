package Conversion;

public class C3_Bin_To_Dec {
    public static void main(String[] args) {
        double bin =  10011110000d;
        double dec = 0;
        int x = 1;

        while(bin > 0){
            int rem = (int)bin % 10;
            dec = dec + rem * x;
            x = x * 2;
            bin = bin / 10;
        }
        System.out.println("Decimal: " + dec);
    }
}
