package Conversion;
//The program converts decimal number to binary number.
public class C2_Dec_To_Bin {
    public static void main(String[] args) {
        int dec = 1264;
        String str = "";

        while(dec > 0){
            int rem = (int) dec % 2;
            str = rem + str ;
            dec = dec / 2;
        }
        System.out.println("Binary: " + str);
    }
}
