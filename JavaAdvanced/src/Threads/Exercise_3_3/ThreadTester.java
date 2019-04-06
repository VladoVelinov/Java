package Threads.Exercise_3_3;

public class ThreadTester {
    public static void main(String[] args) {
        MsgChannel theChannel = new MsgChannel();
        Thread prod1 = new Thread(new MsgProducer(theChannel), "Producer 1");
        Thread prod2 = new Thread(new MsgProducer(theChannel), "Producer 2");
        Thread prod3 = new Thread(new MsgProducer(theChannel), "Producer 3");
        Thread consumer = new Thread(new MsgConsumer(theChannel));
        prod1.start();
        prod2.start();
        prod3.start();
        consumer.start();
    }
}
