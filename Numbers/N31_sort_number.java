package Interview_Coding_Questions.Numbers;

import java.util.Arrays;

public class N31_sort_number {
    public static void main(String[] args) {
        int n = 838210;
        String str = String.valueOf(n);
        char[] array = str.toCharArray();

        Arrays.sort(array);
        str = new String(array);
        n = Integer.parseInt(str);
        System.out.println(n);
        System.out.println(n * 11);
    }
}
