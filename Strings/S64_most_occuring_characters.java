package Interview_Coding_Questions.Strings;

public class S64_most_occuring_characters {
    public static void main(String[] args) {
        String str = "Hello Aayush!";
        int max = Integer.MIN_VALUE;
        int ch = 0;
        int array[] = new int[256];

        for(int i = 0 ; i < str.length() ; i++){
            array[str.charAt(i)]++;
        }

        for(int i = 0 ; i < 256 ; i++){
            if(array[i] >= max){
                max = array[i];
                ch = i;
            }
        }
        System.out.println("Most occuring character is " + (char)ch + ", " + max + ".");
    }
}
