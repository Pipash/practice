package MultiThreading.Threadpool;

import java.util.concurrent.*;

class CallableInterfaceImpl implements Callable{
    Integer number;
    CallableInterfaceImpl(Integer number){
        this.number = number;
    }

    @Override
    public Object call() throws Exception {
        System.out.print(Thread.currentThread().getName()+" executing the sum:");
        Integer sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += number;
        }
        return sum;
    }
}

public class CallableThreadpoolDemo {
    public static void main(String[] args) {
        CallableInterfaceImpl[] impls = {
                new CallableInterfaceImpl(10),
                new CallableInterfaceImpl(20),
                new CallableInterfaceImpl(30),
                new CallableInterfaceImpl(40),
                new CallableInterfaceImpl(100),
        };

        ExecutorService service = Executors.newFixedThreadPool(3);
        for (CallableInterfaceImpl impl : impls) {
            Future ft = service.submit(impl);
            try {
                System.out.println(ft.get());
            } catch (ExecutionException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        service.shutdown();
    }
}
