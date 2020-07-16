package Recursion;
//The program returns the product of all digits of a given number.
public class R9_Product_Of_Digit {
    static int product = 1;
    public static void main(String[] args) {
        System.out.println("Product: " + productDigit( 123 ));
    }
    public static int productDigit(int num){
        if(num == 0){
            return product;
        }
        product = product * (num % 10);
        return productDigit( num / 10 );
    }

}
