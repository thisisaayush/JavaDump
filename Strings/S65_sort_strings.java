package Interview_Coding_Questions.Strings;

import java.util.Arrays;

public class S65_sort_strings {
    public static void main(String[] args) {
        String str = "Hello Aayush!";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        System.out.println("After sorting: " + new String(arr));
    }
}
