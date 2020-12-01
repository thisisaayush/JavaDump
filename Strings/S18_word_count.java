package Interview_Coding_Questions.Strings;

public class S18_word_count {
    public static void main(String[] args) {
     String str = "Hello Aayush!";
     int count = 1;//count is initialized to 1 because sentence doesn't starts and ends with
                   // white space. And here, we are counting white space. As an example, in
                    // in two words sentence, there is only 1 white space.

     for(int i = 0 ; i < str.length() ; i++){
         if(str.charAt(i) == ' '){
             count++;
         }
     }
        System.out.println("Total number of words: " + count);
    }
}
