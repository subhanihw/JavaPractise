package MultiThreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

class Task extends Thread {
    private final int number;

    public Task(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Task" + number +" Started");
        IntStream.range(100 * number, 100 * number + 99).forEach(s -> System.out.print(s + " "));
        System.out.println("Task" + number +" Completed");
    }
}

public class ExecutorServiceRunner {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));
        executorService.execute(new Task(8));

        executorService.shutdown();
    }
}
