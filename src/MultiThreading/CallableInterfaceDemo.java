package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable {

    String personName;
    MyCallable(String personName) {
        this.personName = personName;
    }
    @Override
    public Object call() throws Exception {
        Thread.sleep(5000);
        return "family member of "+this.personName+": Pipash, Anni, Annuha";
    }
}
public class CallableInterfaceDemo {
    public static void main(String[] args) {
        MyCallable c = new MyCallable("Pipash");
        FutureTask ft = new FutureTask(c);
        Thread t1 = new Thread(ft);
        t1.start();
        try {
            System.out.println(ft.get());
        } catch (ExecutionException | InterruptedException ee){
            System.out.println(ee);
        }

    }
}
