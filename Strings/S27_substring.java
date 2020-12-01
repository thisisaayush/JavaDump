package Interview_Coding_Questions.Strings;

public class S27_substring {
    public static void main(String[] args) {
        String str = "Hello Aayush!";

        for(int i = 1 ; i <= str.length() ; i++){
            System.out.println(str.substring(0,i));
        }
    }
}
