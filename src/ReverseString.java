import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] str = {'h','e','l','l','o'};
        int i = 0;
        int j = str.length -1;
        while (i < j) {
            char ith = str[i];
            str[i] = str[j];
            str[j] = ith;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(str));
    }
}
