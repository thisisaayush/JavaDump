package Interview_Coding_Questions.Strings;

public class S49_character_frequency {
    public static void main(String[] args) {
            character_frequency("Hello Aayush!");
    }
    public static void character_frequency(String str){
        int[] array = new int[256];

        for(int i = 0 ; i < str.length() ; i++){
            array[str.charAt(i)]++;
        }

        for(int i = 0 ; i < 256 ; i++ ) {
            if (array[i] > 0) {
                System.out.println("Character " + (char) i + ": " + array[i]);
            }
        }
    }
}
