package src;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatch {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter Input: ");

        Pattern pattern = Pattern.compile("Y|N");
        Matcher matcher = pattern.matcher(input.next());

        if (matcher.matches()){
            System.out.println("Pattern matches");
        } else {
            System.out.println("Pattern does not match");
        }*/

        String a = "100000";
        if (a.length()< 7){
            StringBuffer strb = new StringBuffer(a);
            while (strb.length() < 7) {
                strb.insert(0,"0");
            }
            strb.insert(0,".");
            System.out.println(strb);
        }
    }
}
