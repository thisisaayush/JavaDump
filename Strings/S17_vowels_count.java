package Interview_Coding_Questions.Strings;

public class S17_vowels_count {
    public static void main(String[] args) {
        int array[] = new int[256];
        String str = "Hello Aayush!";
        for(int i = 0 ; i < str.length() ; i++){
            if(isVowels(str.charAt(i))){
                array[str.charAt(i)]++;
            }
        }
        for(int i = 0 ; i < 256 ; i++){
            if(array[i] != 0){
                System.out.println((char)(i) + " " + array[i]);
            }
        }
    }
    public static boolean isVowels(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'
                || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}
