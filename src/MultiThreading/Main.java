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
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.start();

        Task2 task2 = new Task2();
        Thread thread = new Thread(task2);
        thread.start();

        System.out.println("\nTask 3 Started");
        IntStream.range(301, 401).forEach(s -> System.out.print(s + " "));
        System.out.println("\nTask 3 Completed");
    }
}
