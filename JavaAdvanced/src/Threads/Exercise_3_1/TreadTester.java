package Threads.Exercise_3_1;

public class TreadTester {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program starting");
        Thread thread1 = new Thread(new Task(), "Thread 1");
        Thread thread2 = new Thread(new Task(), "Thread 2");
        Thread thread3 = new Thread(new Task(), "Thread 3");
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("Count = " + Task.count);
        System.out.println("Program end");
    }
}