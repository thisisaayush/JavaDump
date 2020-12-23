package Interview_Coding_Questions.Strings;

public class S66_sort_string_ascending {
    public static void main(String[] args) {
        String str = "Hello Aayush!";
        char[] array = str.toCharArray();

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array.length - 1 ; j++){
                if(array[j] > array[j + 1]){
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("After sorting: " + new String(array));
    }
}
