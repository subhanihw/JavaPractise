package MultiThreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<CallableTask> tasks = List.of(new CallableTask("Naruto"),
                new CallableTask("Sasuke"),
                new CallableTask("Itachi"));

//        List<Future<String>> results = executorService.invokeAll(tasks);
//
//        for (Future<String> result: results) {
//            System.out.println(result.get());
//        }

        String res = executorService.invokeAny(tasks);
        System.out.println(res);
        executorService.shutdown();
    }
}
