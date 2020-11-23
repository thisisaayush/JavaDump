package Interview_Coding_Questions.Strings;

public class S11_switchCases {
    public static void main(String[] args) {
        String str = "Hello Aayush!";
        System.out.println(convert(str));
        System.out.println(convert("application"));
    }
    public static String convert(String str){
        char[] ch = str.toCharArray();

        for(int i = 0 ; i < str.length() ; i++){
            if(i % 2 == 0){
                if(ch[i] >= 65 && ch[i] <= 90){
                    ch[i] = (char)(ch[i] + 32);
                }
                else{
                    if(ch[i] >= 97 && ch[i] <= 122) {
                        ch[i] = ( char)(ch[i] - 32);
                    }
                }
            }
        }
        str = new String(ch);
        return str;
    }
}
