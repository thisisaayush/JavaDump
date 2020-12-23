package Interview_Coding_Questions.Strings;

public class S68_remove_repeated_characters {
    public static void main(String[] args) {
        String str = "Hello Aaayush!";
        int[] array = new int[256];

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) != ' ')//it means, program is not counting white spaces.
            {
                array[str.charAt(i)]++;//just counting characters
            }
        }

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) != ' '){
                if(array[str.charAt(i)] != 0){
                    System.out.print(str.charAt(i));
                    array[str.charAt(i)] = 0;
                }
            }
            //prints white spaces.
            else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
