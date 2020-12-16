package Interview_Coding_Questions.Strings;

public class S59_remove_lowerCase {
    public static void main(String[] args) {
        String str = "Hello AayUsh!";
        System.out.println(remove_lowerCase(str));
    }
    public static String remove_lowerCase(String str){
        str = str.replaceAll("[a-z]","");
        return str;
    }
}
