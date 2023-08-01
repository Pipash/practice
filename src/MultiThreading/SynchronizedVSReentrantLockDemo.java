package MultiThreading;

public class SynchronizedVSReentrantLockDemo {
    public static void main(String[] args) {
        Display display = new Display();
        DisplayNameThread t1 = new DisplayNameThread(display, "person1");
        DisplayNameThread t2 = new DisplayNameThread(display, "person2");
        t1.start();
        t2.start();
    }
}
