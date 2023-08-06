package MultiThreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo  extends Thread{
    // ConcurrentHashMap will not throw ConcurrentModificationException
    // null key and value are not allowed in ConcurrentHashMap
    static ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
    // in Hashmap updating map when used by other thread will throw java.util.ConcurrentModificationException
    //static HashMap<Integer, String> chm = new HashMap<>();

    public void run() {
        try{
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        chm.put(103, "c");
    }

    public static void main(String[] args) {
        chm.put(101, "a");
        chm.put(102, "b");

        ConcurrentHashMapDemo t1 = new ConcurrentHashMapDemo();
        t1.start();
        Set<Integer> s = chm.keySet();
        for (Integer key : s) {
            System.out.println("entry is: key=" + key + " value=" + chm.get(key));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
        System.out.println(chm);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println(chm);
    }
}
