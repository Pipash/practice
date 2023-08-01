package MultiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
    //non synchronized
    /*public void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning: ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
            System.out.println(name);
        }
    }*/

    //non synchronized
    /*public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning: ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
            System.out.println(name);
        }
    }*/

    // using reentrant lock
    ReentrantLock l = new ReentrantLock();
    public void wish(String name) {
        l.lock();
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning: ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
            System.out.println(name);
        }
        l.unlock();
    }
}
