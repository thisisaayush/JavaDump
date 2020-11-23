package Interview_Coding_Questions.Strings;

public class S8_toUpperCase {
    public static void main(String[] args) {
        String str = "Hello Aayush!";
        System.out.println(convert(str));
    }
    public static String convert(String str){
        char[]ch = str.toCharArray();

        for(int i = 0 ; i < str.length() ; i++){
            if(ch[i] >= 97 && ch[i] <= 122){
                ch[i] = (char)(ch[i] - 32);
            }
        }
        str = new String(ch);
        return str;
    }
}
