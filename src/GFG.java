import java.util.HashMap;
import java.util.Map;

class GFG{

    public static String getPalindrome(String str)
    {

        // Store counts of characters
        HashMap<Character, Integer> counting = new HashMap<>();
        for(char ch : str.toCharArray())
        {
            if (counting.containsKey(ch))
            {
                counting.put(ch, counting.get(ch) + 1);
            }
            else
            {
                counting.put(ch, 1);
            }
        }


        /* Find the number of odd elements.
        Takes O(n) */
        int oddCount = 0;
        char oddChar = 0;

        for(Map.Entry<Character, Integer> itr : counting.entrySet())
        {

            if (itr.getValue() % 2 != 0)
            {
                oddCount++;
                oddChar = itr.getKey();
            }
        }
     
    /* odd_cnt = 1 only if the length of
    str is odd */
        if (oddCount > 1 || oddCount == 1 && str.length() % 2 == 0)
        {
            return "NO PALINDROME";
        }

        System.out.println(counting);
        /* Generate first half of palindrome */
        String firstHalf = "", lastHalf = "";
        int steps = 0;
        int itrtion = counting.size();
        HashMap<Character, Integer> mapLast = new HashMap<>();

        for(Map.Entry<Character, Integer> itr : counting.entrySet())
        {
            if (itrtion == 1) {
                mapLast.put(itr.getKey(), itr.getValue());
                break;
            }

            itrtion--;
            // Build a string of floor(count/2)
            // occurrences of current character
            String ss = "";
            System.out.println(itr.getValue());
            for(int i = 0; i < itr.getValue() / 2; i++)
            {
                ss += itr.getKey();
            }

            // Attach the built string to end of
            // and begin of second half
            firstHalf = firstHalf + ss;
            lastHalf = ss + lastHalf;
            System.out.printf("%s, %s \n",firstHalf, lastHalf);
            steps++;
        }

        /*String ss = "";
        for(int i = 0; i < mapLast.size() / 2; i++)
        {
            ss += mapLast
        }*/

        /*if (oddChar > 1) {
            steps++;
        }*/
        for (int i = 0; i < oddChar; i++) {
            steps++;
        }
        System.out.println("odds "+oddChar);
        System.out.println("steps "+steps);

        // Insert odd character if there
        // is any
        return (oddCount == 1) ?
                (firstHalf + oddChar + lastHalf) :
                (firstHalf + lastHalf);
    }

    // Driver code
    public static void main(String[] args)
    {
        //String str = "101000";
        String str = "0100101";
        System.out.println("pal "+getPalindrome(str));
    }
}