package Threads.Exercise_3_2;

public class ThreadTester {
    public static void main(String[] args) {
        MsgPrinter thePrinter = new MsgPrinter();
        Thread thread1 = new Thread(new MsgGenerator(thePrinter, "You've"), "Thread 1");
        Thread thread2 = new Thread(new MsgGenerator(thePrinter, "gotter be"), "Thread 2");
        Thread thread3 = new Thread(new MsgGenerator(thePrinter, "kidding!"), "Thread 3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}