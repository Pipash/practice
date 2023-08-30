package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable<String> {

    String personName;
    MyCallable(String personName) {
        this.personName = personName;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "family member of "+this.personName+": Pipash, Anni, Annuha";
    }
}
public class CallableInterfaceDemo {
    public static void main(String[] args) {
        MyCallable c = new MyCallable("Pipash");
        FutureTask<String> ft = new FutureTask<>(c);
        Thread t1 = new Thread(ft);
        t1.start();
        try {
            System.out.println(ft.get());
        } catch (ExecutionException | InterruptedException ee){
            System.out.println(ee);
        }

    }
}
