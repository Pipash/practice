package src.leetcode.two_pointer;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        int i = 0;
        int j = s.length - 1;
        char c;

        while (i < j) {
            c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--;
        }

        System.out.println(s);
    }
}
