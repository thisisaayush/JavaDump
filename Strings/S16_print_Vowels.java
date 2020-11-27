package Interview_Coding_Questions.Strings;

public class S16_print_Vowels {
    public static void main(String[] args) {
        String str = "Hello Aayush!";

        for(int i = 0 ; i < str.length() ; i++){
            if(isVowels(str.charAt(i))){
                System.out.print(str.charAt(i) + " ");
            }
        }

    }
    public static boolean isVowels(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'
                || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                return true;
        }
        return false;
    }
}
