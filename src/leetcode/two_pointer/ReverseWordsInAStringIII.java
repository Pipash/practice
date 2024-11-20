package src.leetcode.two_pointer;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String[] strArr = s.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            int left = 0, right = strArr[i].length();
            char[] chr = new char[right];
            while (left<right){
                chr[left] = strArr[i].charAt(right - 1);
                chr[right - 1] = strArr[i].charAt(left);
                right--;
                left++;
            }
            strArr[i] = String.valueOf(chr);
        }

        s = String.join(" ", strArr);

        System.out.println(s);
    }
}
