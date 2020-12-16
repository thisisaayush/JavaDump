package Interview_Coding_Questions.Strings;

public class S58_remove_uppercase {
    public static void main(String[] args) {
        String str = "Hello Aayush!";
        System.out.println(remove_upperCase(str));
    }
    public static String remove_upperCase(String str){
        str = str.replaceAll("[A-Z]","");
        return str;
    }
}
