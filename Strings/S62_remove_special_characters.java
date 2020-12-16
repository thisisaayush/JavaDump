package Interview_Coding_Questions.Strings;

public class S62_remove_special_characters {
    public static void main(String[] args) {
        String str = "Hello Aayush!=&^(;";
        System.out.println(remove_special_characters(str));
    }
    public static String remove_special_characters(String str){
        //special_ch string here will have special characters like !@%()
        String special_ch = str.replaceAll("[a-z,A-Z]","");
        str = str.replaceAll("["+special_ch+"]","");
        return str;
    }
}
