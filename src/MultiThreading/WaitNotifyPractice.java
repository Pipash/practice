package MultiThreading;

class ChildThread extends Thread{
    int total = 0;

    public void run() {
        synchronized (this) {
            System.out.println("child thread starts calculating");
            for (int i = 1; i<=100; i++){
                total += i;
            }
            System.out.println("Child thread giving notification after completion of calculation");
            this.notify();
        }
    }
}

public class WaitNotifyPractice {
    public static void main(String[] args) {
        ChildThread ct = new ChildThread();
        ct.start();
        synchronized (ct){
            System.out.println("Main thread starts waiting for child thread result");
            try {
                ct.wait();
                System.out.println("Main thread got notification");
                System.out.println("printing result "+ct.total);
            } catch (InterruptedException e) {
                System.out.println("exception from calling wait "+e);
            }

        }

    }
}
