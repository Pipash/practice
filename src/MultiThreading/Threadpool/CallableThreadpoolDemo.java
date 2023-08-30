package MultiThreading.Threadpool;

import java.util.concurrent.*;

class CallableInterfaceImpl implements Callable<Integer>{
    Integer number;
    CallableInterfaceImpl(Integer number){
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        System.out.print(Thread.currentThread().getName()+" executing the sum:");
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += number;
        }
        Thread.sleep(1000);
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
                new CallableInterfaceImpl(50),
                new CallableInterfaceImpl(600),
                new CallableInterfaceImpl(60),
                new CallableInterfaceImpl(6),
                new CallableInterfaceImpl(7),
                new CallableInterfaceImpl(8),
                new CallableInterfaceImpl(101),
        };

        ExecutorService service = Executors.newFixedThreadPool(3);
        for (CallableInterfaceImpl impl : impls) {
            Future<Integer> ft = service.submit(impl);
            try {
                System.out.println(ft.get());
            } catch (ExecutionException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        service.shutdown();
    }
}
