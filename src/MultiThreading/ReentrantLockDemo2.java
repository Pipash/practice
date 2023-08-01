package MultiThreading;

import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread{
    // if the lock made as static then despite of making different thread object reference
    // lock is given to synchronously to the references..
    // if the lock is not static then different thread object reference of same thread can continue happily
    // simultaneously. because though the thread is same but the reference objects are different.
    static ReentrantLock l = new ReentrantLock();
    MyThread(String name) {
        super(name);
    }
    public void run() {
        if (l.tryLock()) {
            System.out.println(Thread.currentThread().getName()+" got lock and performing safe operation");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
            l.unlock();
        } else {
            System.out.println(Thread.currentThread().getName()+" unable to get the lock. some other thread is operating. please wait.");
        }
    }
}

public class ReentrantLockDemo2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("first thread");
        MyThread t2 = new MyThread("second thread");
        t1.start();
        t2.start();
    }
}
