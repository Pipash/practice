public class FirstReverse {
    public static String Reverse(String str) {
        // code goes here
        String[] strArray = str.split("");
        int length = strArray.length - 1;
        StringBuilder sb = new StringBuilder();
        while (length >= 0) {
            sb.append(strArray[length]);
            length--;
        }
        str = sb.toString();

        return str;
    }
}
