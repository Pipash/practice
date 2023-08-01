package MultiThreading.Threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable{

    String name;
    MyRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("The Thread "+Thread.currentThread().getName()+" prints the name "+this.name);
        try{
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println("printing complete by Thread "+ Thread.currentThread().getName());
    }
}

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        // to start a thread implemented by runnable interface
        /*MyRunnable r1 = new MyRunnable("Pipash");
        Thread t1 = new Thread(r1);
        t1.start();*/

        // using of threadpool/ executor service
        MyRunnable[] jobs = {
                new MyRunnable("Pipash"),
                new MyRunnable("Anni"),
                new MyRunnable("Annuha")
        };

        ExecutorService service = Executors.newFixedThreadPool(2);
        for (MyRunnable job : jobs) {
            service.submit(job);
        }
        service.shutdown();
    }
}
