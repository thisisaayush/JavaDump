package Interview_Coding_Questions.Strings;

public class S21_reverse_string {
    public static void main(String[] args) {
        String str = "Hello Aayush!";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        char[] rev = str.toCharArray();
        int y = str.length() - 1;
        for(int i = 0 ; i < str.length()/2 ; i++){
            char tem = rev[i];
            rev[i] = rev[y];
            rev[y] = tem;
            y = y - 1;
        }
        str = new String(rev);
        return str;
    }
}
