package Interview_Coding_Questions.Strings;
//Check whether two strings are equals or not(case insensitive), without using built in functions.
public class S15_case_insensitive {
    public static void main(String[] args) {
        String str1 = "Hello Aayush!";
        String str2 = "HelLo AaYusH!";

        if(check(str1,str2)){
            System.out.println("Strings are equal.");
        }
        else{
            System.out.println("Strings are not equal.");
        }
    }
    public static boolean check(String str1, String str2){
        boolean flag = true;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        if(str1.length() != str2.length()){
            flag = false;
        }
        else {
            for (int i = 0; i < str1.length() ; i++){
                if(ch1[i] != ch2[i] + 32 && ch1[i] != ch2[i] - 32 && ch1[i] != ch2[i]){
                    flag = false;
                }
            }
        }
        return flag;
    }
}
