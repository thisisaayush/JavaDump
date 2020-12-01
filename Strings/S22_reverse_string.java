package Interview_Coding_Questions.Strings;
//Using built-in function
public class S22_reverse_string {
    public static void main(String[] args) {
        String str = "Hello Aayush!";
        StringBuilder stb = new StringBuilder(str);
        stb.reverse();
        str = new String(stb);
        System.out.println(str);
    }
}
