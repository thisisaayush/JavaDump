package Interview_Coding_Questions.Strings;

public class S63_sum_strings_number {
    public static void main(String[] args) {
        String str = "Hell9o Aa9yus5h!";
        System.out.println("Sum: " + sum(str));
    }
    public static int sum(String str){
        int sum = 0;

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if(ch >= '0' && ch <= '9'){
                sum += (str.charAt(i) - 48);
            }
        }
        return sum;
    }
}
