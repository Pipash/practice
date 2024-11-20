package src.leetcode.two_pointer;

import java.util.Arrays;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        //System.out.println((int) 'A' + " "+ (int) 'z');
        String s = "a-bC-dEf-ghIj";
        int left = 0, right  = s.length() - 1;
        char[] chrArr = s.toCharArray();
        //System.out.println(Arrays.toString(chrArr)+" "+right);
        int count = 1;
        while (left <= right) {
            //chrArr[left] = s.charAt(left);
            //chrArr[right] = s.charAt(right);
            System.out.println(count+" "+"1st "+left+" "+right);
            int leftAscii = s.charAt(left);
            char leftValue = s.charAt(left);
            int rightAscii = s.charAt(right);
            char rightValue = s.charAt(right);
            if (leftAscii >= 65 && leftAscii <= 122) {
                chrArr[right] = leftValue;
                //System.out.println(leftValue+" "+right);
                right--;
                //System.out.println(s.charAt(left));
            } else {
                left++;
            }
            System.out.println(count+" "+"2nd "+left+" "+right);
            if (rightAscii >= 65 && rightAscii <= 122) {
                chrArr[left] = rightValue;
                left++;
            } else {
                right--;
            }
            //left++;
            //right--;
            System.out.println(count+" "+"3rd "+left+" "+right);
            count++;
        }


        s = String.valueOf(chrArr);
        System.out.println(s);
    }
}
