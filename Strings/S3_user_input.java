package Interview_Coding_Questions.Strings;

import java.util.Scanner;

public class S3_user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.next();
        System.out.println("Hello " + name + "!");
    }
}
