import java.util.HashMap;

public class GenomicRangeQuery {
    public int[] minimalImpact(String S, int[] P, int[] Q) {
        int[] impacts = {};
        HashMap<Character, Integer> hashedString = new HashMap<>();
        HashMap<Character, Integer> gnomeSequence = new HashMap<Character, Integer>(){{
            put('A',1);
            put('C',2);
            put('G',3);
            put('T',4);
        }};
        for (int i = 0; i < S.length(); i++) {
            //hashedString.put(S.charAt(i), )
        }

        return impacts;
    }
}
