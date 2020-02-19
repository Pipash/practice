import java.util.*;
import java.util.Map.Entry;

public class StrMatch {
    /*public void solution () {
        String str = "hello everyone";
        System.out.println(str.matches("(.*)hello(.*)"));
    }*/

    public ArrayList<String> topNCompetitors(int numCompetitors,
                                             int topNCompetitors,
                                             List<String> competitors,
                                             int numReviews,
                                             List<String> reviews)
    {
        // WRITE YOUR CODE HERE
        ArrayList<String> topComp = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numCompetitors; i++) {
            hashMap.put(competitors.get(i), 0);
        }

        //System.out.println(hashMap);
        for (int i = 0; i < numReviews; i++) {
            for (int j = 0; j < numCompetitors; j++) {
                if (reviews.get(i).matches("(.*)"+competitors.get(j)+"(.*)")) {
                    hashMap.put(competitors.get(j), hashMap.get(competitors.get(j))+1);
                }
            }
        }
        //System.out.println(hashMap);

        Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String,Integer>>() {

            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                Integer v1 = e1.getValue();
                Integer v2 = e2.getValue();
                return v2.compareTo(v1);
            }
        };
        Set<Entry<String, Integer>> entries = hashMap.entrySet();

        // Sort method needs a List, so let's first convert Set to List in Java
        List<Entry<String, Integer>> listOfEntries = new ArrayList<Entry<String, Integer>>(entries);

        // sorting HashMap by values using comparator
        Collections.sort(listOfEntries, valueComparator);

        LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<String, Integer>(listOfEntries.size());

        // copying entries from List to Map
        for(Entry<String, Integer> entry : listOfEntries){
            sortedByValue.put(entry.getKey(), entry.getValue());
        }

        //System.out.println("HashMap after sorting entries by values ");
        Set<Entry<String, Integer>> entrySetSortedByValue = sortedByValue.entrySet();

        HashMap<String, Integer> sortedHashMap = new HashMap<>();
        int i = 1;
        for(Entry<String, Integer> mapping : entrySetSortedByValue){
            //System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
            if (i > topNCompetitors) {
                continue;
            }
            sortedHashMap.put(mapping.getKey(),mapping.getValue());
            i++;
        }


        TreeMap<String, Integer> sorted = new TreeMap<>(sortedHashMap);
        Set<Entry<String, Integer>> mappings = sorted.entrySet();

        for(Entry<String, Integer> mapping : mappings){
            //System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
            topComp.add(mapping.getKey());

        }
        //System.out.println(sortedHashMap);

        return topComp;
    }
}
