package Interview_Coding_Questions.Strings;

public class S50_count {
    public static void main(String[] args) {
            String str = "Hello Aayush!, How are you?33";
            int numbers = 0, vowels = 0, consonants = 0, others = 0;

            for(int i = 0 ; i < str.length() ; i++){
                char ch = str.charAt(i);
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    numbers++;
                }
                else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                    vowels++;
                }
                else if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
                    consonants++;
                }
                else{
                    others++;
                }
            }
        System.out.println("Numbers: " + numbers);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Others: " + others);
    }
}
