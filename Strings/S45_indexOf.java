package Interview_Coding_Questions.Strings;

public class S45_indexOf {
    public static void main(String[] args) {
            printIndex("Hello Aayush!");
    }
    public static void printIndex(String str){
        for(int i = 65 ; i <= 90 ; i++){
            if(str.indexOf((char)i) != -1) {
                System.out.println("Index of " + (char) (i) + ": " + str.indexOf((char) i));
            }
        }

        for(int i = 97 ; i <= 122 ; i++){
            if(str.indexOf((char)i) != -1) {
                System.out.println("Index of " + (char) (i) + ": " + str.indexOf((char) i));
            }
        }
    }
}
