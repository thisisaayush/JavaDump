package Recursion;
//This program prints out the string length using recursion method.
public class R11_String_Length {
    static int len = 0;
    public static void main(String[] args) {
        String str = "Nepali";
        System.out.println("String length: " + stringLength( str ));
    }
    public static int stringLength(String str){
        int tlen = str.length();
        if(tlen == 0){
            return len;
        }
        len++;
        return stringLength( str.substring( 0,tlen - 1 ) );
    }
}
