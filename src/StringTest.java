package src;

public class StringTest {
    public static void main(String[] args) {
        String str = "abcd";
        StringTest strTest = new StringTest();
        strTest.changeString(str);
        System.out.println("after process");
        System.out.println(str);

    }

    public void changeString(String str) {
        str = str + " new string.";
        System.out.println(str);
    }
}
