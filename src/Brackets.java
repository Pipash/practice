

public class Brackets {
    public int isNested(String S) {
        // S = "[()}"
        int properlyNested = 1;
        if (S.length() == 0) {
            return 1;
        }
        if (S.charAt(0) == ')' || S.charAt(0) == ']' || S.charAt(0) == '}') {
            return 0;
        }

        for (int i = 0; i < (S.length() - 1); i++) {
            if (S.charAt(i) == '{') {
                if (S.charAt(i+1) == ')' || S.charAt(i+1) == ']') {
                    properlyNested = 0;
                }
            } else if (S.charAt(i) == '[') {
                if (S.charAt(i+1) == ')' || S.charAt(i+1) == '}') {
                    properlyNested = 0;
                }
            } else if (S.charAt(i) == '(') {
                if (S.charAt(i+1) == ']' || S.charAt(i+1) == '}') {
                    properlyNested = 0;
                }
            }
        }

        return properlyNested;
    }
}
