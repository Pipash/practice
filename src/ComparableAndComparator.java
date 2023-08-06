import java.util.Comparator;
import java.util.TreeSet;

public class ComparableAndComparator {
    public static void main(String[] args) {
        // treeSet implements SortedSet Interface
        // example of comparable which sort in default natural sorting order which is ascending order
        TreeSet<Integer> t1 = new TreeSet<>();
        t1.add(10);
        t1.add(2);
        t1.add(0);
        t1.add(12);
        t1.add(23);
        System.out.println(t1);

        // example of comparator which sort in customized sorting order
        TreeSet<Integer> t2 = new TreeSet<Integer>(new MyComparator());
        t2.add(10);
        t2.add(2);
        t2.add(0);
        t2.add(12);
        t2.add(23);
        System.out.println(t2);


    }
}

class MyComparator implements Comparator{

    @Override
    public int compare(Object o, Object t1) {
        Integer i1 = (Integer) o;
        Integer i2 = (Integer) t1;

        if (i1 < i2) {
            return 1;
        } else if (i1 > i2) {
            return -1;
        } else {
            return 0;
        }

        // in short above code can be written as
        // return i2.compareTo(i1);
    }
}
