package Interview_Coding_Questions.Strings;

public class S28_substring {
    public static void main(String[] args) {
        String str = "Hello Aayush!";

        for(int i = 0 ; i <str.length() ; i++){
            for(int j = i + 1 ; j <= str.length() ; j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
