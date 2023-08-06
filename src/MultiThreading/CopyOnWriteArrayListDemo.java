package MultiThreading;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo extends Thread{
    // normal ArrayList will through concurrentModificationException
    // can not remove anything from CopyOnWriteArrayList, because it will through exception unsupportedOperationException
    static CopyOnWriteArrayList<String> cowAl = new CopyOnWriteArrayList<>();

    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println("updating arrayList from child thread");
        cowAl.add("abcd");
    }

    public static void main(String[] args) {
        cowAl.add("a");
        cowAl.add("b");
        CopyOnWriteArrayListDemo t1 = new CopyOnWriteArrayListDemo();
        t1.start();
        for (String s : cowAl) {
            System.out.println("value of cowAL " + s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
        System.out.println(cowAl);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println(cowAl);
    }
}
