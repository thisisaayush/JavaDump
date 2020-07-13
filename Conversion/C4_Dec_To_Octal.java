package Conversion;

public class C4_Dec_To_Octal {
    public static void main(String[] args) {
        int dec = 3545;
        String oct = "";

        while (dec > 0){
            int rem = (int)dec % 8;
            oct = rem + oct;
            dec = dec / 8;
        }
        System.out.println("Octal: " + oct);
    }
}
