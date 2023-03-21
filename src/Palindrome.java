public class Palindrome {
    public static void main(String[] args) {
        String str = "aabcdcba";
        int j = str.length() -1;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) +" "+ str.charAt(j));
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("The word is not a palindrome");
                break;
            }
            if (i == j) {
                break;
            }
            j--;
        }
        System.out.println(str+" is a palindrome");
    }
}
