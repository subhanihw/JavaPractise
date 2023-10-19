package MultiThreading;

import java.util.stream.IntStream;

class Task1 extends Thread {
    public void run() {
        System.out.println("\nTask 1 Started");
        IntStream.range(101, 201).forEach(s -> System.out.print(s + " "));
        System.out.println("\nTask 1 Completed");
    }
}

class Task2 implements Runnable
{
    @Override
    public void run() {
        System.out.println("\nTask 2 Started");
        IntStream.range(201, 301).forEach(s -> System.out.print(s + " "));
        System.out.println("\nTask 2 Completed");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Task1 task1 = new Task1();
        task1.setPriority(1);
        task1.start() ;

        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();

        // wait for task1 and task2 completed. After that execute task 3
        task1.join();
        task2Thread.join();

        System.out.println("\nTask 3 Started");
        IntStream.range(301, 401).forEach(s -> System.out.print(s + " "));
        System.out.println("\nTask 3 Completed");
    }
}
