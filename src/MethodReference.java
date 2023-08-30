import java.util.Arrays;
import java.util.List;

interface Parser{
    public String parse(String str);
}

class StringConversion{
    public static String convertToLower(String str) {
        return str.toLowerCase();
    }
    
    public static String convertToUpper( String str) {
        return str.toUpperCase();
    }
    
    /*public static String convertSpacesToHyphen(String str) {

    }*/
}

public class MethodReference {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("str1", "str2", "str3", "str5", "str6");

    }
}
